package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MYCEL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Mycelium";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MYCEL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MYCEL;
    }

    @Override
    public int getPrice() {
        return 5;
    }

}
