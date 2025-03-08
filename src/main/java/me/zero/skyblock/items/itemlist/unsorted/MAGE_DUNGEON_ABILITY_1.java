package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGE_DUNGEON_ABILITY_1 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Pop-up Wall";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAGE_DUNGEON_ABILITY_1"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BRICK;
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
        return 1;
    }

}
