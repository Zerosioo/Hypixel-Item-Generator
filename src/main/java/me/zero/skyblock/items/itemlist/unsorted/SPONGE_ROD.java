package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPONGE_ROD extends SItem implements ItemStatistics, Sellable, Museum {

    @Override
    public String getName() {
        return "Sponge Rod";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPONGE_ROD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FISHING_ROD;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 36;
    }

    @Override
    public int getStrength() {
        return 15;
    }

    @Override
    public int getFishingSpeed() {
        return 30;
    }

}
