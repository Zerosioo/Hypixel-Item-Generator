package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PUMPKIN extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Pumpkin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PUMPKIN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PUMPKIN;
    }

    @Override
    public int getPrice() {
        return 10;
    }

}
