package com.example.CustomGenerator.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		String prefix = "Kgisl";
		String suffix = "";
		try {
			Connection conn = session.connection();
			Statement stmt = conn.createStatement();
			String sql = "select count(emp_id) from custom_generator";
			// if you created sequence in oracle make it use this
			// string sql = "select sequencename.nextval from dual";

			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				int seqval = rs.getInt(1)+1;
				suffix = String.valueOf(seqval);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prefix + suffix;
	}

}
