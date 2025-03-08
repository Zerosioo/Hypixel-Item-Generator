package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RABBIT_HIDE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Rabbit Hide";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RABBIT_HIDE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RABBIT_HIDE;
    }

    @Override
    public int getPrice() {
        return 5;
    }

}
