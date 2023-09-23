package com.fabbe50.witherskeletonnds;

import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.EntityEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class WitherSkeletonNoDropSword
{
	public static final String MOD_ID = "wsnds";

	public static void init() {
		EntityEvent.LIVING_DEATH.register((entity, cause) -> {
			if (entity instanceof WitherSkeleton witherSkeleton) {
				if (witherSkeleton.getMainHandItem().is(Items.STONE_SWORD)) {
					witherSkeleton.setItemSlot(EquipmentSlot.MAINHAND, ItemStack.EMPTY);
				}
			}
			return EventResult.pass();
		});
	}
}
