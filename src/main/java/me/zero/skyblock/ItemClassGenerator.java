package me.zero.skyblock;

import com.google.gson.*;
import com.google.gson.JsonObject;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ItemClassGenerator {
    private static final String BASE_PACKAGE = "me.zero.skyblock.items.itemlist";

    public static void main(String[] args) {
        try {
            String json = fetchItemsJson();
            List<ItemBuilder> items = parseJson(json);
            generateClasses(items);
        } catch (Exception e) {
            System.err.println("Error generating items: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static String fetchItemsJson() throws IOException {
        Path filePath = Paths.get("src/main/resources/items.json");

        if (!Files.exists(filePath)) {
            throw new IOException("items.json file not found in src/main/resources");
        }
        return new String(Files.readAllBytes(filePath));
    }

    private static List<ItemBuilder> parseJson(String json) {
        List<ItemBuilder> items = new ArrayList<>();
        JsonElement rootElement = JsonParser.parseString(json);

        if (!rootElement.isJsonObject()) {
            System.err.println("Root element is not a JSON object");
            return items;
        }

        JsonObject root = rootElement.getAsJsonObject();
        if (!root.has("items") || !root.get("items").isJsonArray()) {
            System.err.println("Missing items array in response");
            return items;
        }

        JsonArray itemsArray = root.getAsJsonArray("items");
        for (JsonElement element : itemsArray) {
            try {
                JsonObject item = element.getAsJsonObject();
                items.add(new ItemBuilder(
                    getString(item, "id"),
                    getString(item, "material"),
                    getString(item, "texture"),
                    getString(item, "category"),
                    item
                ));
            } catch (Exception e) {
                System.err.println("Skipping invalid item: " + e.getMessage());
            }
        }
        return items;
    }

    private static void generateClasses(List<ItemBuilder> items) throws IOException {
        for (ItemBuilder item : items) {
            long startTime = System.currentTimeMillis();
            String category = sanitizeCategory(item.category);
            String className = sanitizeClassName(item.id);
            String packagePath = BASE_PACKAGE + ".unsorted";

            Path outputDir = Paths.get("src/main/java", packagePath.split("\\."));
            Files.createDirectories(outputDir);

            String code = generateClassCode(item, packagePath, className);
            Path filePath = outputDir.resolve(className + ".java");
            Files.write(filePath, code.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            System.out.println("Generated Item: " + className + " (took " + duration + " ms!)");
        }
    }

    private static String generateClassCode(ItemBuilder item, String packagePath, String className) {
        
        StringBuilder code = new StringBuilder();
            String lore = null;
            if (item.hasJsonKey("description")) {
            String full = item.getJsonString("description");

           full = full.replace("%%black%%", "§0")
           .replace("%%dark_blue%%", "§1")
           .replace("%%dark_green%%", "§2")
           .replace("%%dark_aqua%%", "§3")
           .replace("%%dark_red%%", "§4")
           .replace("%%dark_purple%%", "§5")
           .replace("%%gold%%", "§6")
           .replace("%%gray%%", "§7")
           .replace("%%dark_gray%%", "§8")
           .replace("%%blue%%", "§9")
           .replace("%%green%%", "§a")
           .replace("%%aqua%%", "§b")
           .replace("%%red%%", "§c")
           .replace("%%pink%%", "§d")
           .replace("%%yellow%%", "§e")
           .replace("%%white%%", "§f")
           .replace("%%obfuscated%%", "§k")
           .replace("%%bold%%", "§l")
           .replace("%%strikethrough%%", "§m")
           .replace("%%underline%%", "§n")
           .replace("%%italic%%", "§o")
           .replace("%%reset%%", "§r");
            List<String> l = ArrayUtils.stringToList(full, 20);
            lore = "new ArrayList(Arrays.asList(";
            for (String s : l) {
            lore += "\"" + s + "\",";
            }
          lore = lore.substring(0, lore.length() - 1);
          lore += "))";

       }
       
                String impl = "";
                if (item.has("stats")) {
                    impl += ",ItemStatistics";
                }
                if (item.has("skin")) {
                    impl += ",SkullItem";
                }
                if (item.has("color")) {
                    impl += ",ColoredArmor";
                }
                if (item.has("npc_sell_price")) {
                    impl += ", Sellable";
                }
                if (item.has("museum")) {
                	impl += ", Museum";
                }
                if (!impl.isEmpty()) {
                    impl = impl.substring(1);
                }
                
        
        code.append("package ").append(packagePath).append(";\n\n");
        code.append("import me.zero.skyblock.items.build.*;\n");
        code.append("import org.bukkit.Color;\n");
        code.append("import org.bukkit.Material;\n\n");
        code.append("import java.util.ArrayList;\n");
        code.append("import java.util.Arrays;\n");
        code.append("import java.util.List;\n\n");
        code.append("public class ").append(className);
        if (impl.isEmpty()) {
        code.append(" extends SItem ");
        } else {
        code.append(" extends SItem implements " + impl);
        }
        code.append(" {\n\n");
        code.append("    @Override\n")
            .append("    public String getName() {\n")
            .append("        return \"").append(item.getJsonString("name")).append("\";\n")
            .append("    }\n\n");
        code.append("    @Override\n")
            .append("    public List<String> getLore() {\n")
            .append("        return " + lore + "; \n    }\n\n");
         code.append("    @Override\n")
            .append("    public String getId() {\n")
            .append("        return \"" + item.id + "\"; \n    }\n\n");
        code.append("    @Override\n")
            .append("    public Material getMaterial() {\n")
            .append("        return Material.").append(item.material).append(";\n");
        code.append("    }\n\n");
        if (item.hasJsonKey("durability")) {
        code.append("    @Override\n");
        code.append("    public byte getDurability() {\n");
        code.append("        return " + item.getJsonInt("durability") +";\n");
        code.append("    }\n\n");
        }
        if (item.hasJsonKey("tier")) {
        code.append("    @Override\n");
        code.append("    public Tier getTier() {\n");
        code.append("        return Tier." + item.getJsonString("tier") + ";\n");
        code.append("    }\n\n");
        }
        if(item.has("color")) {
        code.append("    @Override\n");
        code.append("    public Color getColor() {\n");
        code.append("        return Color.fromRGB(" + item.getJsonString("color") + ");\n");
        code.append("    }\n\n");
        }
        if (item.hasJsonKey("unstackable")) {
        code.append("    @Override\n");
        code.append("    public boolean isUnStackable() {\n");
        code.append("        return " + item.getJsonString("unstackable") + ";\n");
        code.append("    }\n\n");
        }
        if (item.hasJsonKey("glowing")) {
        code.append("    @Override\n");
        code.append("    public boolean isGlowing() {\n");
        code.append("        return " + item.getJsonString("glowing") + ";\n");
        code.append("    }\n\n");
        }
        if (item.hasJsonKey("museum")) {
        code.append("    @Override\n");
        code.append("    public boolean isMuseum() {\n");
        code.append("        return " + item.getJsonString("museum") + ";\n");
        code.append("    }\n\n");
        }
        if (item.hasJsonKey("soulbound")) {
        code.append("    @Override\n");
        code.append("    public Soulbound getSoulbound() {\n");
        code.append("        return Soulbound." + item.getJsonString("soulbound") + ";\n");
        code.append("    }\n\n");
        }
        code.append(buildStat("getGearScore", "gear_score", item));
        code.append(buildStat("getPrice", "npc_sell_price", item));
        code.append(buildStat("getDamage", "DAMAGE", item));
        code.append(buildStat("getStrength", "strength", item));
        code.append(buildStat("getCritChance", "CRITICAL_CHANCE", item));
        code.append(buildStat("getCritDamage", "CRITICAL_DAMAGE", item));
        code.append(buildStat("getFerocity", "ferocity", item));
        code.append(buildStat("getAttackSpeed", "ATTACK_SPEED", item));
        code.append(buildStat("getHealth", "HEALTH", item));
        code.append(buildStat("getDefense", "DEFENSE", item));
        code.append(buildStat("getTrueDefense", "TRUE_DEFENSE", item));
        code.append(buildStat("getHealthRegeneration", "health_regeneration", item));
        code.append(buildStat("getVitality", "vitality", item));
        code.append(buildStat("getIntelligence", "INTELLIGENCE", item));
        if (item.hasJsonKey("ABILITY_DAMAGE_PERCENT")) {
        code.append("    @Override\n");
        code.append("    public double getAbilityDamage() {\n");
        code.append("        return " + item.getJsonInt("ABILITY_DAMAGE_PERCENT") +";\n");
        code.append("    }\n\n");
        }
        code.append(buildStat("getSwingRange", "SWING_RANGE", item));
        code.append(buildStat("getSpeed", "WALK_SPEED", item));
        code.append(buildStat("getMagicFind", "magic_find", item));
        code.append(buildStat("getPetLuck", "PET_LUCK", item));
        code.append(buildStat("getFarmingFortune", "FARMING_FORTUNE", item));
        code.append(buildStat("getMiningFortune", "MINING_FORTUNE", item));
        code.append(buildStat("getForagingFortune", "foraging_fortune", item));
        code.append(buildStat("getMiningSpeed", "MINING_SPEED", item));
        code.append(buildStat("getFishingSpeed", "fishing_speed", item));
      if (item.getJsonString("material").equals("SKULL_ITEM")) {
        code.append("    @Override\n")
            .append("    public String getTexture() {\n")
            .append("        return \"").append(item.getJsonString("value")).append("\";\n")
            .append("    }\n\n");
      }
        code.append("}\n");
        return code.toString();
        
    }
    
    private static String buildStat(String methodName, String buildKey, ItemBuilder item) {
    if (!item.hasJsonKey(buildKey)) {
        return ""; 
    }
    
    int value = item.getJsonInt(buildKey);
    
    return new StringBuilder()
        .append("    @Override\n")
        .append("    public int ").append(methodName).append("() {\n")
        .append("        return ").append(value).append(";\n")
        .append("    }\n\n")
        .toString();
    }



    private static String sanitizeCategory(String category) {
        String sanitized = category.replaceAll("[^a-zA-Z0-9]+", "_")
                                  .replaceAll("^_+|_+$", "");
        if (sanitized.matches("^\\d.*")) sanitized = "_" + sanitized;
        return sanitized.toLowerCase();
    }

    private static String sanitizeClassName(String id) {
        String sanitized = id.replaceAll("[^a-zA-Z0-9]+", "_")
                            .replaceAll("^_+|_+$", "");
        if (sanitized.isEmpty()) sanitized = "UnknownItem";
        if (sanitized.matches("^\\d.*")) sanitized = "_" + sanitized;
        return sanitized.toUpperCase();
    }

    private static String getString(JsonObject obj, String key) {
        return obj.has(key) ? obj.get(key).getAsString() : null;
    }

    private static class ItemBuilder {
    private final String id;
    private final String material;
    private final String texture;
    private final String category;
    private final JsonObject jsonObject;

    ItemBuilder(String id, String material, String texture, String category, JsonObject jsonObject) {
        this.id = id;
        this.material = material.toUpperCase();
        this.texture = texture;
        this.category = category != null ? category : "misc";
        this.jsonObject = jsonObject;
    }

    
    public String getJsonString(String key) {
        return getJsonStringRecursive(jsonObject, key);
    }
    
    public JsonObject getAsJsonObject() {
        return jsonObject;
    }
    
    public boolean has(String key) {
        return jsonObject.has(key);
    }
    
    public JsonElement get(String key) {
        return jsonObject.get(key);
    }

    
    public int getJsonInt(String key) {
        return getJsonIntRecursive(jsonObject, key);
    }

    
    public boolean hasJsonKey(String key) {
        return hasJsonKeyRecursive(jsonObject, key);
    }

    
    private String getJsonStringRecursive(JsonElement element, String key) {
        if (element.isJsonObject()) {
            JsonObject jsonObject = element.getAsJsonObject();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                if (entry.getKey().equals(key) && entry.getValue().isJsonPrimitive()) {
                    return entry.getValue().getAsString(); 
                }
                
                String result = getJsonStringRecursive(entry.getValue(), key);
                if (result != null) {
                    return result;
                }
            }
        } else if (element.isJsonArray()) {
            
            for (JsonElement item : element.getAsJsonArray()) {
                String result = getJsonStringRecursive(item, key);
                if (result != null) {
                    return result;
                }
            }
        }
        return null; 
    }

    
    private int getJsonIntRecursive(JsonElement element, String key) {
        if (element.isJsonObject()) {
            JsonObject jsonObject = element.getAsJsonObject();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                if (entry.getKey().equals(key) && entry.getValue().isJsonPrimitive()) {
                    return entry.getValue().getAsInt(); // Found key, return value
                }
                
                int result = getJsonIntRecursive(entry.getValue(), key);
                if (result != 0) {
                    return result;
                }
            }
        } else if (element.isJsonArray()) {
            
            for (JsonElement item : element.getAsJsonArray()) {
                int result = getJsonIntRecursive(item, key);
                if (result != 0) {
                    return result;
                }
            }
        }
        return 0; // Return 0 if key not found or isn't an integer
    }

    /
    private boolean hasJsonKeyRecursive(JsonElement element, String key) {
        if (element.isJsonObject()) {
            JsonObject jsonObject = element.getAsJsonObject();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                if (entry.getKey().equals(key)) {
                    return true; 
                }
                
                if (hasJsonKeyRecursive(entry.getValue(), key)) {
                    return true;
                }
            }
        } else if (element.isJsonArray()) {
            // If it's a JSON array, recursively check each element
            for (JsonElement item : element.getAsJsonArray()) {
                if (hasJsonKeyRecursive(item, key)) {
                    return true;
                }
            }
        }
        return false; 
    }
  }

}