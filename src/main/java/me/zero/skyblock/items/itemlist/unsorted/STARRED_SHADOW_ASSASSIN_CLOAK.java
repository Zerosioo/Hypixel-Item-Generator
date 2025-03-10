package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STARRED_SHADOW_ASSASSIN_CLOAK extends SItem implements ItemStatistics,SkullItem, Sellable {

    @Override
    public String getName() {
        return "Shadow Assassin Cloak";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STARRED_SHADOW_ASSASSIN_CLOAK"; 
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
        return Tier.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getSpeed() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MjI5ODIwNzA1MywKICAicHJvZmlsZUlkIiA6ICIzZWUxYWRlMzljZDI0ZjFkOWYwODliYjA2ZTkzNTY5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSdXNvR01SIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZhMjQzMTE0ODU3MmZlZDdiYzFlYWNmMGQyMjlkZGIyMTE1ZDFhMmNhMTgxZDMyM2QzZmNhNTIyNmU1MTZhMWQiCiAgICB9CiAgfQp9";
    }

}
