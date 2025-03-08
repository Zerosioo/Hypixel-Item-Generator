package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MUSHROOM_SPORE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Mushroom Spore";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oThe life cycle","§7§oof a mushroom","§7§ostarts with the","§7§ospore, which","§7§ogerms and","§7§obecomes","§7§oMycelium, which","§7§odevelops fruit","§7§obodies into a","§7§omature mushroom,","§7§oand that","§7§omushroom will","§7§orelease spores.")); 
    }

    @Override
    public String getId() {
        return "MUSHROOM_SPORE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BROWN_MUSHROOM;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 20;
    }

}
