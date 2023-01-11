package com.apiProyect.Edax.api_Edax.infraestructure.response;

import com.apiProyect.Edax.api_Edax.infraestructure.response.BasicResponse.BasicResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponse {
    private Object datosUsuario;
    private BasicResponse basicResponse;
}
