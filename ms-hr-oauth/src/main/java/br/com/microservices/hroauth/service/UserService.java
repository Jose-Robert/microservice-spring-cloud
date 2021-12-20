package br.com.microservices.hroauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservices.hroauth.entities.User;
import br.com.microservices.hroauth.feignclients.UserFeignClient;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

	@Autowired
	private UserFeignClient userFeignClient;

	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		
		if (user == null) {
			log.info("Email not found: " + email);
			throw new IllegalArgumentException("Email not found");
		}
		
		log.info("Email found: " + email);
		return user;
	}
}
