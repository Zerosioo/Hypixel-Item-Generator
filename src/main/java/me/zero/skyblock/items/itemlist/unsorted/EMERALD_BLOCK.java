package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EMERALD_BLOCK extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Block of Emerald";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EMERALD_BLOCK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EMERALD_BLOCK;
    }

    @Override
    public int getPrice() {
        return 36;
    }

}
