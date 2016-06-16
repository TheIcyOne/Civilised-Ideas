package headfishindustries.civilisedideas.block;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import headfishindustries.civilisedideas.CivilisedIdeas;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockBonerock extends BlockOre{

	public BlockBonerock() {
		super();
		this.setHarvestLevel("pickaxe", 1);
		setBlockName("ci_rockBone");
        this.setHardness(1.75F);
        this.setResistance(12.5F);
		setBlockTextureName("ci:rockBone");
	}
	
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int meta, int fortune){
		ArrayList<ItemStack> drop = new ArrayList<ItemStack>();
		drop.add(new ItemStack(Items.skull, world.rand.nextInt(2) + 1 + fortune, 0));
		drop.add(new ItemStack(Items.bone, world.rand.nextInt(4) + 2 + fortune));
		return drop;
	}

}