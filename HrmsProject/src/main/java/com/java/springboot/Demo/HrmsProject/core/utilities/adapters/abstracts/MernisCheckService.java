package com.java.springboot.Demo.HrmsProject.core.utilities.adapters.abstracts;

import com.java.springboot.Demo.HrmsProject.entities.concretes.Applicant;

public interface MernisCheckService {

	 public boolean checkIfRealPerson(Applicant applicant);
}
