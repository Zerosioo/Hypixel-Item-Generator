package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILVER_HUNTER_CHESTPLATE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Silver Hunter Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SILVER_HUNTER_CHESTPLATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_CHESTPLATE;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public int getHealth() {
        return 185;
    }

    @Override
    public int getDefense() {
        return 185;
    }

}
