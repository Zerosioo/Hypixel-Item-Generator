package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BONE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Bone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BONE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BONE;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
