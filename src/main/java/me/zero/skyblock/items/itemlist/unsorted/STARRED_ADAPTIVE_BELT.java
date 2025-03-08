package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STARRED_ADAPTIVE_BELT extends SItem implements ItemStatistics,SkullItem, Sellable {

    @Override
    public String getName() {
        return "Adaptive Belt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STARRED_ADAPTIVE_BELT"; 
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
    public int getPrice() {
        return 0;
    }

    @Override
    public int getHealth() {
        return 15;
    }

    @Override
    public int getDefense() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MjI5ODI2MTU3NCwKICAicHJvZmlsZUlkIiA6ICIwOWQ3YmJjNGYxZmU0ZjlkYjRiZmE1MTY2NDA3OTcyYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJlemtkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzcwYmY2ZDc2ZjJhMDNmMzE5ZmZmZTcyNWY4MmI4MGI5MjUyOTFlZmRhMzZkNGRiMjViYWNkN2VhODZhNjU3YyIKICAgIH0KICB9Cn0=";
    }

}
