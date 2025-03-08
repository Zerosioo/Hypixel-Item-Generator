package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLAY_BRICK extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Brick";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CLAY_BRICK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CLAY_BRICK;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
