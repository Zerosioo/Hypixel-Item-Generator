package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TRAP_DOOR extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Wooden Trapdoor";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TRAP_DOOR"; 
    }

    @Override
    public Material getMaterial() {
        return Material.TRAP_DOOR;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
