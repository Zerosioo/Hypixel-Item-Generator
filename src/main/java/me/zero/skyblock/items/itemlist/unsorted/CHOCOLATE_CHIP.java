package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHOCOLATE_CHIP extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Fang-tastic Chocolate Chip";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHOCOLATE_CHIP"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COOKIE;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

}
