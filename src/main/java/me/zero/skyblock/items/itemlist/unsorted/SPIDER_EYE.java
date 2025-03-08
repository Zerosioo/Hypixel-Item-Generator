package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPIDER_EYE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Spider Eye";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPIDER_EYE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SPIDER_EYE;
    }

    @Override
    public int getPrice() {
        return 3;
    }

}
