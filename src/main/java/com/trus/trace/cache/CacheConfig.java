//package com.trus.trace.cache;
//
//import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@EnableCaching
//@Configuration
//public class CacheConfig {
//    @Bean
//    public CacheManagerCustomizer<ConcurrentMapCacheManager> cacheManagerCustomizer() {
//        return new CacheManagerCustomizer<ConcurrentMapCacheManager>() {
//            @Override
//            public void customize(ConcurrentMapCacheManager cacheManager) {
//                cacheManager.setAllowNullValues(false);
//            }
//        };
//    }
//}
