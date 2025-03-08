package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ACACIA_DOOR_ITEM extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Acacia Door";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ACACIA_DOOR_ITEM"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ACACIA_DOOR_ITEM;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
