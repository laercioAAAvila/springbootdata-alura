package br.com.laercio.springbootalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.laercio.springbootalura.model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer> {
	
}
