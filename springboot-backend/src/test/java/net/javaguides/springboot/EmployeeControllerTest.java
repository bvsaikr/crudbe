package net.javaguides.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.javaguides.springboot.controller.EmployeeController;
import net.javaguides.springboot.model.Employee;

@WebMvcTest(value = EmployeeController.class)
private class EmployeeControllerTest {
	
	private static final Object SUCCESS = " ";

	@MockBean
	EmployeeController controller;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	private void createEmployeeTest() throws Exception {
     
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("sai");
		employee.setLastName("bandi");
		employee.setEmailId("sai@gmail.com");
		when(controller.createEmployee(employee)).thenReturn(employee);

		ObjectMapper mapper = new ObjectMapper();
		String userJson = mapper.writeValueAsString(employee);

		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/employees")
							.contentType("application/json")
							.content(userJson);

		MvcResult result = mockMvc.perform(request).andReturn();
		String resBody = result.getResponse().getContentAsString();
		assertNotEquals(SUCCESS, resBody);
	
}
}
