package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CARROT_STICK extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Carrot on a Stick";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CARROT_STICK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CARROT_STICK;
    }

    @Override
    public int getPrice() {
        return 3;
    }

}
