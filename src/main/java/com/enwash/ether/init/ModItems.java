package com.enwash.ether.init;


import java.util.ArrayList;
import java.util.List;

import com.enwash.ether.items.ItemBase;
import com.enwash.ether.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// MATERIALS
	public static final ToolMaterial MATERIAL_ETH_SWORD = EnumHelper.addToolMaterial("material_eth_sword", 3, 1800, 8.0F, 8.0F, 10);
	
	
	// ITEMS
	public static final Item ETHEREUM_SHARD = new ItemBase("ethereum_shard");
	public static final Item ETHEREUM_INGOT = new ItemBase("ethereum_ingot");
	
	// TOOLS
	public static final ItemSword ETHEREAL_BLADE = new ToolSword("ethereal_blade", MATERIAL_ETH_SWORD);
}
