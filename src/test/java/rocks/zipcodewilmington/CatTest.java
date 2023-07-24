package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Mittens";

            // When (a dog's name is set to the given name)
        cat.setName(givenName);

            // Then (we expect to get the given name from the dog)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
        }


    @Test
    public void speakTest() {
        String expected = "meow!";
        Cat c = new Cat("Mittens", null, 5678);
        String actual = c.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDate() {
        Cat c = new Cat("Fido", new Date(07 - 23 - 2023), 5678);
        Date expected = null;
        c.setBirthDate(expected);
        Date actual = c.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eat() {
        Cat c = new Cat("Mittens", new Date(07-23-2023), 5678);
        Food food = new Food();
        c.eat(food);
        int expected = 1;
        int actual = c.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getId(){
        Cat c = new Cat("Mittens", new Date(07-23-2023), 5678);
        Integer id = 5678;
        c.getId();
        Integer expected =5678;
        Integer actual = c.getId();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void AnimalInheritanceTest(){
        Cat cat = new Cat("Mittens", new Date(07-23-2023), 5678);
        Assert.assertTrue(cat instanceof Animal);
    }
    @Test
    public void MammalInheritanceTest(){
        Cat cat = new Cat("Mittens", new Date(07-23-2023), 567);
        Assert.assertTrue(cat instanceof Mammal);
    }
}


