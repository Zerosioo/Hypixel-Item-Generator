package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GIANT_FRAGMENT_DIAMOND extends SItem  {

    @Override
    public String getName() {
        return "Diamante's Handle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GIANT_FRAGMENT_DIAMOND"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_BARDING;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

}
