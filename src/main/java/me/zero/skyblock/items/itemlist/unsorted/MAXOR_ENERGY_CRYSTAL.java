package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAXOR_ENERGY_CRYSTAL extends SItem  {

    @Override
    public String getName() {
        return "Energy Crystal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAXOR_ENERGY_CRYSTAL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.NETHER_STAR;
    }

    @Override
    public Tier getTier() {
        return Tier.SPECIAL;
    }

}
