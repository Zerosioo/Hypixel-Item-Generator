package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPOOKY_SHARD extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Spooky Shard";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPOOKY_SHARD"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5ODMzMzYxODQyNCwKICAicHJvZmlsZUlkIiA6ICI0YzhjNTIxZjMxZDI0ZDc1OThlNTI4YjRlODExOGMwNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTZXR5YXdhbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kODg0ZWQxOTUwYmI4YjE5OGFkYTgxOTE2ODQ0MDBiZDY2NDBlMDM3MTA0ODFjODEyMmI3ODBiOWVkMWJkOThjIgogICAgfQogIH0KfQ==";
    }

}
