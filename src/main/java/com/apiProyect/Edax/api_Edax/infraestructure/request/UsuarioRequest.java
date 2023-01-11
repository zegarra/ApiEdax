package com.apiProyect.Edax.api_Edax.infraestructure.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UsuarioRequest {
    private Long idUsuario;
    private String nomUsuario;
    private String gmail;
    private String Pass;
}
