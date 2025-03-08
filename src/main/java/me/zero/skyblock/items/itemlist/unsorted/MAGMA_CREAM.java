package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGMA_CREAM extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Magma Cream";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAGMA_CREAM"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MAGMA_CREAM;
    }

    @Override
    public int getPrice() {
        return 8;
    }

}
