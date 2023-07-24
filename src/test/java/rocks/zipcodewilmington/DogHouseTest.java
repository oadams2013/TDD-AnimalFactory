package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void addDogTest(){
        Dog dog = new Dog("Fido", new Date(07-16-2023), 1234);
        DogHouse.add(dog);
    }
    @Test
    public void removeDogTest(){
        Dog dog = new Dog("Fido", new Date(07-16-2023), 1234);
        DogHouse.remove(dog);
    }
    @Test
    public void remove(){
        Dog dog = new Dog("Fido", new Date(07-16-2023), 1234);
        Integer id = 5678;
        DogHouse.remove(id);
    }
    @Test
    public void getDogById(){
        Dog dog = new Dog("Fido", new Date(07-16-2023), 1234);
        Integer id = 5678;
        DogHouse.getDogById(id);
    }
}
