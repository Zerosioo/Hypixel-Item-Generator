package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRYPT_WITHERLORD_SWORD extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Crypt Witherlord Sword";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CRYPT_WITHERLORD_SWORD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_SWORD;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public int getIntelligence() {
        return 0;
    }

}
