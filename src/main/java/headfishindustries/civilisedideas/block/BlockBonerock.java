package headfishindustries.civilisedideas.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockBonerock extends Block{

	public BlockBonerock() {
		super(Material.rock);
		setBlockName("ci_rockBone");
		setBlockTextureName("ci:rockBone");
		this.setHarvestLevel("pickaxe", 1);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypeStone);
	}

}