package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JUJU_SHORTBOW extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Juju Shortbow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JUJU_SHORTBOW"; 
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
        return 310;
    }

    @Override
    public int getCritChance() {
        return 10;
    }

    @Override
    public int getCritDamage() {
        return 110;
    }

}
