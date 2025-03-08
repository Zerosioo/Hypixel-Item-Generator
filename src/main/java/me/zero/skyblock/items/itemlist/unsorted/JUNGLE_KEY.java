package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JUNGLE_KEY extends SItem  {

    @Override
    public String getName() {
        return "Jungle Key";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Used to open the","§7entrance to the","§7Jungle Temple.")); 
    }

    @Override
    public String getId() {
        return "JUNGLE_KEY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.TRIPWIRE_HOOK;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

}
