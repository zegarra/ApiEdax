package com.apiProyect.Edax.api_Edax.application.service;

import com.apiProyect.Edax.api_Edax.infraestructure.request.UsuarioRequest;
import com.apiProyect.Edax.api_Edax.infraestructure.response.BasicResponse.BasicResponse;
import com.apiProyect.Edax.api_Edax.infraestructure.response.UsuarioResponse;

public interface EdaxService {
    public BasicResponse addUsuarioRegister(UsuarioRequest request);
    public UsuarioResponse getConUsuarioByNomUsuario(String nomUsuario);
}
