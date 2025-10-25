package com.movexa.prison.prison;

import java.util.HashMap;
import java.util.Map;

public class PrisonManager {
    private Map<String, Cell> cells;

    public PrisonManager() {
        this.cells = new HashMap<>();
    }

    public void addCell(String cellId, Cell cell) {
        cells.put(cellId, cell);
    }

    public Cell getCell(String cellId) {
        return cells.get(cellId);
    }

    public void removeCell(String cellId) {
        cells.remove(cellId);
    }

    public Map<String, Cell> getAllCells() {
        return cells;
    }

    public void clearCells() {
        cells.clear();
    }
}