package net.craftminecraft.bungee.bungeeyaml;


import java.io.IOException;

import net.md_5.bungee.api.plugin.Plugin;

public class BungeeYAML extends Plugin {
	Metrics metrics;
	public void onEnable() {
		try {
			metrics = new Metrics(this);
			metrics.start();
		} catch (IOException e) {

		}
	}
	
	public void onDisable() {
		
	}
}
