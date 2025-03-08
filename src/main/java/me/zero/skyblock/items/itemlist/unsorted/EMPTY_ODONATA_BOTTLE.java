package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EMPTY_ODONATA_BOTTLE extends SItem  {

    @Override
    public String getName() {
        return "Empty Odonata Bottle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EMPTY_ODONATA_BOTTLE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GLASS_BOTTLE;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

}
