package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAME_BREAKER_BOOTS extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Flamebreaker Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLAME_BREAKER_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CHAINMAIL_BOOTS;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public int getHealth() {
        return 35;
    }

    @Override
    public int getDefense() {
        return 35;
    }

    @Override
    public int getMiningFortune() {
        return 15;
    }

    @Override
    public int getMiningSpeed() {
        return 25;
    }

}
