package com.wicked.bootjdbi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wicked.bootjdbi.data.Address;
import com.wicked.bootjdbi.exceptions.MissingDataException;
import com.wicked.bootjdbi.service.AddressService;

@RestController
@RequestMapping("/")
public class TestController {

	private AddressService addressService;

	@Autowired
	public TestController(AddressService addressService) {
		this.addressService = addressService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public Address getAddress() throws MissingDataException {
		Optional<Address> addressOptional = addressService.getAddress();
		if (!addressOptional.isPresent()) {
			throw new MissingDataException("address is not found", new NullPointerException());
		}
		return addressOptional.get();
	}
}
