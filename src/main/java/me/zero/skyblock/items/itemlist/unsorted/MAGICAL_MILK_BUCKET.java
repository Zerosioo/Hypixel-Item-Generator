package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGICAL_MILK_BUCKET extends SItem  {

    @Override
    public String getName() {
        return "Magical Milk Bucket";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAGICAL_MILK_BUCKET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MILK_BUCKET;
    }

}
