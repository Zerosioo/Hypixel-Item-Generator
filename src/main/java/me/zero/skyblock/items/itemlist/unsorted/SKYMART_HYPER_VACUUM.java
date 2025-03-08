package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SKYMART_HYPER_VACUUM extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "SkyMart Hyper Vacuum";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SKYMART_HYPER_VACUUM"; 
    }

    @Override
    public Material getMaterial() {
        return Material.POWERED_MINECART;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
