package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CAULDRON_ITEM extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Cauldron";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CAULDRON_ITEM"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CAULDRON_ITEM;
    }

    @Override
    public int getPrice() {
        return 10;
    }

}
