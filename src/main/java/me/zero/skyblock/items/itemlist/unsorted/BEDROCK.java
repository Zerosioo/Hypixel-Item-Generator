package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BEDROCK extends SItem implements  Sellable, Museum {

    @Override
    public String getName() {
        return "Bedrock";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§cI guess you have","§cthis now.")); 
    }

    @Override
    public String getId() {
        return "BEDROCK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BEDROCK;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
