package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WITCH_HAT extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Witch Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WITCH_HAT"; 
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
        return Tier.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MTA1NTQ0OSwKICAicHJvZmlsZUlkIiA6ICIwMzY2OTMwNzgwY2U0NWMzYWM2OWRiOWZjODdmYzcxYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJpcm9uZGVzbyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84MGNmNjQ5NWZmNGEzNjBhYTFkNjgxYTRmM2FhMzRhYWQ4NzQwOWM1ZjdjN2RiYzkyMGM3NGQwNjlmNjQ4OGM4IgogICAgfQogIH0KfQ==";
    }

}
