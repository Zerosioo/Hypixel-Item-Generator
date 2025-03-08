package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BARRY_PEN extends SItem  {

    @Override
    public String getName() {
        return "Barry's Montgray Pen";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Use at the old","election box in the","back of the HQ.","","§8Signature Edition","§8- get it?")); 
    }

    @Override
    public String getId() {
        return "BARRY_PEN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEVER;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

}
