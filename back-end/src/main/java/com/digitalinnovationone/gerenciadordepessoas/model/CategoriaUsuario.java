package com.digitalinnovationone.gerenciadordepessoas.model;


import javax.persistence.Column;
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
public class CategoriaUsuario {
  @Id
  private long id;
  private String descricao;
}
