package com.tzq.commons.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by cl24957 on 2018/5/14.
 */
public class LCCDataGuavaCache {
    static final Cache<String, String> CACHE = CacheBuilder.newBuilder()
            .initialCapacity(10000)
            .expireAfterWrite(5, TimeUnit.HOURS)
            .build();

    private static LCCDataGuavaCache guavaCache;

    private LCCDataGuavaCache() {
    }

    /**
     * 单例
     *
     * @return
     */
    public LCCDataGuavaCache instance() {
        if (guavaCache == null) {
            synchronized (this) {
                if (guavaCache == null) {
                    guavaCache = new LCCDataGuavaCache();
                }
            }
        }

        return guavaCache;
    }

    public void put(String key, String value) {
        CACHE.put(key, value);
    }

    public String get(String key) {
        try {
            return CACHE.get(key, null);
        } catch (ExecutionException e) {
            e.printStackTrace();
            return StringUtils.EMPTY;
        }
    }
}
