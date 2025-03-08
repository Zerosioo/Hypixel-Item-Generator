package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCARE_FRAGMENT extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Scare Fragment";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Imbued with the","§7pure essence of","§7terror, this shard","§7pulsates with an","§7unsettling energy.")); 
    }

    @Override
    public String getId() {
        return "SCARE_FRAGMENT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STAINED_GLASS;
    }

    @Override
    public byte getDurability() {
        return 15;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

}
