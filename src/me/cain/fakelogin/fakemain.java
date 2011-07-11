package me.cain.fakelogin;

import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class fakemain extends JavaPlugin{
	
	Player player;
	
Logger log = Logger.getLogger("Minecraft");
String pluginname = "FakeLogin";

	public void onDisable() {
		log.info("[" + pluginname + "] " + pluginname + " has been disabled.");
		}
	public void onEnable() {
		log.info("[" + pluginname + "] " + pluginname + " has been enabled.");
		log.info("[" + pluginname + "] Created by CainFoool");
			}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args) {
		Player player = (Player) sender;
		if (player.isOp()) {
			if(label.equalsIgnoreCase("flogin")) {
				if (sender instanceof Player) {
				if(args.length !=0) {
					player.sendMessage("/flogin {message}");
				}
					else {
			getServer().broadcastMessage(ChatColor.YELLOW + args[0] + " joined the game.");
			return true;
			}
		if(label.equalsIgnoreCase("flogout")) {
			if(args.length !=0) {
				player.sendMessage("/flogout {message}");
			}
				else {
			getServer().broadcastMessage(ChatColor.YELLOW + args[0] + " left the game.");
			return true;
			}
		}
		return false;
	}
		else {
			log.info("You can't use that in-game!");
		}
		return false;
}
		return false;
}
        return false;
		}
		
}
		
// Created by CainFoool