package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FULL_JAW_FANGING_KIT extends SItem  {

    @Override
    public String getName() {
        return "Full-Jaw Fanging Kit";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FULL_JAW_FANGING_KIT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 15;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

}
