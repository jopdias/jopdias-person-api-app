package com.digitalinnovationone.gerenciadordepessoas.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Getter//Utiliza o lombok para criar os getters
@Setter//Utiliza o lambok para criar os setters
@AllArgsConstructor//Utiliza o lambok para criar o construtor padrão
@NoArgsConstructor//Utilzia o lambok para criar o construtor vazio
@EqualsAndHashCode//Utiliza o lambok para criar o equals e o #code
@Builder
@Entity
@Audited
public class Usuario {
  @Id
  private Long id;
  @ManyToOne
  private CategoriaUsuario categoriaUsuario;
  private String name;
  @ManyToOne
  private Empresa empresa;
  @ManyToOne
  private NivelAcesso nivelAcesso;
  @ManyToOne
  private JornadaTrabalho jornadaTrabalho;
  private BigDecimal tolerancia;
  private LocalDateTime inicioJornada;
  private LocalDateTime finalJornada;
}
