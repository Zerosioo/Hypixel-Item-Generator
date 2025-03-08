package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SOCIAL_DISPLAY extends SItem  {

    @Override
    public String getName() {
        return "Social Display";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SOCIAL_DISPLAY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_BLOCK;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

}
