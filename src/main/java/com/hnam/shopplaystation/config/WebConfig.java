package com.hnam.shopplaystation.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer{
    private final String uploadDir = "C:/Users/Admin/Desktop/ShopPlayStation/images/";

    @Override
    public void addResourceHandlers(@SuppressWarnings("null") ResourceHandlerRegistry registry) {
        if (uploadDir != null && !uploadDir.isEmpty()) {
            registry.addResourceHandler("/img/**")
                    .addResourceLocations("file:" + uploadDir);
        } else {
            throw new IllegalArgumentException("Upload directory path is not set or is empty.");
        }
    }
}
