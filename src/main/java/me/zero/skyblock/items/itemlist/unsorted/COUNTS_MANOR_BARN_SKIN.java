package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COUNTS_MANOR_BARN_SKIN extends SItem  {

    @Override
    public String getName() {
        return "Count's Manor Barn Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COUNTS_MANOR_BARN_SKIN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MOSSY_COBBLESTONE;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

}
