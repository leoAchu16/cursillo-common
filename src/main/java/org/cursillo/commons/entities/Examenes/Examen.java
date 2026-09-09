package org.cursillo.commons.entities.Examenes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cursillo.commons.entities.Enums.EstadoExamen;
import org.cursillo.commons.entities.Materias.Materia;
import org.cursillo.commons.entities.Usuarios.Profesor;
import org.cursillo.commons.entities.Usuarios.Usuario;
import org.cursillo.commons.entities.base.BaseEntity;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "examenes")
@Getter @Setter
public class Examen extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_examen", nullable = false)
    private Integer idExamen;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_examen", nullable = false)
    private EstadoExamen estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_materia", nullable = false)
    private Materia materia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profesor", nullable = false)
    private Profesor profesor;

    @Column(name = "hora", nullable = false)
    private LocalTime hora;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "total_puntos", nullable = false)
    private Integer totalPuntos;

}
