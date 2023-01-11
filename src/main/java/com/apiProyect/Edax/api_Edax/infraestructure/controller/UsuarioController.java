package com.apiProyect.Edax.api_Edax.infraestructure.controller;

import com.apiProyect.Edax.api_Edax.application.service.EdaxService;
import com.apiProyect.Edax.api_Edax.infraestructure.request.UsuarioRequest;
import com.apiProyect.Edax.api_Edax.infraestructure.response.BasicResponse.BasicResponse;
import com.apiProyect.Edax.api_Edax.infraestructure.response.UsuarioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    private EdaxService usuarioService;
    @GetMapping("/getUsuario")
    public ResponseEntity<UsuarioResponse> getConUsuario(
            @RequestParam(name = "nomUsuario", required = true) String nomUsuario){
        UsuarioResponse response = usuarioService.getConUsuarioByNomUsuario(nomUsuario);
        return ResponseEntity.status(response.getBasicResponse().getCode()).body(response);
    }

    // Punto 3 Agregar nueva Persona usando metodo POST
    @PostMapping("/addUser")
    public ResponseEntity<BasicResponse> addUsuario(
            @RequestBody UsuarioRequest request) {
        BasicResponse response = usuarioService.addUsuarioRegister(request);
        return ResponseEntity.status(response.getCode()).body(response);
    }
}

