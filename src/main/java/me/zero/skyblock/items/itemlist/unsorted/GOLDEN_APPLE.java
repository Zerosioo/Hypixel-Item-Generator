package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLDEN_APPLE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Golden Apple";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLDEN_APPLE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLDEN_APPLE;
    }

    @Override
    public int getPrice() {
        return 8;
    }

}
