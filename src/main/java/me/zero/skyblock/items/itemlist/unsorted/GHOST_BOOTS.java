package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GHOST_BOOTS extends SItem implements ColoredArmor, Sellable, Museum {

    @Override
    public String getName() {
        return "Ghostly Boots";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oBoots made of","§7§opure ghost","§7§oessence.")); 
    }

    @Override
    public String getId() {
        return "GHOST_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_BOOTS;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(128,128,128);
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 77777;
    }

}
