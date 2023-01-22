package io.github.titedog.struct.mixin;

import io.github.titedog.struct.Struct;
import net.minecraft.client.gui.screen.ConfirmChatLinkScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.widget.PressableTextWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public abstract class MixinTitleScreen extends Screen {
    @Unique
    private static final String REPOSITORY = "https://github.com/titedog/struct";

    private MixinTitleScreen(Text title) {
        super(title);
    }

    @Inject(method = "render", at = @At("TAIL"))
    private void struct$renderTitleLabel(MatrixStack matrices, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        int w = textRenderer.getWidth("struct" + Struct.VERSION);
        int x = width - w - 2;
        addDrawableChild(new PressableTextWidget(x, this.height - 20, w, 10, new LiteralText("struct" + Struct.VERSION), (button) -> {
            if(client != null) {
                client.setScreen(new ConfirmChatLinkScreen((confirmed) -> {
                    if(confirmed) {
                        Util.getOperatingSystem().open(REPOSITORY);
                    }

                    this.client.setScreen(this);
                }, REPOSITORY, true));
            }
        }, textRenderer));
    }
}