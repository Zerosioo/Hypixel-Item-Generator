package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STONE_4 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Polished Diorite";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STONE:4"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE;
    }

    @Override
    public byte getDurability() {
        return 4;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
