package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PET_ITEM_TIER_BOOST_DROP extends SItem  {

    @Override
    public String getName() {
        return "Tier Boost Core";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PET_ITEM_TIER_BOOST_DROP"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 1;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

}
