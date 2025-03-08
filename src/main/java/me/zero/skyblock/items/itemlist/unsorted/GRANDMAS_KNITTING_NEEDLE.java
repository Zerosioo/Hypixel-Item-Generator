package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GRANDMAS_KNITTING_NEEDLE extends SItem  {

    @Override
    public String getName() {
        return "Grandma's Knitting Needle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GRANDMAS_KNITTING_NEEDLE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STICK;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
