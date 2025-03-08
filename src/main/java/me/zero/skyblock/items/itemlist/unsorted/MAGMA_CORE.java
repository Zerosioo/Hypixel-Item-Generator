package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGMA_CORE extends SItem  {

    @Override
    public String getName() {
        return "Magma Core";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAGMA_CORE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MAGMA_CREAM;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
