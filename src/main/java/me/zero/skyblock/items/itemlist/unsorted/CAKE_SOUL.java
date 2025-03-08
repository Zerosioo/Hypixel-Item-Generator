package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CAKE_SOUL extends SItem implements  Museum {

    @Override
    public String getName() {
        return "Cake Soul";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CAKE_SOUL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 9;
    }

    @Override
    public Tier getTier() {
        return Tier.MYTHIC;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

}
