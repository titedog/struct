
<p align="center">
  <img src="https://user-images.githubusercontent.com/71283197/213920742-40ceeba7-4c84-4fe9-8f12-cb8705166e3e.png" />
</p>

# struct
A general-purpose library for modders to use.

# releases
For now, I will be releasing 2 main types of releases, *Releases* and *Debug* (Preview) releases. Debug releases are mainly for me to test if things are working (especially since I am very new to Jitpack and I'm not extremely experienced with Github), and major releases will just go under the *Releases* tag.

# use
I have provided a table below with how to include this in your minecraft fabric mods:

### features

* Sticky Block Registry (e.g. Honey & Slime blocks)
* Custom Spectator Shader for entities (similar to Enderman, Spider, and Creeper shaders)

## include the desired version
### releases
If you want to use the latest *Released* version, make sure to include this in your `build.gradle` under `dependencies`:
```
modImplementation('com.github.titedog:struct:Released')
```

If you want Jar-In-Jar, then add `include` to your implementation:
```
include(modImplementation('com.github.titedog:struct:Released'))
```

### debug
If you want to use the latest *Debug* version, make sure to include this in your `build.gradle` under `dependencies`:
```
modImplementation('com.github.titedog:struct:Debug')
```

If you want Jar-In-Jar, then add `include` to your implementation:
```
include(modImplementation('com.github.titedog:struct:Debug'))
```

## errors
If you are unsure about what version to implement, or there is a mistake in the above text, you can check out the *Jitpack* page for struct [here](https://jitpack.io/#titedog/struct).
