package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PERFECT_CHESTPLATE_8 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Perfect Chestplate - Tier VIII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PERFECT_CHESTPLATE_8"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_CHESTPLATE;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 3686400;
    }

    @Override
    public int getDefense() {
        return 300;
    }

}
