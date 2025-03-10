package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YETI_ROD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Yeti Rod";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "YETI_ROD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FISHING_ROD;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public int getPrice() {
        return 150000;
    }

    @Override
    public int getStrength() {
        return 130;
    }

    @Override
    public int getFishingSpeed() {
        return 75;
    }

}
