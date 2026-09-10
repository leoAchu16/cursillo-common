package org.cursillo.commons.entities.Notas;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cursillo.commons.entities.Enums.EstadoNota;
import org.cursillo.commons.entities.Examenes.Examen;
import org.cursillo.commons.entities.Usuarios.Alumno;
import org.cursillo.commons.entities.Usuarios.Usuario;
import org.cursillo.commons.entities.base.BaseEntity;

@Entity
@Table(name = "notas")
@Getter @Setter
public class Nota extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nota", nullable = false)
    private Integer idNota;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_examen", nullable = false)
    private Examen examen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alumno", nullable = false)
    private Alumno alumno;

    @Column(name = "puntos_correctos")
    private Integer puntosCorrectos;

    @Column(name = "calificacion")
    private Integer calificacion;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_nota", nullable = false)
    private EstadoNota estadoNota;
}
