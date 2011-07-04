package feildmaster.NoDrown;

import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityListener;

class drownListener extends EntityListener {
    public void onEntityDamage(EntityDamageEvent event) {
        if(event.getCause() == DamageCause.DROWNING)
            event.setCancelled(true);
    }
}
