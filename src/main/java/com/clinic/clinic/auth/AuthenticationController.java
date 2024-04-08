//package com.clinic.clinic.auth;
//
//import com.clinic.clinic.doctor.Doctor;
//import com.clinic.clinic.doctor.DoctorService;
//import com.clinic.clinic.patient.Patient;
//import com.clinic.clinic.patient.PatientService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("api/v1/auth")
//public class AuthenticationController {
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private JwtProvider jwtProvider;
//
//    @PostMapping("/authenticate")
//    public ResponseEntity<?> authenticate(@RequestBody AuthenticationRequest request) {
//        try {
//            Authentication authentication = authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
//            );
//
//            String token = jwtProvider.generateToken(authentication);
//            return ResponseEntity.ok(new AuthenticationResponse(token));
//        } catch (AuthenticationException e) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
//        }
//    }
//
////    @Autowired
////    private AuthenticationManager authenticationManager;
////
////    @Autowired
////    private JwtTokenUtil jwtTokenUtil;
////
////    @Autowired
////    private DoctorService doctorService;
////
////    @Autowired
////    private PatientService patientService;
////
////    @PostMapping("/doctor/login")
////    public ResponseEntity<?> doctorLogin(@RequestBody AuthenticationRequest authenticationRequest) {
////        final org.springframework.security.core.Authentication authentication = authenticationManager.authenticate(
////                new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
////        );
////
////        SecurityContextHolder.getContext().setAuthentication(authentication);
////        final String token = jwtTokenUtil.generateToken(String.valueOf(authentication));
////
////        Doctor doctor = doctorService.findByUsername(authenticationRequest.getUsername());
////
////        return ResponseEntity.ok(new AuthenticationResponse(token, doctor));
////    }
////
////    @PostMapping("/patient/login")
////    public ResponseEntity<?> patientLogin(@RequestBody AuthenticationRequest authenticationRequest) {
////        final Authentication authentication = authenticationManager.authenticate(
////                new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
////        );
////
////        SecurityContextHolder.getContext().setAuthentication(authentication);
////        final String token = jwtTokenUtil.generateToken(String.valueOf(authentication));
////
////        Patient patient = patientService.findByUsername(authenticationRequest.getUsername());
////
////        return ResponseEntity.ok(new AuthenticationResponse(token, patient));
////    }
//}
//
