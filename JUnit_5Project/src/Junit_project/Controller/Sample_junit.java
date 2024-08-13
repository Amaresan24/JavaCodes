package Junit_project.Controller;


import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


public class Sample_junit {

	Car car = new Car();

	@Test
	public void get() {
		System.out.println("Assert are  Equal");
		assertEquals(car.getCar(), 469);
	}

}
  