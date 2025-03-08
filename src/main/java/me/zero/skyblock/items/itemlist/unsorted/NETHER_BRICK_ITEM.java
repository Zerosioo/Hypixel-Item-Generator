package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NETHER_BRICK_ITEM extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Nether Brick";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "NETHER_BRICK_ITEM"; 
    }

    @Override
    public Material getMaterial() {
        return Material.NETHER_BRICK_ITEM;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
