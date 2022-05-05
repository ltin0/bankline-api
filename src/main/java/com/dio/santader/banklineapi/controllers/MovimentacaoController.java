package com.dio.santader.banklineapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santader.banklineapi.dto.NovaMovimentacao;
import com.dio.santader.banklineapi.dto.NovoCorrentista;
import com.dio.santader.banklineapi.model.Correntista;
import com.dio.santader.banklineapi.model.Movimentacao;
import com.dio.santader.banklineapi.repositories.CorrentistaRepository;
import com.dio.santader.banklineapi.repositories.MovimentacaoRepository;
import com.dio.santader.banklineapi.service.CorrentistaService;
import com.dio.santader.banklineapi.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")

public class MovimentacaoController {
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	@GetMapping
	public List<Movimentacao> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save (@RequestBody NovaMovimentacao movimentacao) {
			service.save(movimentacao);
	}
}
