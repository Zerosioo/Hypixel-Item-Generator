package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOTTLE_OF_JYRRE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "§cLost Bottle of Jyrre";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BOTTLE_OF_JYRRE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.POTION;
    }

    @Override
    public int getPrice() {
        return 100;
    }

}
