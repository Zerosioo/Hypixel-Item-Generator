package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_DIAMOND_BLOCK extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Enchanted Diamond Block";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_DIAMOND_BLOCK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_BLOCK;
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
    public int getPrice() {
        return 204800;
    }

}
