package org.cursillo.commons.entities.Inscripciones;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cursillo.commons.entities.Examenes.Examen;

@Entity
@DiscriminatorValue("EXAMEN")
@Getter @Setter
public class DetalleExamen extends DetallesInscripcion {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_examen", nullable = false)
    private Examen examen;

    @Override
    public String getConceptoDescripcion() {
        return "Examen: " + (examen != null ? examen.getTitulo() : null);
    }

}
