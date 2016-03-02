package headfishindustries.civilisedideas;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockSwapper extends Block {

	public BlockSwapper(Material material) {
	super(material);
	this.setHardness(2.0f);
	this.setResistance(7.0f);
	this.setHarvestLevel("pickaxe", 0);
	this.isBlockContainer = true;
	}
		
	
		
	@Override
	public TileEntity createTileEntity(World world, int meta) {
		System.out.println("Placed a block.");
		return new TileSwapper();
	}
	
	

}


