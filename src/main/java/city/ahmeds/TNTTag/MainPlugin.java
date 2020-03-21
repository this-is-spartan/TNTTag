package city.ahmeds.TNTTag;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class MainPlugin extends JavaPlugin {

	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nTNT RUN has been Enabled\n\n");
		getServer().getPluginManager().registerEvents(new EventsListener(), this);
		loadConfig();
	}

	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nTNT RUN has been Disabled\n\n");
	}

	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
}
