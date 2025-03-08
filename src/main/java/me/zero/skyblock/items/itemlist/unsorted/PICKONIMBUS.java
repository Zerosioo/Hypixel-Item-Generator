package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PICKONIMBUS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Pickonimbus 2000";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PICKONIMBUS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_PICKAXE;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 12;
    }

    @Override
    public int getDamage() {
        return 30;
    }

    @Override
    public int getMiningSpeed() {
        return 750;
    }

}
