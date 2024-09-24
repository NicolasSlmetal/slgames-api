package com.slgames.store.dtos.game;

import java.time.LocalDate;

import com.slgames.store.dtos.DTO;

import jakarta.validation.constraints.NotNull;

public record UpdateGameDTO(
		@NotNull Long id,
		String title,
		LocalDate launchDate,
		Double price) implements DTO {

	
	@Override
	public final String toString() {
		return "{"
				+ "\"id\":" + id
				+ ",\n\"title\":" + "\"" +title + "\""
				+ ",\n\"launchDate\":" + (launchDate != null? "\"" + launchDate + "\"": launchDate) 
				+ ",\n\"price\":" + price
				+ "\n}";
	}
}
