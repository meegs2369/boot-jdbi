package com.wicked.bootjdbi;

import javax.sql.DataSource;

import org.jdbi.v3.core.Jdbi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wicked.bootjdbi.data.Address;

@Configuration
public class DataConfig {

	private DataSource ds;

	public DataConfig(DataSource ds) {
		this.ds = ds;
	}

	@Bean
	public Jdbi dataBean() {
		Jdbi dbi = Jdbi.create(ds);
		dbi.registerRowMapper(Address.class, (rs, ctx) -> new Address(rs.getString("AddressLine1")));
		return dbi;
	}

}
