package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_EYE_OF_ENDER extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Enchanted Eye of Ender";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_EYE_OF_ENDER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EYE_OF_ENDER;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 3520;
    }

}
