package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BINGO_DISPLAY extends SItem implements  Museum {

    @Override
    public String getName() {
        return "Bingo Display";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Show off your","§7total §6Bingo","§6Points§7!")); 
    }

    @Override
    public String getId() {
        return "BINGO_DISPLAY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COAL_BLOCK;
    }

    @Override
    public Tier getTier() {
        return Tier.COMMON;
    }

    @Override
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

}
