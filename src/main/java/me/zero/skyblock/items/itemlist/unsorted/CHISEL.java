package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHISEL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Chisel";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHISEL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ARMOR_STAND;
    }

    @Override
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

}
