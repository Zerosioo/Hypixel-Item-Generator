package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOSS_SPIRIT_BOW extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Spirit Bow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BOSS_SPIRIT_BOW"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOW;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public int getDamage() {
        return 1;
    }

}
