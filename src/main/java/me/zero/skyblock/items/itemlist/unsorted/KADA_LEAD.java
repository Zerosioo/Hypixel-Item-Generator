package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KADA_LEAD extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Kada Lead";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oThe lead has to","§7§obe exceedingly","§7§osoft due to the","§7§onature of the","§7§omount. The","§7§ochicken needs to","§7§obe comfy.")); 
    }

    @Override
    public String getId() {
        return "KADA_LEAD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEASH;
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
        return 50;
    }

}
