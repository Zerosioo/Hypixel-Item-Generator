package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EXPERIENCE_ARTIFACT extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Experience Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EXPERIENCE_ARTIFACT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ENCHANTED_BOOK;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public int getPrice() {
        return 115000;
    }

}
