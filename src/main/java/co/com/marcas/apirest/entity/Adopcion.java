package co.com.marcas.apirest.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Adopcion {

    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private Long mascota;
    private Long idUsuario;
    private Date fechaAdopcion;

}
