package org.cursillo.commons.entities.Inscripciones;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cursillo.commons.entities.Enums.EstadoPago;
import org.cursillo.commons.entities.Usuarios.Alumno;
import org.cursillo.commons.entities.Usuarios.Secretaria;
import org.cursillo.commons.entities.base.BaseEntity;

import java.time.LocalDate;

@Entity
@Table(name = "inscripciones")
@Getter @Setter
public class Inscripcion extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscripcion", nullable = false)
    private Integer idInscripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alumno", nullable = false)
    private Alumno alumno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_secretaria", nullable = false)
    private Secretaria secretaria;

    @Column(name = "fecha_inscripcion", nullable = false)
    private LocalDate fechaInscripcion;

    @Column(name = "total", nullable = false)
    private Integer total;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_pago", nullable = false)
    private EstadoPago estadoPago;
}
