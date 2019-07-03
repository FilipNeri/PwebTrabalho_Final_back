package br.unisul.pweb.quarta.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unisul.pweb.quarta.domain.Insumo;

@Repository
public interface InsumoRepository extends JpaRepository<Insumo, Integer>{
	

}

