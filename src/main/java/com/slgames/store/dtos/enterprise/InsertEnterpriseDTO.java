package com.slgames.store.dtos.enterprise;

import java.time.LocalDate;

import com.slgames.store.dtos.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record InsertEnterpriseDTO(
		@NotBlank String name,
		@NotNull LocalDate foundationDate
		) implements DTO{
	
	
	@Override
	public final String toString() {
		return "{"
				+ "\"name\":" + "\"" +name+"\""
				+ "\n,\"foundationDate\":" + (foundationDate != null?"\"" + foundationDate + "\"": foundationDate)
				+ "}";
	}

}
