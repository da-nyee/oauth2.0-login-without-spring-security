package com.example.oauth.controller;

public class OauthDto {

    private String client_id;
    private String client_secret;
    private String code;

    private OauthDto() {
    }

    public OauthDto(String client_id, String client_secret, String code) {
        this.client_id = client_id;
        this.client_secret = client_secret;
        this.code = code;
    }

    public String getClient_id() {
        return client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public String getCode() {
        return code;
    }
}
