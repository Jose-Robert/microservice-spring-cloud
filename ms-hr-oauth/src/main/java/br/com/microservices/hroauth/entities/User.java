package br.com.microservices.hroauth.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable{


	private static final long serialVersionUID = 3137107234184486887L;
	private Long id;
	private String name;
	private String email;
	private String password;
	
	@Builder.Default
	private Set<Role> roles = new HashSet<>();
	
}
