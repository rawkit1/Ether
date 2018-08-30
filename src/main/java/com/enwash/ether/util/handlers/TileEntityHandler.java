package com.enwash.ether.util.handlers;

import com.enwash.ether.blocks.extractor.TileEntityEtherealExtractor;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
	
	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityEtherealExtractor.class, "ethereal_extractor");
	}
}
