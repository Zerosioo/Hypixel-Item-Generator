package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STONE_6 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Polished Andesite";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STONE:6"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE;
    }

    @Override
    public byte getDurability() {
        return 6;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
