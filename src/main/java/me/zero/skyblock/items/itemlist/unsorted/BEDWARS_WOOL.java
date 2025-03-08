package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BEDWARS_WOOL extends SItem  {

    @Override
    public String getName() {
        return "Tree-like Wool";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Good for bridging.")); 
    }

    @Override
    public String getId() {
        return "BEDWARS_WOOL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOL;
    }

    @Override
    public byte getDurability() {
        return 12;
    }

    @Override
    public Tier getTier() {
        return Tier.COMMON;
    }

}
