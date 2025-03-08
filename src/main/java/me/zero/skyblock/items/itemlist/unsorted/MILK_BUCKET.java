package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MILK_BUCKET extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Milk Bucket";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MILK_BUCKET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MILK_BUCKET;
    }

    @Override
    public int getPrice() {
        return 4;
    }

}
