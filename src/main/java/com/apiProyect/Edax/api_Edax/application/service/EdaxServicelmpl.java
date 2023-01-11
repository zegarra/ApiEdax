package com.apiProyect.Edax.api_Edax.application.service;

import com.apiProyect.Edax.api_Edax.domian.Entity.ConUsuario;
import com.apiProyect.Edax.api_Edax.domian.Entity.Usuario;
import com.apiProyect.Edax.api_Edax.infraestructure.repository.UsuarioRepository;
import com.apiProyect.Edax.api_Edax.infraestructure.request.UsuarioRequest;
import com.apiProyect.Edax.api_Edax.infraestructure.response.BasicResponse.BasicResponse;
import com.apiProyect.Edax.api_Edax.infraestructure.response.UsuarioResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class EdaxServicelmpl  implements  EdaxService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public BasicResponse addUsuarioRegister(UsuarioRequest request){
        try{
            usuarioRepository.save(this.buildUsuarioFromRequest(request));
            return BasicResponse.registerSuccess();
        }catch (Exception e) {
            log.error(e.getMessage());
            return BasicResponse.whenError(e.getMessage());
        }

    }
    @Override
    public UsuarioResponse getConUsuarioByNomUsuario(String nomUsuario) {
        try {
            Usuario usuario = usuarioRepository.findByNomUsuario(nomUsuario);

            if (usuario != null) {
                return UsuarioResponse.builder()
                        .datosUsuario(buildUsuariosDatosConUsuario(usuario))
                        .basicResponse(BasicResponse.datosUsuario())
                        .build();
            } else {
                return UsuarioResponse.builder()
                        .datosUsuario(null)
                        .basicResponse(BasicResponse.whenNoDataUsuario())
                        .build();
            }

        } catch (Exception e) {
            return UsuarioResponse.builder()
                    .datosUsuario(null)
                    .basicResponse(BasicResponse.whenError(e.getMessage()))
                    .build();
        }
    }
    private ConUsuario buildUsuariosDatosConUsuario(Usuario usuario) {
        return ConUsuario.builder()
                .nomUsuario(usuario.getNomUsuario())
                .gmail(usuario.getGmail())
                .build();
    }
    private Usuario buildUsuarioFromRequest(UsuarioRequest request) {
        return Usuario.builder()
                .nomUsuario(request.getNomUsuario())
                .gmail(request.getGmail())
                .pass(request.getPass())
                .build();

    }
}
