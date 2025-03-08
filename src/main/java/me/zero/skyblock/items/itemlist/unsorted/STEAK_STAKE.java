package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STEAK_STAKE extends SItem  {

    @Override
    public String getName() {
        return "Steak Stake";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STEAK_STAKE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COOKED_MUTTON;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
