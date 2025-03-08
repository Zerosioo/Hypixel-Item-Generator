package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LEAVES_2_1 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Dark Oak Leaves";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LEAVES_2:1"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEAVES_2;
    }

    @Override
    public byte getDurability() {
        return 1;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
