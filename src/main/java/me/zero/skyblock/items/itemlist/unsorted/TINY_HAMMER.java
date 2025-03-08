package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TINY_HAMMER extends SItem  {

    @Override
    public String getName() {
        return "remmaH yniT";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList(".wohemoS")); 
    }

    @Override
    public String getId() {
        return "TINY_HAMMER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_AXE;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

}
