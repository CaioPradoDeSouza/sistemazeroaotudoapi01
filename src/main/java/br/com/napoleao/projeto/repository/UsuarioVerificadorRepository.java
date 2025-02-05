package br.com.napoleao.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.napoleao.projeto.entity.UsuarioVerificadorEntity;

public interface UsuarioVerificadorRepository extends JpaRepository<UsuarioVerificadorEntity, Long> {

}
