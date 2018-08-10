package com.wicked.bootjdbi.service;

import java.util.Optional;

import com.wicked.bootjdbi.data.Address;

public interface AddressService {
	Optional<Address> getAddress();
}
