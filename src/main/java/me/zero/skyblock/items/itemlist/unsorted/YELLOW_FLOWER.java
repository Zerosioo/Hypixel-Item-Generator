package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YELLOW_FLOWER extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Dandelion";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "YELLOW_FLOWER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.YELLOW_FLOWER;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
