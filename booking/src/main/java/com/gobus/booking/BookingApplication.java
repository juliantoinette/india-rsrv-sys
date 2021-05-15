package com.gobus.booking;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gobus.data.Bus;
import com.gobus.repository.BusRepository;

@SpringBootApplication
public class BookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
	}

	@Bean
	CommandLineRunner init(BusRepository busRepository) {

		return args -> {

			Bus obj = busRepository.findFirstByBusId("TEST");
			System.out.println(obj);

			Bus obj2 = busRepository.findByBusIdAndBusNumber("TEST", "PY01");
			System.out.println(obj2);

			//int n = busRepository.updateBus("TEST", "TN01");
			//System.out.println("Number of records updated : " + n);

		};

	}

}
