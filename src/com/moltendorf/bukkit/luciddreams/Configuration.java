package com.moltendorf.bukkit.luciddreams;

import org.bukkit.entity.EntityType;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Configuration class.
 *
 * @author moltendorf
 */
public class Configuration {

	static protected class Global {

		// Final data.
		final protected boolean enabled = true; // Whether or not the plugin is enabled at all; useful for using it as an interface (default is true).

		final protected HashSet<EntityType> disallowed = new HashSet<>(Arrays.asList(
			EntityType.BLAZE,
			EntityType.CAVE_SPIDER,
			EntityType.CREEPER,
			EntityType.ENDERMAN,
			EntityType.ENDER_DRAGON,
			EntityType.GHAST,
			EntityType.GIANT,
			EntityType.IRON_GOLEM,
			EntityType.MAGMA_CUBE,
			EntityType.PIG_ZOMBIE,
			EntityType.PLAYER,
			EntityType.SILVERFISH,
			EntityType.SKELETON,
			EntityType.SLIME,
			EntityType.SPIDER,
			EntityType.WITCH,
			EntityType.WITHER,
			EntityType.WOLF,
			EntityType.ZOMBIE
		));

		final protected HashSet<EntityType> creatures = new HashSet<>(Arrays.asList(
			EntityType.BLAZE,
			EntityType.CAVE_SPIDER,
			EntityType.CREEPER,
			EntityType.ENDERMAN,
			EntityType.GIANT,
			EntityType.IRON_GOLEM,
			EntityType.PIG_ZOMBIE,
			EntityType.SILVERFISH,
			EntityType.SKELETON,
			EntityType.SPIDER,
			EntityType.WITCH,
			EntityType.WITHER,
			EntityType.WOLF,
			EntityType.ZOMBIE
		));
	}

	// Final data.
	final protected Global global = new Global();

	public Configuration() {

		// Placeholder.
	}
}
