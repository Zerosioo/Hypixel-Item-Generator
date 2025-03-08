package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PUMPKIN_SEEDS extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Pumpkin Seeds";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PUMPKIN_SEEDS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PUMPKIN_SEEDS;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
