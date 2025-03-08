package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCYLLA extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Scylla";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SCYLLA"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SWORD;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public int getDamage() {
        return 270;
    }

    @Override
    public int getCritChance() {
        return 12;
    }

    @Override
    public int getCritDamage() {
        return 35;
    }

    @Override
    public int getIntelligence() {
        return 50;
    }

}
