package com.trus.trace;

import com.trus.trace.entity.Product;
import com.trus.trace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableCaching
public class TrusTraceApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(TrusTraceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
	@GetMapping("/v1")
	public String welcome(){
		return "welcome";
	}
}
