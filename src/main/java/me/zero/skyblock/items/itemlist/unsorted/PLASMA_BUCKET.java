package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PLASMA_BUCKET extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Plasma Bucket";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PLASMA_BUCKET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LAVA_BUCKET;
    }

    @Override
    public Tier getTier() {
        return Tier.MYTHIC;
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
