package com.enwash.ether.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EthereumOre extends BlockBase {

	public EthereumOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(0F);
	}

}
