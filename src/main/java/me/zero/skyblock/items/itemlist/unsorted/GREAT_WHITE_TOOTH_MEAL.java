package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GREAT_WHITE_TOOTH_MEAL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Great White Tooth Meal";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("It smells like blood","and fear.")); 
    }

    @Override
    public String getId() {
        return "GREAT_WHITE_TOOTH_MEAL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 15;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 12000;
    }

}
