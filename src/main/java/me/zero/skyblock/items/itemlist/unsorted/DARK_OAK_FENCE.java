package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DARK_OAK_FENCE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Dark Oak Fence";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DARK_OAK_FENCE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DARK_OAK_FENCE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
