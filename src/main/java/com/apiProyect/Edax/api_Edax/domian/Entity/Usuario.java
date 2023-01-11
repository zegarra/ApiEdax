package com.apiProyect.Edax.api_Edax.domian.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name="Usuario")
@Table(
        name="tbl_usuario",
        uniqueConstraints = {

                @UniqueConstraint(name="usuario_nomUsuario_unique", columnNames = "nomUsuario"),
        }
)

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idUsuario;
    private String nomUsuario;
    private String gmail;
    private String pass;
}
