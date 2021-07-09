package com.example.oauth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/login/oauth")
public class OauthController {

    @GetMapping("/github")
    public ResponseEntity<String> githubLogin(@RequestParam String code) {
        RestTemplate restTemplate = new RestTemplate();
        OauthDto oauthDto = new OauthDto(
            {client_id},
            {client_secret},
            code
        );

        String accessToken = restTemplate.postForObject(
            "https://github.com/login/oauth/access_token",
            oauthDto,
            String.class
        );

        return ResponseEntity.ok(accessToken);
    }
}
