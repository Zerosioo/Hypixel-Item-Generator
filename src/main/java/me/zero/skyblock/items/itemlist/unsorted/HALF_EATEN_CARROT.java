package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HALF_EATEN_CARROT extends SItem  {

    @Override
    public String getName() {
        return "Half-Eaten Carrot";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HALF_EATEN_CARROT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CARROT_ITEM;
    }

    @Override
    public Tier getTier() {
        return Tier.COMMON;
    }

}
