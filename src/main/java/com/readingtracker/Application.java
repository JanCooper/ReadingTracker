package com.readingtracker;

import com.ulisesbocchio.jasyptspringboot.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
@EnableEncryptableProperties
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
