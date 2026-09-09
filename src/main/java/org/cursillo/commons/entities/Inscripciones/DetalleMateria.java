package org.cursillo.commons.entities.Inscripciones;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cursillo.commons.entities.Materias.Materia;

@Entity
@DiscriminatorValue("MATERIA")
@Getter @Setter
public class DetalleMateria extends DetallesInscripcion {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_materia", nullable = false)
    private Materia materia;

    @Override
    public String getConceptoDescripcion() {
        return "Materia: " + (materia != null ? materia.getNombreMateria() : null);
    }
}
