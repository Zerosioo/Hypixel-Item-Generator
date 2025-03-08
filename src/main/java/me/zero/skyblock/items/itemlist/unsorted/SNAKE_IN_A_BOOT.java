package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SNAKE_IN_A_BOOT extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Snake-in-a-Boot";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("You've got a friend","in me.")); 
    }

    @Override
    public String getId() {
        return "SNAKE_IN_A_BOOT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_BOOTS;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(26,0,76);
    }

}
