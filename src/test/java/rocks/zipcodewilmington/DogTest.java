package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }


    @Test
    public void speakTest() {
        String expected = "bark!";
        Dog d = new Dog("Fido", null, 1234);
        String actual = d.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setBirthDate(){
        Dog d = new Dog("Fido", new Date(07-16-2023), 1234);
        Date expected = null;
        d.setBirthDate(expected);
        Date actual = d.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eat() {
     Dog d = new Dog("Fido", new Date(07-16-2023), 1234);
     Food food = new Food();
     d.eat(food);
     int expected = 1;
     int actual = d.getNumberOfMealsEaten();
     Assert.assertEquals(expected, actual);
    }
    @Test
    public void getId(){
        Dog d = new Dog("Fido", new Date(07-16-2023), 1234);
        Integer id = 1234;
        d.getId();
        Integer expected = 1234;
        Integer actual = d.getId();
        Assert.assertEquals(expected,actual);
    }

}
