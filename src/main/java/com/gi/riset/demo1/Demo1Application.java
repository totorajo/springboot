package com.gi.riset.demo1;

import com.gi.riset.demo1.domain.Car;
import com.gi.riset.demo1.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(CarRepository repository){
		return (args) -> {
			repository.save(new Car("Toyota","Kijang","Red","Diesel",2015));
			repository.save(new Car("Toyota","Kijang","Blue","Diesel",2016));
			repository.save(new Car("Toyota","Kijang","Green","Diesel",2017));
			repository.save(new Car("Toyota","Kijang","Yellow","Diesel",2018));
			repository.save(new Car("Ford","Modeo","Yellow","Diesel",2018));
			repository.save(new Car("Ford","Modeo","Blue","Diesel",2018));

		};
	}


}
