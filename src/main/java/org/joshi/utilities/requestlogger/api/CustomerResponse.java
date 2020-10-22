package org.joshi.utilities.requestlogger.api;

import java.util.List;

import org.joshi.utilities.requestlogger.domain.Customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerResponse {

	private List<Customer> customerList;
	
}
