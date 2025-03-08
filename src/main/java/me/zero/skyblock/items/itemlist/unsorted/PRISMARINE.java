package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PRISMARINE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Prismarine";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PRISMARINE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PRISMARINE;
    }

    @Override
    public int getPrice() {
        return 5;
    }

}
