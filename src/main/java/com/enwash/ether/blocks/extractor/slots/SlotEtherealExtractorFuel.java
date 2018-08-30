package com.enwash.ether.blocks.extractor.slots;

import com.enwash.ether.blocks.extractor.TileEntityEtherealExtractor;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotEtherealExtractorFuel extends Slot {

	public SlotEtherealExtractorFuel(IInventory inventory, int index, int x, int y)
	{
		super(inventory, index, x, y);
	}
	
	public boolean isitemValid(ItemStack stack)
	{
		return TileEntityEtherealExtractor.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}
}
