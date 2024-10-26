package co.com.marcas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Mascota {
    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String nombre;
    private String id_tipo_mascota;
    private Integer edad;
    private boolean disponible;
}
