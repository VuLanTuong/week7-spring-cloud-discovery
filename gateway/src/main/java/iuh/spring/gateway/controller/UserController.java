package iuh.spring.gateway.controller;


import iuh.spring.gateway.model.UserInfo;
import iuh.spring.gateway.repository.UserInfoRepository;
import iuh.spring.gateway.service.JWTService;
import iuh.spring.gateway.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/gateway")
@RequiredArgsConstructor
public class UserController {
    private final UserInfoService userInfoService;
    private final JWTService jwtService;
    private final UserInfoRepository userInfoRepository;
    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }

    @PostMapping("/register")
    public String addNewUser(@RequestBody UserInfo userInfo) {

        return userInfoService.addUser(userInfo);
    }

}
