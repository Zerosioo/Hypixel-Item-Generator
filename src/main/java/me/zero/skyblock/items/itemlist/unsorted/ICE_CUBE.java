package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ICE_CUBE extends SItem  {

    @Override
    public String getName() {
        return "Ice Cube";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ICE_CUBE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PACKED_ICE;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
