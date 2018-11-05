package br.com.cortes.authteste.service;

import java.util.List;

import br.com.cortes.authteste.dto.CountryCodeDTO;

public interface CountryCodeService {
	
	List<CountryCodeDTO> getCountryCodes();
    String createCountryCode(CountryCodeDTO countryDTO);
    String deleteCountryCode(int id);

}
