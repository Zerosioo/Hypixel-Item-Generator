package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AGARICUS_SOUP extends SItem  {

    @Override
    public String getName() {
        return "Agaricus Soup";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "AGARICUS_SOUP"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RABBIT_STEW;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

}
