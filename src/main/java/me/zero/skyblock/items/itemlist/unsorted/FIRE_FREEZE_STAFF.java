package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIRE_FREEZE_STAFF extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Fire Freeze Staff";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FIRE_FREEZE_STAFF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.YELLOW_FLOWER;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public int getPrice() {
        return 1750;
    }

    @Override
    public int getDamage() {
        return 50;
    }

}
