package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class METAPHORIC_EGG extends SItem  {

    @Override
    public String getName() {
        return "Metaphoric Egg";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("A ticking time bomb","to new life.","Acquired using","Berberis Blowgun.")); 
    }

    @Override
    public String getId() {
        return "METAPHORIC_EGG"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EGG;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
