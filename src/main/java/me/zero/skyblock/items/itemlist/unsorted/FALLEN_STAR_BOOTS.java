package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FALLEN_STAR_BOOTS extends SItem implements ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Fallen Star Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FALLEN_STAR_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_CHESTPLATE;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(88,97,88);
    }

    @Override
    public int getPrice() {
        return 500;
    }

}
