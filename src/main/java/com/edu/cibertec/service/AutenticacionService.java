package com.edu.cibertec.service;

import com.edu.cibertec.dto.LoginRequestDTO;
import com.edu.cibertec.dto.LogoutRequestDTO;

import java.io.IOException;
import java.util.Date;

public interface AutenticacionService {
    String[] validarUsuario(LoginRequestDTO loginRequestDTO) throws IOException;
    Date cerrarSesionUsuario(LogoutRequestDTO logoutRequestDTO) throws IOException;
}
