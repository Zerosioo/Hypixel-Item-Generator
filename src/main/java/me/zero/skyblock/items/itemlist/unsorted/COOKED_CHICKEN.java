package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COOKED_CHICKEN extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Cooked Chicken";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COOKED_CHICKEN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COOKED_CHICKEN;
    }

    @Override
    public int getPrice() {
        return 4;
    }

}
