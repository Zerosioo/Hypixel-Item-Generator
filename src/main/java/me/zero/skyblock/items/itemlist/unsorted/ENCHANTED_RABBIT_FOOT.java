package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_RABBIT_FOOT extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Enchanted Rabbit Foot";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_RABBIT_FOOT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RABBIT_FOOT;
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
        return 800;
    }

}
