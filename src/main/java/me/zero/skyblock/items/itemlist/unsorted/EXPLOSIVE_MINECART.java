package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EXPLOSIVE_MINECART extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Minecart with TNT";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EXPLOSIVE_MINECART"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EXPLOSIVE_MINECART;
    }

    @Override
    public int getPrice() {
        return 22;
    }

}
