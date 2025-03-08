package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FESTIVE_FRISBEE extends SItem  {

    @Override
    public String getName() {
        return "Festive Frisbee";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Doesn't do","anything... yet!")); 
    }

    @Override
    public String getId() {
        return "FESTIVE_FRISBEE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_PLATE;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

}
