package com.kowalczykemil.springbootimageuploader;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageUploaderApi {

    @GetMapping("/")
    public String get() {
        return "Hello";
    }

    @GetMapping("/upload-file")

}
