package br.com.napoleao.projeto.dto;

import org.springframework.beans.BeanUtils;

import br.com.napoleao.projeto.entity.PerfilEntity;

public class PerfilDTO {
	
	private long id;
	
	private String descricao;
	
	public PerfilDTO() {
		
	}
	
	public PerfilDTO(PerfilEntity perfil) {
		BeanUtils.copyProperties(perfil, this);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
