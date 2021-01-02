package com.cs.cs.security;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;

@Getter
@ToString
public class JwtConfig {
    private String Uri;

    private String header;

    private String prefix;

    private int expiration;

    private String secret;

    public JwtConfig() {
        Uri = "/auth/**";
        header = "Authorization";
        prefix = "Bearer ";
        expiration = 24 * 60 * 60;
        secret = "thisisasuperlongmicroservicesecreatkeywithspringmicroserviceeurekazuulribbonanddiscoveryandsecrurityandfeing1234567890createdbynhamchithanhin12302020at1422";
    }
}
