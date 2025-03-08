package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_CARROT_ON_A_STICK extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Enchanted Carrot on a Stick";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_CARROT_ON_A_STICK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CARROT_STICK;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 10300;
    }

}
