package br.com.microservices.hroauth.entities;

import java.io.Serializable;

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
public class Role implements Serializable {
	private static final long serialVersionUID = 4650284438209179819L;
	
	private Long id;
	private String roleName;
}
