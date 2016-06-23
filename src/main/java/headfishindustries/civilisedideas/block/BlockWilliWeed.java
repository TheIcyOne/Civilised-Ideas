package headfishindustries.civilisedideas.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import headfishindustries.civilisedideas.CivilisedIdeas;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class BlockWilliWeed extends BlockBush {
	
	private IIcon icon;

	public BlockWilliWeed() {
		super(Material.plants);
		setBlockName("ci_flowerWilliWeed");
		setHardness(0.2F);
		setStepSound(soundTypeGrass);
		setTickRandomly(false);
		setBlockBounds(0.05F, 0.0F, 0.05F, 0.94F, 0.87F, 0.94F);
		this.setBlockTextureName("ci:WilliWeed");
	}
	   @Override
	   public void registerBlockIcons(IIconRegister par1){
		   super.registerBlockIcons(par1);
		   icon = par1.registerIcon("ci:WilliWeed");   
	   }

	   @Override
	   public IIcon getIcon(int par1, int par2){
		   return this.icon;
	   }
	   
	   	   
	   @Override
	   protected boolean canPlaceBlockOn(Block block){
		   return block == CivilisedIdeas.blockRedrock || block == CivilisedIdeas.blockBonerock || block == Blocks.grass || block == Blocks.dirt || block == Blocks.farmland;
	   }

}
