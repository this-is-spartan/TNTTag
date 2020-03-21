package city.ahmeds.TNTTag;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventsListener implements Listener {
	private MainPlugin plugin = MainPlugin.getPlugin(MainPlugin.class);

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
	}
}
