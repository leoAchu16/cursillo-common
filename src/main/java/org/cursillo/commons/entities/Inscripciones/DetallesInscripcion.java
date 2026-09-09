package org.cursillo.commons.entities.Inscripciones;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cursillo.commons.entities.base.BaseEntity;

@Entity
@Table(name = "detalles_inscripcion")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_inscripcion", discriminatorType = DiscriminatorType.STRING)
@Getter @Setter
public abstract class DetallesInscripcion extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_inscripcion", nullable = false)
    private Integer idDetalleInscripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_inscripcion", nullable = false)
    private Inscripcion inscripcion;

    @Column(name = "costo", nullable = false)
    private Integer costo;

    //metodo abstracto para aplicar polimorfismo
    public abstract String getConceptoDescripcion();
}
