package com.marcohern.atlas.models;

import java.io.Serializable;

/**
 * Created by marcoh on 6/05/15.
 */
public class Location implements Serializable {
    private long id;
    private String name;
    private double lat;
    private double lng;

    private void setup(long id, String name, double lat, double lng) {
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
    }

    public Location() {
        setup(0, "", 0.0, 0.0);
    }

    public Location(long id, String name, double lat, double lng) {
        setup(id, name, lat, lng);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
