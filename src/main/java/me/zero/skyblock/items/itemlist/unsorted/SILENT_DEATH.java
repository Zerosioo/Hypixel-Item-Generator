package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILENT_DEATH extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Silent Death";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SILENT_DEATH"; 
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
    public int getGearScore() {
        return 40;
    }

    @Override
    public int getPrice() {
        return 20000;
    }

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public int getCritChance() {
        return 0;
    }

    @Override
    public int getCritDamage() {
        return 0;
    }

}
