package com.apiProyect.Edax.api_Edax.infraestructure.response.BasicResponse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BasicResponse {
    private int code;
    private String message;
    //whenSuccess/Correcto/200
    public static BasicResponse whenSuccess(){
        return BasicResponse.builder()
                .code(200)
                .message("correcto")
                .build();
    }

    //registerSuccess/Guardado/200
    public static BasicResponse registerSuccess(){
        return BasicResponse.builder()
                .code(200)
                .message("guardado")
                .build();
    }

    //whenCreate/creado/201
    public static BasicResponse whenCreate(){
        return BasicResponse.builder()
                .code(201)
                .message("creado")
                .build();
    }

    //datosUsuario/Vista Usuario/201
    public static BasicResponse datosUsuario(){
        return BasicResponse.builder()
                .code(201)
                .message("Vista Usuario")
                .build();
    }
    //whenPassNotMatch/Contraseña incorrecto/500
    public static BasicResponse whenPassNotMatch(){
        return BasicResponse.builder()
                .code(500)
                .message("Contraseña incorrecta ")
                .build();
    }
    //whenError/500
    public static BasicResponse whenError(String message){
        return BasicResponse.builder()
                .code(500)
                .message(message)
                .build();
    }

    //whenNoDataFound/404
    public static BasicResponse whenNoDataFound(String resource){
        return BasicResponse.builder()
                .code(404)
                .message("No "+resource +" found")
                .build();
    }
    //whenNoDataUsuario/No existe usuario/404
    public static BasicResponse whenNoDataUsuario(){
        return BasicResponse.builder()
                .code(404)
                .message("No existe usuario")
                .build();
    }
}
