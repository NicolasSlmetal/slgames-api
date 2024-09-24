package com.slgames.store.dtos.users;

import com.slgames.store.dtos.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record InsertUserDTO
(String nickname,
		@NotBlank
		@Email
		String email, 
		@NotBlank
		String password,
		
		@NotBlank
		String role) implements DTO {

	
	@Override
	public String toString() {
		return "{"
				+ "\"nickname\":\"" + nickname 
				+ "\",\n\"email\":\"" + email
				+ "\",\n\"password\":\"" + password
				+ "\",\n\"role\":\"" + role
				+ "\"\n}";
	}
}
