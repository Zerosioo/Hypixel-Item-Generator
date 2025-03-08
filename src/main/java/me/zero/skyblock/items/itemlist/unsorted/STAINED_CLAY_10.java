package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STAINED_CLAY_10 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Purple Hardened Clay";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STAINED_CLAY:10"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STAINED_CLAY;
    }

    @Override
    public byte getDurability() {
        return 10;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
