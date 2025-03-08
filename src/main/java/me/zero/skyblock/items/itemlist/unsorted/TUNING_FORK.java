package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TUNING_FORK extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Tuning Fork";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TUNING_FORK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BIRCH_FENCE;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public int getPrice() {
        return 100;
    }

}
