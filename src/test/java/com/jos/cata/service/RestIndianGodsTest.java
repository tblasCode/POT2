package com.jos.cata.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class RestIndianGodsTest {
	
	
	private RestIndianGods restIndianGods;
	
	@BeforeEach
	public void setup () {
		restIndianGods = new RestIndianGods();
	}

	@AfterEach
	public void teardown () {
	}

	public void getGods() {
		List<String> indianGods = restIndianGods.get();
		
		assertThat(indianGods).isNotEmpty().hasSize(13)
        .containsAnyOf("Brahma")
        .containsAnyOf("Vishnu");
		
	}
}
