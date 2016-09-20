package com.tomhazell.roompicker;

import com.tomhazell.roompicker.controller.RoomController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = RoomController.class)
public class RoomPickerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomPickerApplication.class, args);
	}
}
