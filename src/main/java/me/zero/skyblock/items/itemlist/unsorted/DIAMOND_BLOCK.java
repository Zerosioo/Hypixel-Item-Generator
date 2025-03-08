package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIAMOND_BLOCK extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Block of Diamond";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIAMOND_BLOCK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_BLOCK;
    }

    @Override
    public int getPrice() {
        return 72;
    }

}
