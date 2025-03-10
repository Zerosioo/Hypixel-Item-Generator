package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STARRED_BONZO_STAFF extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Bonzo's Staff";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STARRED_BONZO_STAFF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BLAZE_ROD;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public int getDamage() {
        return 160;
    }

    @Override
    public int getIntelligence() {
        return 300;
    }

}
