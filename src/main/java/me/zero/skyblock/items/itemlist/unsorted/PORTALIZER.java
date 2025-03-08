package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PORTALIZER extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Portalizer";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PORTALIZER"; 
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
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3MDE3MDIwMDk0NywKICAicHJvZmlsZUlkIiA6ICJiMjdjMjlkZWZiNWU0OTEyYjFlYmQ5NDVkMmI2NzE0YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJIRUtUMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yYzkxNWRiM2ZjNDBhNzliNjNjMmM0NTNmMGM0OTA5ODFlNTIyN2M1MDI3NTAxMjgzMjcyMTM4NTMzZGVhNTE5IgogICAgfQogIH0KfQ==";
    }

}
