package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_WAND_WEAPON extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Test Rift Wand";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TEST_WAND_WEAPON"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STICK;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
