package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FREE_COOKIE extends SItem  {

    @Override
    public String getName() {
        return "Booster Cookie §8(FREE)";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FREE_COOKIE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COOKIE;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

}
