package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOTTLED_ODONATA extends SItem  {

    @Override
    public String getName() {
        return "Bottled Odonata";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BOTTLED_ODONATA"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EXP_BOTTLE;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
