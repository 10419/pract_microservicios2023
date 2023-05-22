package upeu.edu.pe.auth.service;

import upeu.edu.pe.auth.dto.AuthUserDto;
import upeu.edu.pe.auth.dto.TokenDto;
import upeu.edu.pe.auth.entity.AuthUser;

public interface AuthUserService {
    public AuthUser save(AuthUserDto dto);
    public TokenDto login(AuthUserDto dto);
    public TokenDto validate(String token);

}