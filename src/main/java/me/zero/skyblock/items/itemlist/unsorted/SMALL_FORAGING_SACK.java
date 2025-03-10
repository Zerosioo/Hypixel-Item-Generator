package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SMALL_FORAGING_SACK extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Small Foraging Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SMALL_FORAGING_SACK"; 
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
        return Tier.UNCOMMON;
    }

    @Override
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NTQ1NTMzOSwKICAicHJvZmlsZUlkIiA6ICI3NmM4Y2ZlYjE1N2U0MGEwYmNlNjQ4NTgwZGEwNmQwNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTcGlrZWhpZGRlbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80Zjk2MGM2MzlkNDAwNGQxODgyNTc1YWViYTY5ZjQ1NmZiM2M3NDQwNzc5MzU3MTQ5NDdlMTljMTMwNmQyNzMzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
