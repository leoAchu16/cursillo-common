package org.cursillo.commons.entities.Conceptos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cursillo.commons.entities.base.BaseEntity;

@Entity
@Table(name = "conceptos")
@Getter @Setter
public class Concepto extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_concepto", nullable = false)
    private Integer idConcepto;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "monto_base")
    private Integer montoBase;
}
