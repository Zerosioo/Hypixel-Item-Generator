package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ITEM_FRAME extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Item Frame";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ITEM_FRAME"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ITEM_FRAME;
    }

    @Override
    public int getPrice() {
        return 5;
    }

}
