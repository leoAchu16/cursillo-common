package org.cursillo.commons.entities.Materias;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cursillo.commons.entities.Enums.DiasSemana;
import org.cursillo.commons.entities.Usuarios.Profesor;
import org.cursillo.commons.entities.Usuarios.Usuario;
import org.cursillo.commons.entities.base.BaseEntity;


@Entity
@Table(name = "materias")
@Getter @Setter
public class Materia  extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia", nullable = false)
    private Integer idMateria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profesor", nullable = false)
    private Profesor profesor;

    @Column(name = "nombre_materia", nullable = false)
    private String nombreMateria;

    @Enumerated(EnumType.STRING)
    @Column(name ="dia", nullable = false)
    private DiasSemana dia;

    @Column(name = "descripcion")
    private String descripcion;

}
