package com.hnam.shopplaystation.service.upload;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class UploadImageService {
    private final String uploadDir = "C:\\Users\\Admin\\Desktop\\ShopPlayStation\\images\\";

    public String storeFile(MultipartFile file) throws IOException {
        Path path = Paths.get(uploadDir, file.getOriginalFilename());
        Files.copy(file.getInputStream(), path);
        return file.getOriginalFilename();
    }
}
