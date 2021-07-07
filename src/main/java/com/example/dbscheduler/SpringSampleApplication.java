package com.example.dbscheduler;

import com.github.kagkarlsson.scheduler.Scheduler;
import com.github.kagkarlsson.scheduler.task.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;

@SpringBootApplication
public class SpringSampleApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringSampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringSampleApplication.class, args);
	}


	/**
	 * Example hack: use a {@link CommandLineRunner} to trigger scheduling of a one-time task.
	 */
	/*@Bean
	CommandLineRunner executeOnStartup(Scheduler scheduler, Task<Void> sampleOneTimeTask) {
		log.info("Scheduling one time task to now!");

		return ignored -> scheduler.schedule(
				sampleOneTimeTask.instance("command-line-runner"),
				Instant.now()
		);
	}*/
}
