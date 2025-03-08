package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COLLECTION_DISPLAY extends SItem implements  Museum {

    @Override
    public String getName() {
        return "Collection Display";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Show off your","§7collection","§7progress!")); 
    }

    @Override
    public String getId() {
        return "COLLECTION_DISPLAY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.HAY_BLOCK;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

}
