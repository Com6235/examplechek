package io.github.com6235.examplechek;

import com.destroystokyo.paper.event.server.ServerTickStartEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.GenericGameEvent;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        Bukkit.getCommandMap().register("", new SortCommand("sort"));

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(Component.text("Hello, " + event.getPlayer().getName() + "!"));
    }

    @EventHandler
    public void tickStart(ServerTickStartEvent event) {
        /*try {
            Player s = Bukkit.getPlayer("SnappyNutria356");
            assert s != null;
            if (s.isOnline()) {
                s.sendMessage(Component.text("ur gay"));
            }
        } catch (Exception e) {

        }*/
    }
    @Override
    public void onDisable() {

    }
}
