package com.example.CustomGenerator.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class CustomGenerator {
	@Id
	@GenericGenerator(name = "order_id_gen", strategy = "com.example.CustomGenerator.generator.OrderIdGenerator")
	@GeneratedValue(generator = "order_id_gen")
	private String EmpId;
	private String EmpName;
	@Temporal(TemporalType.DATE)
	private Date JoiningDate;

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public Date getJoiningDate() {
		return JoiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		JoiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "CustomGenerator [EmpId=" + EmpId + ", EmpName=" + EmpName + ", JoiningDate=" + JoiningDate + "]";
	}

}
