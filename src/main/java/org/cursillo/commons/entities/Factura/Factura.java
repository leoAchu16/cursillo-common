package org.cursillo.commons.entities.Factura;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cursillo.commons.entities.Enums.MetodoPago;
import org.cursillo.commons.entities.Inscripciones.Inscripcion;
import org.cursillo.commons.entities.Usuarios.Alumno;
import org.cursillo.commons.entities.Usuarios.Secretaria;
import org.cursillo.commons.entities.Usuarios.Usuario;
import org.cursillo.commons.entities.base.BaseEntity;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "facturas")
@Getter @Setter
public class Factura extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFactura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alumno", nullable = false)
    private Alumno alumno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_secretaria", nullable = false)
    private Secretaria secretaria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_inscripcion", nullable = false)
    private Inscripcion inscripcion;

    @Column(name = "ruc", nullable = false, length = 10)
    private String ruc;

    @Column(name = "total", nullable = false)
    private Integer total;

    @Enumerated(EnumType.STRING)
    @Column(name = "metodo_pago", nullable = false)
    private MetodoPago metodoPago;

    @Column(name = "fecha_emision", nullable = false)
    private LocalDate fechaEmision;

    @OneToMany(mappedBy = "factura")
    private List<DetallesFactura> detalles;
}
