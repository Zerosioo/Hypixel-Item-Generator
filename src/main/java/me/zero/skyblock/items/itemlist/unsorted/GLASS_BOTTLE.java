package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLASS_BOTTLE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Glass Bottle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GLASS_BOTTLE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GLASS_BOTTLE;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
