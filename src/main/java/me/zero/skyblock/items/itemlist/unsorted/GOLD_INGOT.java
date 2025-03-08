package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLD_INGOT extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Gold Ingot";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLD_INGOT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_INGOT;
    }

    @Override
    public int getPrice() {
        return 3;
    }

}
