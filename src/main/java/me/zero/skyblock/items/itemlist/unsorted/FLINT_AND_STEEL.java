package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLINT_AND_STEEL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Flint and Steel";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLINT_AND_STEEL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FLINT_AND_STEEL;
    }

    @Override
    public int getPrice() {
        return 7;
    }

}
