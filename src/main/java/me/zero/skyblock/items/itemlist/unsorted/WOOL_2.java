package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WOOL_2 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Magenta Wool";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WOOL:2"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOL;
    }

    @Override
    public byte getDurability() {
        return 2;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
