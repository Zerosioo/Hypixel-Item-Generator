package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PET_SKIN_TIGER_TWILIGHT extends SItem implements SkullItem, Museum {

    @Override
    public String getName() {
        return "TwilightTiger";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PET_SKIN_TIGER_TWILIGHT"; 
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
        return Tier.MYTHIC;
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NjU0MjM1MzgxMSwKICAicHJvZmlsZUlkIiA6ICI1NWQ4NzcyODJmMDc0MWM5ODMyNjBhZDQ3OGE4ODNhMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUYW1ha2lfSXJvaGExIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzg5NjIxMWRjNTk5MzY4ZGJkOTA1NmMwMTE2YWI2MTA2Mzk5MWRiNzkzYmU5MzA2NmE4NThlYjRlOWNlNTY0MzgiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
