

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import models.UserModel;
import repository.UserRepository;


@RestController
@EnableMongoRepositories
@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })
public class Main {
	
	@Autowired
	UserRepository userRepository;	
			
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
	@PostMapping(path = "/create/user", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createTestData(@RequestBody UserModel usermodel) {		
		userRepository.save(usermodel);		
		return "{'message':'create-ok}";
	}	
	
}
