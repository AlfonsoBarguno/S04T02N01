package cat.itacademy.barcelonactiva.bargunyo.alfonso.s04.t02.n01.model.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cat.itacademy.barcelonactiva.bargunyo.alfonso.s04.t02.n01.model.domain.Fruita;



public interface FruitaServiceInterface {
	
public Iterable<Fruita> findAll();
	
	public Page<Fruita> findAll(Pageable pageable);
	
	public Optional<Fruita> findById (int id);
	
	public Fruita save(Fruita fruita);
	
	public void deleteById (int id);

}
