package cat.itacademy.barcelonactiva.bargunyo.alfonso.s04.t02.n01.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import cat.itacademy.barcelonactiva.bargunyo.alfonso.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.bargunyo.alfonso.s04.t02.n01.model.repository.FruitaRepository;


public class FruitaServiceImplementacion implements FruitaServiceInterface {
	@Autowired
	private FruitaRepository fruitaRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Fruita> findAll() {
	
		
		return fruitaRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Fruita> findAll(Pageable pageable) {
		
		return fruitaRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Fruita> findById(int id) {
		
		return fruitaRepository.findById(id);
	}

	@Override
	@Transactional
	public Fruita save(Fruita fruita) {
		
		return fruitaRepository.save(fruita);
	}

	@Override
	@Transactional
	public void deleteById(int id) {

		fruitaRepository.deleteById(id);
	}

}
