package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AGARIMOO_TONGUE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Agarimoo Tongue";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Agarimoos have five","stomachs and 3","tongues. For this","specific Agarimoo,","past tense is more","accurate.")); 
    }

    @Override
    public String getId() {
        return "AGARIMOO_TONGUE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MUTTON;
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
        return 2050;
    }

}
