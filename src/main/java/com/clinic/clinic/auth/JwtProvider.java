//package com.clinic.clinic.auth;
//
//import io.jsonwebtoken.*;
//import io.jsonwebtoken.security.SignatureException;
//import org.springframework.security.core.Authentication;
//
//import java.nio.file.attribute.UserPrincipal;
//import java.util.Date;
//
//public class JwtProvider {
//    private static final String JWT_SECRET = "fpJTaUsvyu7YiJIY44wMOEG4eUjdXwH2DWnZPMImTNs=";
//    private static final long JWT_EXPIRATION = 604800000L; // 1 week
//
//    public String generateToken(Authentication authentication) {
//        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
//        Date now = new Date();
//        Date expiryDate = new Date(now.getTime() + JWT_EXPIRATION);
//
//        return Jwts.builder()
//                .setSubject(userPrincipal.getName())
//                .setIssuedAt(now)
//                .setExpiration(expiryDate)
//                .signWith(SignatureAlgorithm.HS512, JWT_SECRET)
//                .compact();
//
//    }
//
//
//    public boolean validateToken(String token) {
//        try {
//            Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token);
//            return true;
//        } catch (SignatureException e) {
//            // Invalid JWT signature
//            System.out.println("Invalid JWT signature: " + e.getMessage());
//        } catch (MalformedJwtException e) {
//            // Invalid JWT token
//            System.out.println("Invalid JWT token: " + e.getMessage());
//        } catch (ExpiredJwtException e) {
//            // JWT token has expired
//            System.out.println("JWT token has expired: " + e.getMessage());
//        } catch (UnsupportedJwtException e) {
//            // JWT token is not supported
//            System.out.println("JWT token is not supported: " + e.getMessage());
//        } catch (IllegalArgumentException e) {
//            // JWT claims are empty
//            System.out.println("JWT claims are empty: " + e.getMessage());
//        }
//        return false;
//    }
//
//    public String getUsernameFromToken(String token) {
//        Claims claims = Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token).getBody();
//        return claims.getSubject();
//    }
//
//
//}
