package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRYPT_DREADLORD_SWORD extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Dreadlord Sword";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CRYPT_DREADLORD_SWORD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SWORD;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public int getPrice() {
        return 200;
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
