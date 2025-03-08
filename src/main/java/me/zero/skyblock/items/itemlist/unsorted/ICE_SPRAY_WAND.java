package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ICE_SPRAY_WAND extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Ice Spray Wand";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ICE_SPRAY_WAND"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STICK;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getGearScore() {
        return 20;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public int getIntelligence() {
        return 0;
    }

}
