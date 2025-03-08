package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LARGE_ENCHANTED_CHEST extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Large Storage";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LARGE_ENCHANTED_CHEST"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CHEST;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public int getPrice() {
        return 40000;
    }

}
