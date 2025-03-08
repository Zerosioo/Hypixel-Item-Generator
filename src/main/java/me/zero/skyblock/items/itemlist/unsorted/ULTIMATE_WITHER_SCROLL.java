package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ULTIMATE_WITHER_SCROLL extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Ultimate Wither Scroll";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ULTIMATE_WITHER_SCROLL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOOK_AND_QUILL;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

}
