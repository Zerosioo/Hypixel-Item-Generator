package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COOKED_MUTTON extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Cooked Mutton";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COOKED_MUTTON"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COOKED_MUTTON;
    }

    @Override
    public int getPrice() {
        return 5;
    }

}
