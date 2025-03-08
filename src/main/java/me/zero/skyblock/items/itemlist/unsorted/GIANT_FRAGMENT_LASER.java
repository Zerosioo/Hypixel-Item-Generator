package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GIANT_FRAGMENT_LASER extends SItem  {

    @Override
    public String getName() {
        return "L.A.S.R.'s Eye";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GIANT_FRAGMENT_LASER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EYE_OF_ENDER;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

}
