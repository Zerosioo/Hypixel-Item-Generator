package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PRE_DIGESTION_FISH extends SItem  {

    @Override
    public String getName() {
        return "Pre-Digestion Fish";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("The obvious result","of mixing cat food,","spacetime bending","and mystical","mythology.")); 
    }

    @Override
    public String getId() {
        return "PRE_DIGESTION_FISH"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RAW_FISH;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

}
