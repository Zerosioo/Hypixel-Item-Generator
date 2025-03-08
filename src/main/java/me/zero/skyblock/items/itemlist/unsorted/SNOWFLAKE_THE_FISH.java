package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SNOWFLAKE_THE_FISH extends SItem implements  Museum {

    @Override
    public String getName() {
        return "Flake the Fish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SNOWFLAKE_THE_FISH"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COOKED_FISH;
    }

    @Override
    public byte getDurability() {
        return 1;
    }

    @Override
    public Tier getTier() {
        return Tier.SPECIAL;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

}
