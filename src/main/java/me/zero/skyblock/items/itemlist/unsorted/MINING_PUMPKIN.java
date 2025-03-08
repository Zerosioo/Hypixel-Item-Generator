package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MINING_PUMPKIN extends SItem  {

    @Override
    public String getName() {
        return "Powder Pumpkin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MINING_PUMPKIN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PUMPKIN_PIE;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

}
