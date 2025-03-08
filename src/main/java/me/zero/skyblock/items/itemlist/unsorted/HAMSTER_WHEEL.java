package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HAMSTER_WHEEL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Hamster Wheel";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HAMSTER_WHEEL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.TRAP_DOOR;
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
        return 20000;
    }

}
