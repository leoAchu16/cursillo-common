package org.cursillo.commons.entities.Usuarios;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cursillo.commons.entities.Enums.Rol;
import org.cursillo.commons.entities.base.BaseEntity;

@Entity
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "rol", discriminatorType = DiscriminatorType.STRING)
@Getter @Setter
public abstract class Usuario extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "contrasenha", nullable = false)
    private String contrasenha;

    @Column(name = "telefono")
    private String telefono;

    // metodo abstracto que retorna el rol del usuario (se emplea para aplicar polimorfismo)
    public abstract Rol getRol();
}
