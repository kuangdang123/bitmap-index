package com.bitmapindex.backend.model;
import java.util.HashMap;
import java.util.Map;
/**
 * 位图条目
 * */
public class BitmapEntry {
    private Map<Long, byte[]> bitmap;

    public BitmapEntry() {
        this.bitmap = new HashMap<>();
    }
}
