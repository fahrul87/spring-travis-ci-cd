package com.fahrul.springtraviscicd;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(SpringTravisCiCdApplication.class)
@RunWith(SpringRunner.class)
public class SpringTravisCiCdApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testPing()throws Exception{
		mockMvc.perform(get("/ping")).andExpect(status().isOk());
	}

}
