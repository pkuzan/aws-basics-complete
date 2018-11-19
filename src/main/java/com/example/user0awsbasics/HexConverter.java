package com.example.user0awsbasics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HexConverter {
    @GetMapping("/api/tohex")
    public String toHex(@RequestParam("number") int intToParse) {
        return Integer.toHexString(intToParse);
    }

    @GetMapping("/api/fromhex")
    public String fromHex(@RequestParam("number") String hexToParse) {
        int i = Integer.parseInt(hexToParse, 16);
        return Integer.toString(i);
    }
}