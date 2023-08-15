package com.adoptanimal.AdoptAnimal.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "animaldb")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Animal {


    @Id
    private Long animalid;
    private String name;
    private String type;

    private String bread;
    private Integer age;

    private String colour;
    private String dateofbirth;


}
