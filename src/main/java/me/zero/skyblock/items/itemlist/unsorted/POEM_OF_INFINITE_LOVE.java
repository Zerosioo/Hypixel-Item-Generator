package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POEM_OF_INFINITE_LOVE extends SItem  {

    @Override
    public String getName() {
        return "§dPoem of True Love";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oFilled with poor","§7§opunctuation and","§7§omisspellings,","§7§obut its message","§7§ois profound.")); 
    }

    @Override
    public String getId() {
        return "POEM_OF_INFINITE_LOVE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PAPER;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

}
