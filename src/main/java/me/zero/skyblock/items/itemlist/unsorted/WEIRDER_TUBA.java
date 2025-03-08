package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WEIRDER_TUBA extends SItem  {

    @Override
    public String getName() {
        return "Weirder Tuba";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WEIRDER_TUBA"; 
    }

    @Override
    public Material getMaterial() {
        return Material.HOPPER;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getStrength() {
        return 40;
    }

}
