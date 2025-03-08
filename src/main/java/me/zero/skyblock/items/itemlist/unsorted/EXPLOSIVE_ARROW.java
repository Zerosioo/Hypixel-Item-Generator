package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EXPLOSIVE_ARROW extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Explosive Arrow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EXPLOSIVE_ARROW"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ARROW;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public int getDamage() {
        return 3;
    }

}
