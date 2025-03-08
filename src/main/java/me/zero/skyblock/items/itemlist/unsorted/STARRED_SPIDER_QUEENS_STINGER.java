package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STARRED_SPIDER_QUEENS_STINGER extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Spider Queen's Stinger";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STARRED_SPIDER_QUEENS_STINGER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOW;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public int getPrice() {
        return 8000;
    }

    @Override
    public int getDamage() {
        return 600;
    }

}
