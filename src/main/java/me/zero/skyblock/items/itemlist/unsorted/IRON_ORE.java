package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IRON_ORE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Iron Ore";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "IRON_ORE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_ORE;
    }

    @Override
    public int getPrice() {
        return 3;
    }

}
