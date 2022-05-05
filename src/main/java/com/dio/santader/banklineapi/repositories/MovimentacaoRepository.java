package com.dio.santader.banklineapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santader.banklineapi.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{

}
