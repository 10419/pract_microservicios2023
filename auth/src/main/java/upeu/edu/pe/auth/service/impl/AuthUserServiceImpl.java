package upeu.edu.pe.auth.service.impl;

import upeu.edu.pe.auth.dto.AuthUserDto;
import upeu.edu.pe.auth.dto.TokenDto;
import upeu.edu.pe.auth.entity.AuthUser;
import upeu.edu.pe.auth.repository.AuthRepository;
import upeu.edu.pe.auth.security.JwtProvider;
import upeu.edu.pe.auth.service.AuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;



@Service
public class AuthUserServiceImpl implements AuthUserService {
    @Autowired
    AuthRepository ar;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtProvider jwtProvider;

    @Override
    public AuthUser save(AuthUserDto dto) {
        Optional<AuthUser> user = ar.findByUserName(dto.getUserName());
        if (user.isPresent())
            return null;
        String password = passwordEncoder.encode(dto.getPassword());
        AuthUser authUser = AuthUser.builder()
                .userName(dto.getUserName())
                .password(password)
                .build();
        return ar.save(authUser);
    }
    @Override
    public TokenDto login(AuthUserDto dto) {
            Optional<AuthUser> user = ar.findByUserName(dto.getUserName());
            if(!user.isPresent())
                return null;
            if(passwordEncoder.matches(dto.getPassword(), user.get().getPassword()))
                return new TokenDto(jwtProvider.createToken(user.get()));
            return null;
        }

    @Override
    public TokenDto validate(String token) {
        if(!jwtProvider.validate(token))
            return null;
        String username = jwtProvider.getUserNameFromToken(token);
        if(!ar.findByUserName(username).isPresent())
            return null;
        return new TokenDto(token);
    }
}