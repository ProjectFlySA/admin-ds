package com.projectfly.ds.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAdminServer
public class AdminDsApplication {

	private static final Logger LOG = LoggerFactory.getLogger(AdminDsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AdminDsApplication.class, args);
	}

	@Bean
	ApplicationListener<ApplicationReadyEvent> onApplicationReadyEventListener(ServerProperties serverProperties) {

		return (evt) -> {
			Integer port = 8080;

			LOG.info("Admin-DS started: http://localhost:{} to use admin-ds", port);
		};
	}
}
