package com.github.SamuelSantolim.ms_pagamento.dto;

import com.github.SamuelSantolim.ms_pagamento.entity.Pagamento;
import com.github.SamuelSantolim.ms_pagamento.entity.Status;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Getter

public class PagamentoDTO {

    private long id;
    @NotNull(message = "Campo obrigatório")
    @Positive(message = "O valor do pagamento deve ser um número positivo")
    private BigDecimal valor;
    @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres")
    private String nome;
    @Size(max = 19, message = "Número do cartão deve ter no maximo 19 caracteres")
    private String numeroDoCartao;
    @Size(min = 5,max = 5,message = "Validade do cartão deve ter 5 caracteres")
    private String validade;
    @Size(min = 3,max = 3,message = "Código de segurança deve ter 3 caracteres")
    private String codigoDeSeguranca;

    @Enumerated(value = EnumType.STRING)
    private Status status;
    @NotNull(message = "Pedido id obrigatório")
    private Long pedidoId;
    @NotNull(message = "Forma de pagamento id é obrigatório")
    private Long formaDePagamentoId;

    public PagamentoDTO(Pagamento entity) {
    id = entity.getId();
    valor = entity.getValor();
    nome = entity.getNome();
    numeroDoCartao = entity.getNumeroDoCartao();
    validade = entity.getValidade();
    codigoDeSeguranca = entity.getCodigoDeSeguranca();
    status = entity.getStatus();
    pedidoId = entity.getPedidoId();
    formaDePagamentoId = entity.getFormaDePagamentoId();
    }
}
