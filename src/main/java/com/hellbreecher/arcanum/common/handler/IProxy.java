package com.hellbreecher.arcanum.common.handler;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public interface IProxy {
	
	void init();
	World getClientWorld();
	PlayerEntity getClientPlayer();
	
}