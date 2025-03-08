package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GIANT_FRAGMENT_BOULDER extends SItem  {

    @Override
    public String getName() {
        return "Jolly Pink Rock";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GIANT_FRAGMENT_BOULDER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FIREWORK_CHARGE;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

}
