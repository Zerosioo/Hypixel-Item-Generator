package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VINYL_BUZZIN_BEATS extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Buzzin' Beats Vinyl";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VINYL_BUZZIN_BEATS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RECORD_10;
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
