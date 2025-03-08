package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MUSHROOM_COLLECTION extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Mushroom";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MUSHROOM_COLLECTION"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RED_MUSHROOM;
    }

    @Override
    public int getPrice() {
        return 5;
    }

}
