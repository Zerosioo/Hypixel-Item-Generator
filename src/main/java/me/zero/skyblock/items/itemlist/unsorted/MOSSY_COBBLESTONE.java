package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MOSSY_COBBLESTONE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Moss Stone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MOSSY_COBBLESTONE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MOSSY_COBBLESTONE;
    }

    @Override
    public int getPrice() {
        return 6;
    }

}
