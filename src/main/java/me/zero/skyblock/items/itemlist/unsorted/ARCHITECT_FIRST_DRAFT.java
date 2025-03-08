package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARCHITECT_FIRST_DRAFT extends SItem  {

    @Override
    public String getName() {
        return "Architect's First Draft";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARCHITECT_FIRST_DRAFT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PAPER;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

}
