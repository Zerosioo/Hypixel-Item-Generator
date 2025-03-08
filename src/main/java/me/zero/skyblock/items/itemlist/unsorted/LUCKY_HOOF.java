package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LUCKY_HOOF extends SItem  {

    @Override
    public String getName() {
        return "Lucky Hoof";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LUCKY_HOOF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_BARDING;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

}
