package com.headfishindustries.civilisedideas.item;

import com.headfishindustries.civilisedideas.CivilisedIdeas;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemWoodenWand extends Item{
	public ItemWoodenWand()
	{
	setUnlocalizedName( "ci_WoodWand");
	this.setCreativeTab(CivilisedIdeas.hypoTab);
	this.setCreativeTab(CreativeTabs.tabMisc);
	this.setTextureName("ci:WoodWand");
	}
}
