package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SNOW_BELT extends SItem implements ItemStatistics,SkullItem, Sellable, Museum {

    @Override
    public String getName() {
        return "Snow Belt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SNOW_BELT"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2OTM4OTk2Nzc3NSwKICAicHJvZmlsZUlkIiA6ICJmZTE0M2FhZTVmNGE0YTdiYjM4MzcxM2U1Mjg0YmIxYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJKZWZveHk0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JjMDNlODdmYmZhOTAzMjQ4OTRlOTY4YmU5NmI5OTMwZDk5OGVjY2NmNjYzMmRlMDQ3YjNlOWNjNjkxMTFjYzciCiAgICB9CiAgfQp9";
    }

}
