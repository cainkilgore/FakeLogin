package me.cain.fakelogin;

import java.util.logging.Logger;
import com.nijiko.permissions.PermissionHandler;
import com.nijikokun.bukkit.Permissions.Permissions;
import org.bukkit.plugin.Plugin;
import javax.swing.event.DocumentEvent.EventType;
import org.bukkit.plugin.Plugin;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.block.*;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.Slot;

public class fakemain extends JavaPlugin{
	
	Player player;
	
Logger log = Logger.getLogger("Minecraft");
String pluginname = "FakeLogin";

	public void onDisable() {
		log.info("[" + pluginname + "] " + pluginname + " has been disabled.");
		}
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		log.info("[" + pluginname + "] " + pluginname + " has been enabled.");
		log.info("[" + pluginname + "] Created by CainFoool");
			}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args) {
		Player player = (Player) sender;
		if (player.isOp()) {
            if (sender instanceof Player) {
			if(label.equalsIgnoreCase("flogin")) {
			getServer().broadcastMessage(ChatColor.YELLOW + args[0] + " joined the game.");
			return true;
			}
		if(label.equalsIgnoreCase("flogout")) {
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
}
		
// Created by CainFoool