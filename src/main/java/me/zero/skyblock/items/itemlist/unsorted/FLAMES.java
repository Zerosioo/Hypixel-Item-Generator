package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAMES extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Flames";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oSome say that","§7§othe same","§7§osubstance can be","§7§ofound in the","§7§oabdomen of","§7§oDragons,","§7§oallowing them to","§7§obreathe fire.","§7§oCinderbats are","§7§omuch cuter","§7§othough.")); 
    }

    @Override
    public String getId() {
        return "FLAMES"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BLAZE_POWDER;
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
        return 200;
    }

}
