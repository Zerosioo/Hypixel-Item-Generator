package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FENCE_GATE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Oak Fence Gate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FENCE_GATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FENCE_GATE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
