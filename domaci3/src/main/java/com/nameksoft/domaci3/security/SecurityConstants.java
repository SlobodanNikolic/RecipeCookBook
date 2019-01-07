package com.nameksoft.domaci3.security;

public class SecurityConstants {
	
    public static  String SECRET = "SecretKeyToGenJWTs";
    public static  long EXPIRATION_TIME = 864_000_000; // 10 days
    public static  String TOKEN_PREFIX = "Bearer ";
    public static  String HEADER_STRING = "Authorization";
    public static  String SIGN_UP_URL = "/users/sign-up";
    public static String LOCALHOST = "/";
    
}
