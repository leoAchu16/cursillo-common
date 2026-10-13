package org.cursillo.commons.entities.descuentos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cursillo.commons.entities.base.BaseEntity;

@Entity
@Table(name = "descuentos")
@Getter @Setter
public class Descuento extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_descuento", nullable = false)
    private Integer idDescuento;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "porcentaje", nullable = false)
    private Integer porcentaje;

    @Column(name = "descripcion")
    private String descripcion;
}
