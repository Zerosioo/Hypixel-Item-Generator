package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PET_SKIN_SILVERFISH extends SItem implements SkullItem, Museum {

    @Override
    public String getName() {
        return "FortifiedSilverfish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PET_SKIN_SILVERFISH"; 
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
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NjY5MDc0MzMzMiwKICAicHJvZmlsZUlkIiA6ICJkMWYxODM4YjRlMTU0NTk0OGQwMjUwNzNkMzhjNWNjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJadWthWnVrYW1pIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Q4NTUyZmY1OTEwNDJjNGEzOGY4YmEwNjI2Nzg0YWUyOGM0NTQ1YTk3ZDQyM2ZkOTAzN2MzNDEwMzU1OTMyNzMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
