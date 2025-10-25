package com.movexa.prison.prison;

import java.util.HashMap;
import java.util.Map;

public class Cell {
    private String id;
    private String location;
    private boolean occupied;
    private String inmate;

    public Cell(String id, String location) {
        this.id = id;
        this.location = location;
        this.occupied = false;
        this.inmate = null;
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public String getInmate() {
        return inmate;
    }

    public void assignInmate(String inmateName) {
        if (!occupied) {
            this.inmate = inmateName;
            this.occupied = true;
        }
    }

    public void releaseInmate() {
        if (occupied) {
            this.inmate = null;
            this.occupied = false;
        }
    }

    public Map<String, Object> toMap() {
        Map<String, Object> cellData = new HashMap<>();
        cellData.put("id", id);
        cellData.put("location", location);
        cellData.put("occupied", occupied);
        cellData.put("inmate", inmate);
        return cellData;
    }
}