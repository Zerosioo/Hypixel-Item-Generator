package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STEP_7 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Quartz Slab";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STEP:7"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STEP;
    }

    @Override
    public byte getDurability() {
        return 7;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
