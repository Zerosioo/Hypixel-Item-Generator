package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ICE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Ice";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ICE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ICE;
    }

    @Override
    public int getPrice() {
        return 0;
    }

}
