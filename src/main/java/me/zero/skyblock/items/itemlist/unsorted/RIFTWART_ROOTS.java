package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RIFTWART_ROOTS extends SItem  {

    @Override
    public String getName() {
        return "Riftwart Roots";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Do not eat.")); 
    }

    @Override
    public String getId() {
        return "RIFTWART_ROOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.NETHER_STALK;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

}
