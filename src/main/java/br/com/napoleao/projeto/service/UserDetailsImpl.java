package br.com.napoleao.projeto.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.napoleao.projeto.entity.UsuarioEntity;

public class UserDetailsImpl implements UserDetails {
	
	private long id;
	
	private String name;
	
	private String username;
	
	private String email;
	
	private String password;
	
	
	
	
	public UserDetailsImpl(long id, String name, String username, String email,String password,
			Collection<? extends GrantedAuthority> authorities) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.authorities = authorities;
	}

	public static UserDetailsImpl build(UsuarioEntity usuario) {
		
		return new UserDetailsImpl(
				usuario.getId(),
				usuario.getNome(),
				usuario.getLogin(),
				usuario.getEmail(),
				usuario.getSenha(),
				new ArrayList<>());
	}
	
	private Collection<? extends GrantedAuthority> authorities;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return authorities;
	}

	@Override
	public String getPassword() {
		
		return password;
	}

	@Override
	public String getUsername() {
		
		return username;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}
	
	@Override
	public boolean isEnabled() {
		
		return true;
	}

}
