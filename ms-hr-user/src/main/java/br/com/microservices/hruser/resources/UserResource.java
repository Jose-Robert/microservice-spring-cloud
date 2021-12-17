package br.com.microservices.hruser.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservices.hruser.entities.User;
import br.com.microservices.hruser.repositories.UserRepository;

@RestController
@RequestMapping(path = "/users")
public class UserResource {
	
	@Autowired
	private UserRepository repository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = repository.findById(id).get();
        return ResponseEntity.ok().body(user);
    }
    
    @GetMapping(value = "/search")
    public ResponseEntity<User> findById(@RequestParam String email) {
        User user = repository.findByEmail(email);
        return ResponseEntity.ok().body(user);
    }
}
