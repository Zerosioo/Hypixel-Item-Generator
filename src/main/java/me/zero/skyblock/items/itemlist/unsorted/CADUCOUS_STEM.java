package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CADUCOUS_STEM extends SItem  {

    @Override
    public String getName() {
        return "Caducous Stem";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("The color and shape","of flowers are a","precise record of","what bees find","attractive.")); 
    }

    @Override
    public String getId() {
        return "CADUCOUS_STEM"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DOUBLE_PLANT;
    }

    @Override
    public byte getDurability() {
        return 4;
    }

    @Override
    public Tier getTier() {
        return Tier.COMMON;
    }

}
