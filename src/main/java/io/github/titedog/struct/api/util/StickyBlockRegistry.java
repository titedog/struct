package io.github.titedog.struct.api.util;


import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.ArrayList;

public class StickyBlockRegistry {
    public static final ArrayList<Block> STICKY_BLOCKS = new ArrayList<>();

    static {
        STICKY_BLOCKS.add(Blocks.SLIME_BLOCK);
        STICKY_BLOCKS.add(Blocks.HONEY_BLOCK);
    }
}