package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RUBY_CRYSTAL extends SItem implements SkullItem, Museum {

    @Override
    public String getName() {
        return "Ruby Crystal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RUBY_CRYSTAL"; 
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
        return Tier.SPECIAL;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMTQ2MzkzNTc3NSwKICAicHJvZmlsZUlkIiA6ICIwYTUzMDU0MTM4YWI0YjIyOTVhMGNlZmJiMGU4MmFkYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJQX0hpc2lybyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yMWRiZTMwYjAyN2FjYmNlYjYxMjU2M2JkODc3Y2Q3ZWJiNzE5ZWE2ZWQxMzk5MDI3ZGNlZTU4YmI5MDQ5ZDRhIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
