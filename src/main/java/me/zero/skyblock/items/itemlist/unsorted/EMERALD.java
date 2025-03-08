package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EMERALD extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Emerald";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EMERALD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EMERALD;
    }

    @Override
    public int getPrice() {
        return 4;
    }

}
