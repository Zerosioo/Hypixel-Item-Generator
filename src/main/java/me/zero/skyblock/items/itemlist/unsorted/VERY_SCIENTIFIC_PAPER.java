package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VERY_SCIENTIFIC_PAPER extends SItem  {

    @Override
    public String getName() {
        return "Very Scientific Paper";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Authored,","peer-reviewed and","published by Kay.")); 
    }

    @Override
    public String getId() {
        return "VERY_SCIENTIFIC_PAPER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MAP;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
