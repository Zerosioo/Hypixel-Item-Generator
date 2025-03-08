package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOAT extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Boat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BOAT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOAT;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
