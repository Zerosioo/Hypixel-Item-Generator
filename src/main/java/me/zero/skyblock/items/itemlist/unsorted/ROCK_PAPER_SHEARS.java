package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROCK_PAPER_SHEARS extends SItem  {

    @Override
    public String getName() {
        return "Rock Paper Shears";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROCK_PAPER_SHEARS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SHEARS;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

}
