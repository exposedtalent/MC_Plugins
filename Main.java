package me.Tanishq.HelloWorld;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	@Override 
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		// What is the command coming in 
		if(lable.equalsIgnoreCase("hello")) {
			// If the command comes from the player
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(p.hasPermission("hello.use")){
					p.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Hey welcome to the server!");
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&1H&2a&3v&4e&5 &6F&7u&8n!"));
					return true;
				}
				else {
					p.sendMessage(ChatColor.RED + "Sorry you dont have the permission");
				}
				return true;
			}
			// If the command comes from the console
			else {
				sender.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Hey Console!");
				return true;
				
			}
		}
		
		
		return false;
	}
	

}
