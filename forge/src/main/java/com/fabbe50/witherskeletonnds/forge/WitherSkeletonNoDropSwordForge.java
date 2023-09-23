package com.fabbe50.witherskeletonnds.forge;

import dev.architectury.platform.forge.EventBuses;
import com.fabbe50.witherskeletonnds.WitherSkeletonNoDropSword;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WitherSkeletonNoDropSword.MOD_ID)
public class WitherSkeletonNoDropSwordForge {
    public WitherSkeletonNoDropSwordForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(WitherSkeletonNoDropSword.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        WitherSkeletonNoDropSword.init();
    }
}