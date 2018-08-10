package com.wicked.bootjdbi.service.impl;

import java.util.Optional;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wicked.bootjdbi.data.Address;
import com.wicked.bootjdbi.service.AddressService;

@Service("addressService")
public class AddressServiceFacade implements AddressService {

	private Jdbi dbi;

	@Autowired
	public AddressServiceFacade(Jdbi dbi) {
		this.dbi = dbi;
	}

	@Override
	public Optional<Address> getAddress() {
		Handle h = dbi.open();
		Optional<Address> addressOption = h	.select("SELECT AddressLine1,City,PostalCode FROM Address")
											.mapTo(Address.class)
											.findFirst();
		h.close();
		return addressOption;
	}
}
