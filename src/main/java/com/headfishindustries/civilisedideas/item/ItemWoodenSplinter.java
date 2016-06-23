package com.headfishindustries.civilisedideas.item;

import com.headfishindustries.civilisedideas.CivilisedIdeas;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemWoodenSplinter extends Item {
	public ItemWoodenSplinter()
	{
	setUnlocalizedName( "ci_WoodenSplinter");
	this.setCreativeTab(CivilisedIdeas.hypoTab);
	this.setCreativeTab(CreativeTabs.tabMisc);
	this.setTextureName("ci:WoodSplinter");
	}
}
