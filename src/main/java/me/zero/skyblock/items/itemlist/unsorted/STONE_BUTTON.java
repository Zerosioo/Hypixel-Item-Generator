package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STONE_BUTTON extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Stone Button";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STONE_BUTTON"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE_BUTTON;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
