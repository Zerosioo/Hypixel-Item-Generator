package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INK_SACK_8 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Gray Dye";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INK_SACK:8"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 8;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
