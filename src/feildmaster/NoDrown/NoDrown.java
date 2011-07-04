package feildmaster.NoDrown;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class NoDrown extends JavaPlugin {
    drownListener entityListener = new drownListener();

    public void onDisable() {
    }

    public void onEnable() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Event.Type.ENTITY_DAMAGE, entityListener, Event.Priority.Low, this);
        System.out.println("NoDrown v"+getDescription().getVersion()+": Enabled");
    }
}
