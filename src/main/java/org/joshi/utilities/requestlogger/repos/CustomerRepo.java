package org.joshi.utilities.requestlogger.repos;

import java.util.List;

import org.joshi.utilities.requestlogger.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
	
	List<Customer> findByCity(String city);

}
