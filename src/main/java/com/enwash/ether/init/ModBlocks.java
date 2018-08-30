package com.enwash.ether.init;

import java.util.ArrayList;
import java.util.List;

import com.enwash.ether.blocks.BlockBase;
import com.enwash.ether.blocks.EthereumOre;
import com.enwash.ether.blocks.extractor.EtherealExtractor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ETHEREUM_ORE = new EthereumOre("ethereum_ore", Material.IRON);
	public static final Block ETHEREAL_EXTRACTOR = new EtherealExtractor("ethereal_extractor", Material.IRON);
}
