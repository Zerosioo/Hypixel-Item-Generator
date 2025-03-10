package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DEFECTIVE_MONITOR extends SItem implements ItemStatistics,SkullItem {

    @Override
    public String getName() {
        return "Defective Monitor";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Obtained from a","Kloon who doesn't","seem too stable.")); 
    }

    @Override
    public String getId() {
        return "DEFECTIVE_MONITOR"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SKULL_ITEM;
    }

    @Override
    public byte getDurability() {
        return 3;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NjAxMDA0NTg2ODMsInByb2ZpbGVJZCI6ImZkNjBmMzZmNTg2MTRmMTJiM2NkNDdjMmQ4NTUyOTlhIiwicHJvZmlsZU5hbWUiOiJSZWFkIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jMDFhOWNhMzEwZmI5NmU2YzBhYWEzZWExZDA1ODVmMmY0MTc2NWQ2YWE5OTcwM2JmODYxZjJlNzY5ZDI0ZGM1In19fQ==";
    }

}
