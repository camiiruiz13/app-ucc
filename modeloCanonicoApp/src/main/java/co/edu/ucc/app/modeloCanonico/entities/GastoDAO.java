package co.edu.ucc.app.modeloCanonico.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "gasto")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class GastoDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idgasto", nullable = false)
    private BigDecimal id;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idegreso", nullable = false)
    private EgresoDAO idEgreso;

    @Size(max = 40)
    @NotNull
    @Column(name = "detalleagastar", nullable = false, length = 40)
    private String detalleAgastar;

    @NotNull
    @Column(name = "fechagasto", nullable = false)
    private LocalDate fechaGasto;

    @NotNull
    @Column(name = "idcuenta", nullable = false)
    private BigDecimal idCuenta;




}