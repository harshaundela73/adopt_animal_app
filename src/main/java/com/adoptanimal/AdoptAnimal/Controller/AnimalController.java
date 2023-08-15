package com.adoptanimal.AdoptAnimal.Controller;

import com.adoptanimal.AdoptAnimal.Model.Animal;
import com.adoptanimal.AdoptAnimal.Service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;


@Slf4j
@RestController
@RequestMapping("adoptanimal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;


    @PostMapping("/save")
    public ResponseEntity<Animal> saveAnimalDetails(@RequestBody Animal animal){
        animalService.save(animal);
        log.info("AnimalController: saveAnimalDetails, New Animal Details are saved with ID : " + animal.getAnimalid());
        return new ResponseEntity<>(animal, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Animal> getAnimalDetailsById(@PathVariable(value = "id") Long id){
        System.out.println("Recevied Call ");
        Animal animalobj =  animalService.getById(id);
        log.info("AnimalController: getAnimalDetailsById, Getting the Animal Details for ID : " + id);
         if(animalobj==null){
             return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
         }
         else {
             return ResponseEntity.of(Optional.of(animalobj));
         }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Animal> updateAnimalDetails(@PathVariable(value = "id") Long id, @RequestBody Animal animalobj){
        Animal animalObjReturn = animalService.updateById(animalobj);
        log.info("AnimalController: updateAnimalDetails, Updating Animal Details for ID " + id);
        if(animalobj==null){
            return new ResponseEntity<>(animalobj, HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(animalObjReturn, HttpStatus.OK);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAnimalDetails(@PathVariable(value = "id") Long id){
        animalService.delete(id);
        log.info("AnimalController: deleteAnimalDetails, Deleted Animal Details for ID " + id);
        return new ResponseEntity<>("Animal Details Successfully Deleted", HttpStatus.OK);
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Animal>> getAllAnimalDetails(){
        List<Animal> animalList = animalService.getAllAnimalDetails();
        log.info("AnimalController: getAllAnimalDetails, Getting all the  Animal Details present in the Database ");
        return new ResponseEntity<>(animalList, HttpStatus.OK);
    }
}
