package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENDER_PEARL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Ender Pearl";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENDER_PEARL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ENDER_PEARL;
    }

    @Override
    public int getPrice() {
        return 7;
    }

}
