package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YOUNGITE extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Youngite";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7All sparkle and no","§7substance.")); 
    }

    @Override
    public String getId() {
        return "YOUNGITE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyNTMyNTc5Mjk5MywKICAicHJvZmlsZUlkIiA6ICI5ZDYzZjMxMGNiZWE0MWI1YmQ4YTM4ZmExYTBiMDI4MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTa3libHVlZm94dGFpbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82ZmFkNzAyOGU4NzlhNjM4MjA3YmVkNTQzNWE4ZTVkYWNkNDgzMDZlNWM1NmRhMjIzMTQ5NjM2ZTAzZTMzOGIiCiAgICB9CiAgfQp9";
    }

}
