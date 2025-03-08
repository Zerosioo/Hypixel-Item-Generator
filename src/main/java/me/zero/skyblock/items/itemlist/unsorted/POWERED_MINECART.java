package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POWERED_MINECART extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Minecart with Furnace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POWERED_MINECART"; 
    }

    @Override
    public Material getMaterial() {
        return Material.POWERED_MINECART;
    }

    @Override
    public int getPrice() {
        return 12;
    }

}
