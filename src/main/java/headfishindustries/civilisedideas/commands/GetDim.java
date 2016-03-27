package headfishindustries.civilisedideas.commands;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.PlayerNotFoundException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.util.text.*;


public class GetDim extends CommandBase {
	@Override
	public String getCommandName(){
		return "getDim";
	}
	
	@Override
	public String getCommandUsage(ICommandSender sender){
		return "/getDim";
	}
	
	@Override
	public int getRequiredPermissionLevel(){
		return 0;
	}
	

	public boolean canCommandSenderUseCommand(ICommandSender sender){
		return true;
	}
	 
	@Override
	public List getCommandAliases(){
		ArrayList<String> aliases = new ArrayList<String>();
		aliases.add("getdim");
		aliases.add("GetDim");
		aliases.add("GETDIM");
		aliases.add("getCurrentDim");
		aliases.add("getDimension");
		return aliases;
	}
	

	public void processCommand(ICommandSender sender, String[] idontneedthis){
		EntityPlayer player = null;
		try {
			player = getCommandSenderAsPlayer(sender);
		} catch (PlayerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		player.addChatMessage(new TextComponentString("You are in dimension number " + player.dimension));
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		// TODO Auto-generated method stub
		
	}
}
