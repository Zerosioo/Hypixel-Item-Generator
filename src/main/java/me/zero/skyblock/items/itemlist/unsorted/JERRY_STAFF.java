package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JERRY_STAFF extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Jerry-chine Gun";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JERRY_STAFF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_BARDING;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public int getDamage() {
        return 80;
    }

    @Override
    public int getIntelligence() {
        return 200;
    }

}
