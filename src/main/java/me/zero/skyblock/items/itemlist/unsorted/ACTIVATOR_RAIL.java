package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ACTIVATOR_RAIL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Activator Rail";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ACTIVATOR_RAIL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ACTIVATOR_RAIL;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
