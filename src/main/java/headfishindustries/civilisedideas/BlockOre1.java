package headfishindustries.civilisedideas;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * User: The Grey Ghost
 * Date: 24/12/2014
 *
 * BlockSimple is a ordinary solid cube with the six faces numbered from 0 - 5.
 * For background information on blocks see here http://greyminecraftcoder.blogspot.com.au/2014/12/blocks-18.html
 */
public class BlockOre1 extends Block
{
  public BlockOre1()
  {
    super(Material.rock);
    this.setCreativeTab(CreativeTabs.tabBlock);   // the block will appear on the Blocks tab in creative
  }

  // the block will render in the SOLID layer. 
  @SideOnly(Side.CLIENT)

  public boolean isOpaqueCube() {
    return true;
  }

  // used by the renderer to control lighting and visibility of other blocks, also by
  // (eg) wall or fence to control whether the fence joins itself to this block
  // set to true because this block occupies the entire 1x1x1 space
  // not strictly required because the default (super method) is true
  public boolean isFullCube() {
    return true;
  }

  // render using a BakedModel (mbe01_block_simple.json --> mbe01_block_simple_model.json)
  // not strictly required because the default (super method) is 3.
  public int getRenderType() {
    return 3;
  }
}