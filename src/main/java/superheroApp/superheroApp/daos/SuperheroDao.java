package superheroApp.superheroApp.daos;

import java.util.List;

import superheroApp.superheroApp.entities.Superhero;

public interface SuperheroDao {

	List<Superhero> getAllSuperheroes();

	void addNewSuperhero(Superhero superhero);

}


