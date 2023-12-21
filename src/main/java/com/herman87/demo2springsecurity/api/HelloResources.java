package com.herman87.demo2springsecurity.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResources {
    @GetMapping("/protected")
    public ResponseEntity<String> method1() {
        return ResponseEntity.status(HttpStatus.OK).body("endpoint protected");
    }

    @GetMapping("/user")
    public ResponseEntity<String> method2() {
        return ResponseEntity.status(HttpStatus.OK).body("endpoint authorize to a user");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> method3() {
        return ResponseEntity.status(HttpStatus.OK).body("endpoint authorize to a admin");
    }

    @GetMapping("/public")
    public ResponseEntity<String> method4() {
        return ResponseEntity.status(HttpStatus.OK).body("unprotected endpoint");
    }
}
