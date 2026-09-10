package org.cursillo.commons.entities.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
/**
 * Clase base para las entidades.
 * Solo proporciona los atributos como creacion, actualizacion y activo
 * */
public abstract class BaseEntity {

    @Column(name = "creacion", nullable = false, updatable = false)
    private LocalDateTime creacion;

    @Column(name= "actualizacion", nullable = false)
    private LocalDateTime actualizacion;

    @Column(name = "activo", nullable = false)
    private Boolean activo = Boolean.TRUE; //activo por defecto


    // Este metodo se ejecuta antes de que se cree la entidad
    @PrePersist
    protected void creacion() {
        this.creacion = LocalDateTime.now();
        this.actualizacion = LocalDateTime.now();
    }
    // Este metodo se ejecuta antes de que se actualice la entidad
    @PreUpdate
    protected void actualizacion() {
        this.actualizacion = LocalDateTime.now();
    }
}
