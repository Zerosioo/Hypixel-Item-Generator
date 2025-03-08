package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BRAIDED_GRIFFIN_FEATHER extends SItem  {

    @Override
    public String getName() {
        return "Braided Griffin Feather";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BRAIDED_GRIFFIN_FEATHER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STRING;
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
