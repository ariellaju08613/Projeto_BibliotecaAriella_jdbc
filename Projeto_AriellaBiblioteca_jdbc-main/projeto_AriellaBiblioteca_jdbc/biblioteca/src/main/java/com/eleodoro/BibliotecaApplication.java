package com.eleodoro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eleodoro.conexao.Conexao;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);

		Conexao conexao  = new Conexao();
		conexao.getConexao();


	}

}
