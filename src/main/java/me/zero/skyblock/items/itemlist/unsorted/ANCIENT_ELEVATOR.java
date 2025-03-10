package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANCIENT_ELEVATOR extends SItem implements  Museum {

    @Override
    public String getName() {
        return "Ancient Elevator";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ANCIENT_ELEVATOR"; 
    }

    @Override
    public Material getMaterial() {
        return Material.QUARTZ_STAIRS;
    }

    @Override
    public Tier getTier() {
        return Tier.SPECIAL;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

}
