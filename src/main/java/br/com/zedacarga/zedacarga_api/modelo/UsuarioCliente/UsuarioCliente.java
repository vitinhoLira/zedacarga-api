package br.com.zedacarga.zedacarga_api.modelo.cliente;

import br.com.zedacarga.zedacarga_api.util.entity.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "UsuarioCliente")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioCliente extends EntidadeAuditavel {

    @Column
    private String login;

    @Column
    private String senha;

}