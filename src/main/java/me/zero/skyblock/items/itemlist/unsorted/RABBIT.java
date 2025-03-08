package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RABBIT extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Raw Rabbit";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RABBIT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RABBIT;
    }

    @Override
    public int getPrice() {
        return 4;
    }

}
