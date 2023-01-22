package io.github.titedog.struct.api.util;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ListUtil {
    public static <T> ArrayList<T> mergeArrayLists(ArrayList<T> original, ArrayList<T> other) {
        LinkedHashSet<T> set = new LinkedHashSet<>(original);
        set.addAll(other);
        return new ArrayList<>(set);
    }
}