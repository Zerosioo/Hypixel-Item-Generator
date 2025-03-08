package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VINYL_RODENT_REVOLUTION extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Rodent Revolution Vinyl";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VINYL_RODENT_REVOLUTION"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_RECORD;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 50000;
    }

}
