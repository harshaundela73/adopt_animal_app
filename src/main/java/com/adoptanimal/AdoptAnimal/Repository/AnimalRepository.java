package com.adoptanimal.AdoptAnimal.Repository;

import com.adoptanimal.AdoptAnimal.Model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
