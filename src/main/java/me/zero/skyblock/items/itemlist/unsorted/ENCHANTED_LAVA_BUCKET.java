package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_LAVA_BUCKET extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Enchanted Lava Bucket";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_LAVA_BUCKET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LAVA_BUCKET;
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
    public int getPrice() {
        return 50000;
    }

}
