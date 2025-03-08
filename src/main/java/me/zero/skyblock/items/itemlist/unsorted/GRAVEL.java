package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GRAVEL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Gravel";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GRAVEL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GRAVEL;
    }

    @Override
    public int getPrice() {
        return 3;
    }

}
