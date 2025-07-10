package org.example.jwt.controller;

import org.example.jwt.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/authenticate")
public class AuthenticationController {
        @Autowired
        private JwtService jwtService;
        @GetMapping
        public ResponseEntity<?> authenticateUser(Authentication authentication) {
            String token = jwtService.generateToken(authentication.getName());
            return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
        }
    }
