package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OVERFLUX_POWER_ORB extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Overflux Power Orb";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "OVERFLUX_POWER_ORB"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SKULL_ITEM;
    }

    @Override
    public byte getDurability() {
        return 3;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODY4ODA2MjE4OCwKICAicHJvZmlsZUlkIiA6ICIzNzRhZGZlMjkyOWI0ZDBiODJmYmVjNTg2ZTI5ODk4YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJfR2xvenpfIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzIwZGU1ZTg5NzQ5NDAzNzU5MzRkMzJmNzFjOTFhZDJkNTcyOGQzOGU1MTY0N2RjYzhmMzkyMDZjMDk5YTU0YzIiCiAgICB9CiAgfQp9";
    }

}
