package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SORROW extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Sorrow";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oTo become a","§7§oghost, one must","§7§ogo through","§7§ounimaginable","§7§odistress.")); 
    }

    @Override
    public String getId() {
        return "SORROW"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GHAST_TEAR;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 13;
    }

}
