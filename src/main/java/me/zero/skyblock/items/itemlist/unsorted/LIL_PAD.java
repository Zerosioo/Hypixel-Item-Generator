package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIL_PAD extends SItem  {

    @Override
    public String getName() {
        return "Lil' Pad";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Can be placed on","water, especially if","you're scared of","said water.")); 
    }

    @Override
    public String getId() {
        return "LIL_PAD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WATER_LILY;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

}
