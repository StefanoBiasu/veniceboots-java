package it.sb.resdev.persistence;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@PropertySource("classpath:application.properties")
public class EntityManagersConfiguration {

	@Bean
	@Qualifier("80")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory80() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource80());
		em.setPackagesToScan(new String[] { "it.sb.resdev.rest.repository" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		em.afterPropertiesSet();
		return em;
	}

	@Bean
	public DataSource dataSource80() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite::resource:80.db");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	@Qualifier("90")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory90() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource90());
		em.setPackagesToScan(new String[] { "it.sb.resdev.rest.repository" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		em.afterPropertiesSet();
		return em;
	}

	@Bean
	public DataSource dataSource90() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite::resource:90.db");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	@Qualifier("100")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory100() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource100());
		em.setPackagesToScan(new String[] { "it.sb.resdev.rest.repository" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		em.afterPropertiesSet();
		return em;
	}

	@Bean
	public DataSource dataSource100() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite::resource:100.db");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	@Qualifier("110")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory110() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource110());
		em.setPackagesToScan(new String[] { "it.sb.resdev.rest.repository" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		em.afterPropertiesSet();
		return em;
	}

	@Bean
	public DataSource dataSource110() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite::resource:110.db");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	@Qualifier("120")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory120() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource120());
		em.setPackagesToScan(new String[] { "it.sb.resdev.rest.repository" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		em.afterPropertiesSet();
		return em;
	}

	@Bean
	public DataSource dataSource120() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite::resource:120.db");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	@Qualifier("130")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory130() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource130());
		em.setPackagesToScan(new String[] { "it.sb.resdev.rest.repository" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		em.afterPropertiesSet();
		return em;
	}

	@Bean
	public DataSource dataSource130() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite::resource:130.db");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	@Qualifier("140")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory140() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource140());
		em.setPackagesToScan(new String[] { "it.sb.resdev.rest.repository" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		em.afterPropertiesSet();
		return em;
	}

	@Bean
	public DataSource dataSource140() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite::resource:140.db");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	@Qualifier("150")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory150() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource150());
		em.setPackagesToScan(new String[] { "it.sb.resdev.rest.repository" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		em.afterPropertiesSet();
		return em;
	}

	@Bean
	public DataSource dataSource150() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite::resource:150.db");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	@Qualifier("160")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory160() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource160());
		em.setPackagesToScan(new String[] { "it.sb.resdev.rest.repository" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		em.afterPropertiesSet();
		return em;
	}

	@Bean
	public DataSource dataSource160() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite::resource:160.db");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	@Qualifier("170")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory170() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource170());
		em.setPackagesToScan(new String[] { "it.sb.resdev.rest.repository" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		em.afterPropertiesSet();
		return em;
	}

	@Bean
	public DataSource dataSource170() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite::resource:170.db");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	@Qualifier("180")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory180() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource180());
		em.setPackagesToScan(new String[] { "it.sb.resdev.rest.repository" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		em.afterPropertiesSet();
		return em;
	}

	@Bean
	public DataSource dataSource180() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite::resource:180.db");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	@Qualifier("190")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory190() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource190());
		em.setPackagesToScan(new String[] { "it.sb.resdev.rest.repository" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		em.afterPropertiesSet();
		return em;
	}

	@Bean
	public DataSource dataSource190() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite::resource:190.db");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	@Qualifier("200")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory200() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource200());
		em.setPackagesToScan(new String[] { "it.sb.resdev.rest.repository" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		em.afterPropertiesSet();
		return em;
	}

	@Bean
	public DataSource dataSource200() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite::resource:200.db");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	@Qualifier("full")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryfull() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSourceFull());
		em.setPackagesToScan(new String[] { "it.sb.resdev.rest.repository" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		em.afterPropertiesSet();
		return em;
	}

	@Bean
	public DataSource dataSourceFull() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite::resource:full.db");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.hbm2ddl.auto", "none");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "it.sb.resdev.persistence.SQLiteDialect");
		properties.put("spring.jpa.properties.hibernate.show_sql", "false");
		properties.put("spring.jpa.properties.hibernate.use_sql_comments", "true");
		properties.put("spring.jpa.properties.hibernate.format_sql", "true");
		return properties;
	}
}