package com.example.uploadfiles.controllers;


import com.example.uploadfiles.services.IUploadFilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class UploadFilesController {


    @Autowired
    IUploadFilesService uploadFilesService;

    @PostMapping("/picture")
    private ResponseEntity<String> uploadPic(MultipartFile file){

        return new ResponseEntity<>(uploadFilesService.handleFileUpload(file));

    }

}
