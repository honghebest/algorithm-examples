package com.hongghe.algorithmexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * The start up class.
 *
 * @author hongghe 2018/08/20
 */
@EnableAsync
@EnableScheduling
@SpringBootApplication
public class AlgorithmExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmExamplesApplication.class, args);
	}
}
