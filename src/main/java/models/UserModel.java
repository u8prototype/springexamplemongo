package models;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document("UserModel")
public class UserModel {	
	
	@JsonProperty("authUserKey")
	private String authUserKey;
	
	@JsonProperty("email")
	private String email;	
		
	public UserModel(String email, String authUserKey) {
		super();		
		this.email = email;
		this.authUserKey = authUserKey;
	}		
	
	public String toString() {
		return "UserModel [email=" + email + ", authUserKey=" + authUserKey + "]";
	}	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAuthUserKey() {
		return authUserKey;
	}
	public void setAuthUserKey(String authUserKey) {
		this.authUserKey = authUserKey;
	}
	
}