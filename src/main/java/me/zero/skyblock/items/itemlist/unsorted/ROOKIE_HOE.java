package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROOKIE_HOE extends SItem implements  Sellable, Museum {

    @Override
    public String getName() {
        return "Rookie Hoe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROOKIE_HOE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE_HOE;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 3;
    }

}
