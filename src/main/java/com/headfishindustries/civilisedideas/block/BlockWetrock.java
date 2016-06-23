package com.headfishindustries.civilisedideas.block;

import java.util.ArrayList;
import java.util.Random;

import com.headfishindustries.civilisedideas.CivilisedIdeas;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockWetrock extends BlockRedrock{
	public BlockWetrock(){
	super();
	//setBlockName("ci_BlockWetRock");
}
	
	@Override
	public Item getItemDropped(int i, Random dont, int need) {
		return Item.getItemFromBlock(CivilisedIdeas.blockRedrock);
	}
	
}
