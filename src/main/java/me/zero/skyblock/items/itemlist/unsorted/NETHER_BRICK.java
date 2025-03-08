package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NETHER_BRICK extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Nether Bricks";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "NETHER_BRICK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.NETHER_BRICK;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
