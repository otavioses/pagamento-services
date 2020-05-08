package br.inatel.dm112.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import br.inatel.dm112.dao.EntregadorDAO;
import br.inatel.dm112.services.EntregadorService;

@Configuration
@EnableWebMvc
@ComponentScan("br.inatel.dm112")
public class LogisticaConfig {

	@Bean
	public EntregadorService entregadorService() {
		return new EntregadorService();
	}

	@Bean
	public EntregadorDAO entregadorDAO() {
		return new EntregadorDAO();
	}

	@Bean
	public EntityManager entityManager() {
		EntityManagerFactory emFactory = null;

		try {
			emFactory = Persistence.createEntityManagerFactory("logisticaPU");
		} catch (Throwable e) {
			throw new ExceptionInInitializerError(e);
		}

		return emFactory.createEntityManager();
	}
}
