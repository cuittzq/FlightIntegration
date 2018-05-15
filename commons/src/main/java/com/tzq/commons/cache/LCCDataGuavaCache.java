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
        CACHE.asMap().put("CANSIN20181125","GnyaJaYZ7wuQvG1DsFEY7tc8GB0lrrEJNYtQF9ssRaGODSrL0clm98MFkZ+z1Jy+xM1mq20oxvuwj6+o1Q+/1MmaQv0yE7WBBdHZHSbXB82Epl82Of0UAj4Xzf+6T69G7wZ06ev7vXC0I2iq8YGoSmgClLQhEG1LSOKpZ+brzAQ0qpu9YVEQgVB7lSt8hof6oMkQ1SNnMbJ1wlap7aEk9cdP8ptajDkGBf067WqwW4xry31vZxLB5yyDQvKbuvqnySWdYtc9wOs3kK9pC41P2A==");
    }

    /**
     * 单例
     *
     * @return
     */
    public static LCCDataGuavaCache instance() {
        if (guavaCache == null) {
            synchronized (LCCDataGuavaCache.class) {
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
            return CACHE.asMap().get(key);
        } catch (Exception e) {
            e.printStackTrace();
            return StringUtils.EMPTY;
        }
    }
}
