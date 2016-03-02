package headfishindustries.civilisedideas;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;


public class TileSwapper extends TileEntity implements IUpdatePlayerListBox {
	
	@Override
	public void writeToNBT(NBTTagCompound par1){
		super.writeToNBT(par1);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound par1){
		super.readFromNBT(par1);
	}
	
	public static void init(){
	System.out.println("Civilised Swapper placed.");	
	}
	
	@Override
	public void update(){
		System.out.println("Hey there, there's a Civilised Swapper here!");
	}
}
