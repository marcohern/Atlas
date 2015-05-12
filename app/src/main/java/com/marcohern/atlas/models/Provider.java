package com.marcohern.atlas.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcoh on 11/05/15.
 */
public class Provider {
    public static List<Location> getLocations() {
        List<Location> locations = new ArrayList<>();

        locations.add(new Location(1,"Dad's House", 11.2077352,-74.2281519));
        locations.add(new Location(2,"Uncle Pedro's House", 11.196278, -74.229396));
        locations.add(new Location(3,"Uncle Luis's House", 11.2361769,-74.2055887));
        locations.add(new Location(4, "Aunt Beatriz's House", 11.2424319, -74.2137856));
        locations.add(new Location(5, "Club Santa Marta", 11.2405407,-74.2155705));
        return locations;
    }

    public static  List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "Banks"));
        categories.add(new Category(2, "Cattle"));
        categories.add(new Category(3, "Katarn"));
        return categories;
    }
}
