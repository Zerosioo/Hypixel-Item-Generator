package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BERBERIS_FUEL_INJECTOR extends SItem  {

    @Override
    public String getName() {
        return "Berberis Fuel Injector";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BERBERIS_FUEL_INJECTOR"; 
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

}
