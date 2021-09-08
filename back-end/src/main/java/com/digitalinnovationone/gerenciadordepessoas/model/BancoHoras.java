package com.digitalinnovationone.gerenciadordepessoas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class BancoHoras {


//  @EqualsAndHashCode
  @Embeddable
  @AllArgsConstructor
  @NoArgsConstructor
  public class BancoHorasId implements Serializable {
    private Long idBancoHoras;
    private Long idMovimento;
    private Long idUsuario;
  }
  @EmbeddedId
  private BancoHorasId id;
  private LocalDateTime dataTrabalhada;
  private BigDecimal quantidadeHorasTrabalhadas;
  private BigDecimal saldoHorasTrabalhadas;
  }
