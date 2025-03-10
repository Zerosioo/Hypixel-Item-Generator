package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SNOW_NECKLACE extends SItem implements ItemStatistics,SkullItem, Sellable, Museum {

    @Override
    public String getName() {
        return "Snow Necklace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SNOW_NECKLACE"; 
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
        return Tier.RARE;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getHealth() {
        return 5;
    }

    @Override
    public int getIntelligence() {
        return 5;
    }

    @Override
    public int getSpeed() {
        return 2;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2OTM4OTk5MzM4NSwKICAicHJvZmlsZUlkIiA6ICJkMmM1MThjMzJjNTY0OGJmOTM2ZjY0YjhmZDQ1ZThjZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJEcmFjb0JlbGxzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2IxMmZhYTJlNzk4OTg5ZDkxMGVmYmY5MjgxYjhjYmEyNDE4NTYyMmU5YWEzNTdjNzUyODVhYTRiN2UzMzE0YmMiCiAgICB9CiAgfQp9";
    }

}
