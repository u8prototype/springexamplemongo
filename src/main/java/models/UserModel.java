package models;

import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document("UserModel")
public class UserModel {	
	
	@JsonProperty("authUserKey")
	private String authUserKey;
	
	@JsonProperty("email")
	private String email;		
	
}
