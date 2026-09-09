package org.cursillo.commons.entities.Factura;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cursillo.commons.entities.Conceptos.Concepto;
import org.cursillo.commons.entities.base.BaseEntity;

@Entity
@Table(name = "detalles_facturas")
@Getter @Setter
public class DetallesFactura extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_factura", nullable = false)
    private Integer idDetalleFactura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_factura", nullable = false)
    private Factura factura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_concepto", nullable = false)
    private Concepto concepto;

    @Column(name = "subtotal", nullable = false)
    private Integer subtotal;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

}
