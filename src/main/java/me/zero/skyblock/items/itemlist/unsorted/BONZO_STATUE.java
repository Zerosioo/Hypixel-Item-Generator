package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BONZO_STATUE extends SItem implements SkullItem, Museum {

    @Override
    public String getName() {
        return "Bonzo Statue";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BONZO_STATUE"; 
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
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzNzQ5MDIyNjYyOSwKICAicHJvZmlsZUlkIiA6ICI2MTZiODhkNDMwNzM0ZTM3OWM3NDc1ODdlZTJkNzlmZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJKZWxseUZpbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jYjUzNDE2OGM1MjYxOGU0NzcwMTVkZjdlZWQ3OWQyZDVmZTRkN2Y3MmYwMGQ0YjcxMzZmY2ZiOTI2MWY0MDJjIgogICAgfQogIH0KfQ==";
    }

}
