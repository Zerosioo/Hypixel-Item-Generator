package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_LUSH_BERBERIS extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Enchanted Lush Berberis";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("A wonderful","enchanted plant!")); 
    }

    @Override
    public String getId() {
        return "ENCHANTED_LUSH_BERBERIS"; 
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
        return Tier.RARE;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 480;
    }

}
