package pe.edu.upeu.milkminder.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table (name ="Control_Vaca")
public class Control {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "etapa_detalle", nullable = false)
    private String etapaDetalle;
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Basic(optional = false)
    @Column(name = "fecha_prog", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate fechaProg;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Basic(optional = false)
    @Column(name = "fecha_real", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate fechaReal;

    @Column(name = "peso_vivokg", columnDefinition = "FLOAT")
    private Float pesoVivoKg;

    private String preno;

    @Column(name = "condicion_corporal", nullable = false)
    private String condicionCorporal;

    @Column(name = "tiene_mastitis", nullable = false)
    private String tieneMastitis;
    
    private String tratamiento;
}