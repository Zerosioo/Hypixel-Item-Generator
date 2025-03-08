package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LUSH_BERBERIS extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Lush Berberis";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("A wonderful plant!")); 
    }

    @Override
    public String getId() {
        return "LUSH_BERBERIS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DOUBLE_PLANT;
    }

    @Override
    public byte getDurability() {
        return 3;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 3;
    }

}
