package com.Config;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@componentScan("com")
@EnableTransactionManagement
public class HibernateConfig
{
	@Autowired
	@Bean(name="datasource")
	public DataSource getH2Data()
	{
		System.out.println("Hibernate Bean initiated");
		DriverManagerDataSource dsource=new DriverManagerDataSource();
		dsource.setDriverClassName("org.h2.Driver");
		dsource.setUrl("jdbc:h2:tcp://localhost/~/ITtrainingHubDB");
		dsource.setUsername("sa");
		dsource.setPassword("");
		System.out.println("H2 Database connected");
		return dsource;
		
	}
	
	private Properties gethiberprop()
	{
		Properties pr =new Properties();
		pr.put("hibernate.dialert", "org.hibernate.dialert.HeDialert");
		//pr.put("hibernate., value)
		
		
		
	}
}
