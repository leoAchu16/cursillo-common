package org.cursillo.commons.entities.Usuarios;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.cursillo.commons.entities.Enums.Rol;

@Entity
@DiscriminatorValue("PROFESOR")
@Getter @Setter
public class Profesor extends Usuario {

    @Override
    public Rol getRol() {
        return Rol.PROFESOR;
    }
}
