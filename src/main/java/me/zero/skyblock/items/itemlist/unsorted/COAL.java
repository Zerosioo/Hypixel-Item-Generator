package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COAL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Coal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COAL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COAL;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
