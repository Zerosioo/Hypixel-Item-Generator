package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SIMPLE_CARROT_CANDY extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Simple Carrot Candy";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SIMPLE_CARROT_CANDY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CARROT;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
