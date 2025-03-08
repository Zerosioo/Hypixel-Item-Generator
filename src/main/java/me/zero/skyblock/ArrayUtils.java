package me.zero.skyblock;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayUtils {
    public static List<String> objectToString(List<Object> list) {
        if (list == null || list.isEmpty()) return null;
        List<String> strings = new ArrayList<>(list.size());
        for (Object object : list) {
            strings.add(Objects.toString(object, null));
        }
        return strings;
    }

    public static String[] objectToString(Object[] list) {
        if (list == null || list.length == 0) return null;

        String[] strings = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            strings[i] = (String) list[i];
        }
        return strings;
    }

    private static final int MAX_CHARS_STRING = 25;

    public static List<String> stringToList(String string) {
        return stringToList(string, MAX_CHARS_STRING);
    }

    public static List<String> stringToList(String string, int maxCharsInString) {
        List<String> list = new ArrayList();
        if (string == null || string.length() == 0) return list;
        String[] words = string.replace("\n", " \n ").replace("  ", " ").split(" ");
        String color = null;
        String line = null;
        for (String s : words) {
            if (s.isEmpty()) continue;


            if (s.contains("\n")) {
                if (line != null)
                    list.add(line);
                line = ChatColor.getLastColors(color);
                continue;
            }

            if (line == null || line.isEmpty()) {
                line = s;
            } else if (line.length() == 2 && line.contains("§")) {
                line += s;
            } else {
                int sLength = s.length();
                if (sLength >= maxCharsInString) {
                    list.add(ChatColor.getLastColors(color) + s);
                } else if (sLength + line.length() >= maxCharsInString) {
                    list.add(line);
                    line = ChatColor.getLastColors(color) + s;
                } else {
                    line += " " + s;
                }
            }
            color += ChatColor.getLastColors(s);
        }
        if (line != null)
            list.add(line);
        return list;
    }
}