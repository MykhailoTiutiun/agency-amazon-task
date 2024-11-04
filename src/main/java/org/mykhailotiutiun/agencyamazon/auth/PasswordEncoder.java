package org.mykhailotiutiun.agencyamazon.auth;

public interface PasswordEncoder {

    String encode(String password);
    boolean matches(String rawPassword, String encodedPassword);
}