package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IRON_HELMET extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Iron Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "IRON_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_HELMET;
    }

    @Override
    public int getPrice() {
        return 7;
    }

    @Override
    public int getDefense() {
        return 12;
    }

}
