package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	@RequestMapping("/api/echo")
	public static class RandomController {

		@GetMapping("/{echo}")
		public Echo getRandomOutput(@PathVariable("echo") String echo) {
			return new Echo(echo);
		}

	}

	public static class Echo {
		private String echo;

		public Echo() {}

		public Echo(String echo) {
			this.echo = echo;
		}

		public String getEcho() {
			return echo;
		}

		public void setEcho(String echo) {
			this.echo = echo;
		}
	}

}
