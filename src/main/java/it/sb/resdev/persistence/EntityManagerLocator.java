package it.sb.resdev.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EntityManagerLocator {

	@Autowired
	@Qualifier("80")
	EntityManagerFactory em80;

	@Autowired
	@Qualifier("90")
	EntityManagerFactory em90;

	@Autowired
	@Qualifier("100")
	EntityManagerFactory em100;

	@Autowired
	@Qualifier("110")
	EntityManagerFactory em110;

	@Autowired
	@Qualifier("120")
	EntityManagerFactory em120;

	@Autowired
	@Qualifier("130")
	EntityManagerFactory em130;

	@Autowired
	@Qualifier("140")
	EntityManagerFactory em140;

	@Autowired
	@Qualifier("150")
	EntityManagerFactory em150;

	@Autowired
	@Qualifier("160")
	EntityManagerFactory em160;

	@Autowired
	@Qualifier("170")
	EntityManagerFactory em170;

	@Autowired
	@Qualifier("180")
	EntityManagerFactory em180;

	@Autowired
	@Qualifier("190")
	EntityManagerFactory em190;

	@Autowired
	@Qualifier("200")
	EntityManagerFactory em200;

	@Autowired
	@Qualifier("full")
	EntityManagerFactory emFull;

	public EntityManager getEntityManager(String enviroment) {

		EntityManagerFactory entityManagerFactory = null;
		if (enviroment.equals("80")) {
			entityManagerFactory = em80;
		} else if (enviroment.equals("90")) {
			entityManagerFactory = em90;
		} else if (enviroment.equals("100")) {
			entityManagerFactory = em100;
		} else if (enviroment.equals("110")) {
			entityManagerFactory = em110;
		} else if (enviroment.equals("120")) {
			entityManagerFactory = em120;
		} else if (enviroment.equals("130")) {
			entityManagerFactory = em130;
		} else if (enviroment.equals("140")) {
			entityManagerFactory = em140;
		} else if (enviroment.equals("150")) {
			entityManagerFactory = em150;
		} else if (enviroment.equals("160")) {
			entityManagerFactory = em160;
		} else if (enviroment.equals("170")) {
			entityManagerFactory = em170;
		} else if (enviroment.equals("180")) {
			entityManagerFactory = em180;
		} else if (enviroment.equals("190")) {
			entityManagerFactory = em190;
		} else if (enviroment.equals("200")) {
			entityManagerFactory = em200;
		} else if (enviroment.equals("full")) {
			entityManagerFactory = emFull;
		}
		if (entityManagerFactory != null) {
			return entityManagerFactory.createEntityManager();
		}
		return null;
	}
}
