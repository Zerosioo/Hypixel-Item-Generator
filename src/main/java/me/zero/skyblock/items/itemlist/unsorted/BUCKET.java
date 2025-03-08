package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUCKET extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Bucket";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUCKET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BUCKET;
    }

    @Override
    public int getPrice() {
        return 4;
    }

}
