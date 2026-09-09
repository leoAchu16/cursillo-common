package org.cursillo.commons.entities.Usuarios;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cursillo.commons.entities.base.BaseEntity;

@Entity
@Table(name = "fichas_alumnos")
@Getter @Setter
public class FichaAlumno extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ficha", nullable = false)
    private Integer idFicha;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario alumno;

    @Column(name = "cedula", nullable = false)
    private String cedula;

    @Column(name = "ruc", nullable = false)
    private String ruc;

    @Column(name = "telefono_emergencia", nullable = false)
    private String telefonoEmergencia;

    @Column(name = "nombre_emergencia", nullable = false)
    private String nombreEmergencia;

    @Column(name = "observaciones")
    private String observaciones;
}
