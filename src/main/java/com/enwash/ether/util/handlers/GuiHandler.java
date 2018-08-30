package com.enwash.ether.util.handlers;

import com.enwash.ether.blocks.extractor.ContainerEtherealExtractor;
import com.enwash.ether.blocks.extractor.GuiEtherealExtractor;
import com.enwash.ether.blocks.extractor.TileEntityEtherealExtractor;
import com.enwash.ether.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_ETHEREAL_EXTRACTOR) return new ContainerEtherealExtractor(player.inventory, (TileEntityEtherealExtractor)world.getTileEntity(new BlockPos(x,y,x)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_ETHEREAL_EXTRACTOR) return new GuiEtherealExtractor(player.inventory, (TileEntityEtherealExtractor)world.getTileEntity(new BlockPos(x,y,x)));
		return null;
	}

}
