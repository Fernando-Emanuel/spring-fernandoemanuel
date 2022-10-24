package fernandoemanuel.repositories;

import org.springframework.data.repository.CrudRepository;

import fernandoemanuel.models.Professor;

public interface ProfessoresRepository extends CrudRepository<Professor, Integer> {
    
}