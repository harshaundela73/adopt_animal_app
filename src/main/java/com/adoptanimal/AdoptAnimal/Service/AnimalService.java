package com.adoptanimal.AdoptAnimal.Service;
import java.util.*;
import com.adoptanimal.AdoptAnimal.Model.Animal;
import org.springframework.stereotype.Service;

@Service
public interface AnimalService {

    public void save(Animal animal);

    public Animal getById(Long id);

    public void delete(Long id);

    public Animal updateById(Animal animal);

    List<Animal> getAllAnimalDetails();
}
