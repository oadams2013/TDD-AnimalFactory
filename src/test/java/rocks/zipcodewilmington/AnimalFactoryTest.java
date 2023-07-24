package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDog(){
        Dog dog = new Dog("Fido", new Date(07-16-2023), 1234);
        Date birthdate = new Date (7-16-2023);
        String name = "Apollo";

        Dog animal = AnimalFactory.createDog(name, birthdate);
        Assert.assertTrue(animal instanceof Dog);
    }
    // this is testing to see if the animal created has a name and birthdate like the new dog object that was created.
    @Test
    public void createCat() {
        Cat cat = new Cat("Mittens", new Date(07 - 23 - 2023), 5678);
        Date birthdate = new Date(7 - 23 - 2023);
        String name = " Whiskers";

        Cat animal = AnimalFactory.createCat(name, birthdate);
        Assert.assertTrue(animal instanceof Cat);
    }
}
