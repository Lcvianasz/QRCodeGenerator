package com.example.QRCodeGenerator.controller;

import com.example.QRCodeGenerator.service.QRCodeService;
import com.google.zxing.WriterException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/qrcode")
public class QRCodeController {
    private final QRCodeService qrCodeService;

    public QRCodeController(QRCodeService qrCodeService) {
        this.qrCodeService = qrCodeService;
    }
    @GetMapping
    public ResponseEntity<byte[]> generateQRCode(@RequestParam String text){
        try {
            byte[] qrCode = qrCodeService.generateQRCodeImage(text, 250, 250);
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.IMAGE_PNG_VALUE)
                    .body(qrCode);
        } catch (WriterException | IOException e){
            return ResponseEntity.status(500).build();
        }
    }
}
