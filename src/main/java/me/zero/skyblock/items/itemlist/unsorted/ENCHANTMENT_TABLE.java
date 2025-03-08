package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTMENT_TABLE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Enchantment Table";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTMENT_TABLE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ENCHANTMENT_TABLE;
    }

    @Override
    public int getPrice() {
        return 40;
    }

}
