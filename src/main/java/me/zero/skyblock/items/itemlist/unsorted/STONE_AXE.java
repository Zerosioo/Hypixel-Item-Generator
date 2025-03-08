package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STONE_AXE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Stone Axe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STONE_AXE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE_AXE;
    }

    @Override
    public int getPrice() {
        return 2;
    }

    @Override
    public int getDamage() {
        return 15;
    }

}
