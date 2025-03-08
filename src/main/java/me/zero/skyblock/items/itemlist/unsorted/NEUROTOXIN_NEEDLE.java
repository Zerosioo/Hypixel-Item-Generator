package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NEUROTOXIN_NEEDLE extends SItem  {

    @Override
    public String getName() {
        return "Neurotoxin Needle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "NEUROTOXIN_NEEDLE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEVER;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

}
