package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VORPAL_KATANA extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Vorpal Katana";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VORPAL_KATANA"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_SWORD;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public int getDamage() {
        return 190;
    }

    @Override
    public int getCritDamage() {
        return 30;
    }

    @Override
    public int getIntelligence() {
        return 200;
    }

}
