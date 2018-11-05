package br.com.cortes.authteste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cortes.authteste.entity.CountryCode;

@Repository
public interface CountryCodeRepository extends JpaRepository<CountryCode, Integer> {

}
