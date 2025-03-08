package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SIGN extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Sign";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SIGN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SIGN;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
