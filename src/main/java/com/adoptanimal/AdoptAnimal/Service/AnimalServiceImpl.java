package com.adoptanimal.AdoptAnimal.Service;

import com.adoptanimal.AdoptAnimal.Model.Animal;
import com.adoptanimal.AdoptAnimal.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AnimalServiceImpl implements AnimalService{

    @Autowired
    private AnimalRepository animalRepository;


    @Override
    public void save(Animal animal) {
        animalRepository.save(animal);
    }


    @Override
    public Animal getById(Long id) {
        Animal animalObj = null;
        try {
            animalObj = animalRepository.getById(id);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return animalObj;
    }

    @Override
    public void delete(Long id) {
        animalRepository.deleteById(id);
    }

    @Override
    public Animal updateById(Animal animal) {
        Animal existingAnimalObj = animalRepository.getReferenceById(animal.getAnimalid());
        existingAnimalObj.setAge(animal.getAge());
        existingAnimalObj.setBread(animal.getBread());
        existingAnimalObj.setName(animal.getName());
        existingAnimalObj.setColour(animal.getColour());
        existingAnimalObj.setDateofbirth(animal.getDateofbirth());
        existingAnimalObj.setType(animal.getType());


        return  existingAnimalObj;
    }

    @Override
    public List<Animal> getAllAnimalDetails()
    {
        return animalRepository.findAll();
    }
}
