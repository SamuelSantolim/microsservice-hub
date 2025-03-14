package com.github.SamuelSantolim.ms_pagamento.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private BigDecimal valor;
    private String nome;
    private String numeroDoCartao;
    private String validade;
    private String codigoDeSeguranca;
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Status status;
    @Column(nullable = false)
    private Long pedidoId;
    @Column(nullable = false)
    private Long formaDePagamento;


}
