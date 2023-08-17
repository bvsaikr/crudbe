package net.javaguides.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AddServiceTest {
	@Test
	public void test() {
	    int a = 4;
	    int b = 5;
	    int actualSum = AddService.add(a, b);

	    assertEquals(9, actualSum);
	}
}
