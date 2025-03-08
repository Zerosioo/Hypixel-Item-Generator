package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FRESH_SPRING_WATER extends SItem  {

    @Override
    public String getName() {
        return "Fresh Spring Water";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FRESH_SPRING_WATER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WATER_BUCKET;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

}
