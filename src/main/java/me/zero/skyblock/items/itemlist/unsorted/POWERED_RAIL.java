package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POWERED_RAIL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Powered Rail";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POWERED_RAIL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.POWERED_RAIL;
    }

    @Override
    public int getPrice() {
        return 3;
    }

}
