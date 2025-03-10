package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PUMPKIN_GUTS extends SItem  {

    @Override
    public String getName() {
        return "Pumpkin Guts";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PUMPKIN_GUTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PUMPKIN_SEEDS;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

}
