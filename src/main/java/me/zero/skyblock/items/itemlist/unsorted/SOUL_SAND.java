package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SOUL_SAND extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Soul Sand";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SOUL_SAND"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SOUL_SAND;
    }

    @Override
    public int getPrice() {
        return 4;
    }

}
