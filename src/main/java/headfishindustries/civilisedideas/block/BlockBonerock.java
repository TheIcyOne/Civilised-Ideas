package headfishindustries.civilisedideas.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockBonerock extends Block{

	public BlockBonerock() {
		super(Material.ground);
		setBlockName("ci_rockBone");
		setBlockTextureName("ci:rockBone");
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int meta, int fortune){
		ArrayList<ItemStack> drop = new ArrayList<ItemStack>();
		drop.add(new ItemStack(Items.skull, world.rand.nextInt(3) + fortune, 0));
		drop.add(new ItemStack(Items.bone, world.rand.nextInt(6) + 2 + fortune));
		return drop;
	}

}