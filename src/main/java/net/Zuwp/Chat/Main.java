package net.Zuwp.Chat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	public void onEnable(){
		Listeners();
		final ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
	    console.sendMessage(Main.color("&eChatMention>> &aHas been enabled!"));
	}
	
	public void onDisable(){
		final ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
		console.sendMessage(Main.color("&eChatMention>> &cHas been disabled!"));
	}
	
	public void Listeners(){
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new ChatHandler(this), this);
	}
	
	public static String color(String string){
		return ChatColor.translateAlternateColorCodes('&', string);
	}

}
