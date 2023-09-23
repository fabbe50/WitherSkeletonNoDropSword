package com.fabbe50.witherskeletonnds.fabric;

import com.fabbe50.witherskeletonnds.WitherSkeletonNoDropSword;
import net.fabricmc.api.ModInitializer;

public class WitherSkeletonNoDropSwordFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("Starting Fabric");
        WitherSkeletonNoDropSword.init();
    }
}