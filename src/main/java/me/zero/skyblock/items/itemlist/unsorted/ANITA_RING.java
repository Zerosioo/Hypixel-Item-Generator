package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANITA_RING extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Anita's Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ANITA_RING"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5NzU4NDEzODQ5NywKICAicHJvZmlsZUlkIiA6ICIzYjA2ZTc3YzAzYTg0MGExOGIzOGY0Y2Q1ZWE0YzYxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJIT1JVU19JTyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81OWExMDM1YmM2ZjAwZmRkYzhlMDI5MWMzODMxOTQwOGJhYmM4NGFlMTA2NDhjYjUyNThlZDhiNTVkNjBlMGMzIgogICAgfQogIH0KfQ==";
    }

}
