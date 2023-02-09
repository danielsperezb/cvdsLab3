package edu.eci.cvds.tdd.registry;
import org.junit.Assert;
import org.junit.Test;
public class RegistryTest {
private Registry registry = new Registry();



@Test
public void validateRegistryResult() {
Person person = new Person("Daniel",1, 20, Gender.MALE, true);
RegisterResult result = registry.registerVoter(person);
Assert.assertEquals(RegisterResult.VALID, result);
}
// TODO Complete with more test cases


@Test
public void deadRegistryResult() {
Person person = new Person("Rosa",2, 20, Gender.FEMALE, false);
RegisterResult result = registry.registerVoter(person);
Assert.assertEquals(RegisterResult.DEAD, result);
}

@Test
public void underageRegistryResult() {
Person person = new Person("Teran",3, 17, Gender.MALE, true);
RegisterResult result = registry.registerVoter(person);
Assert.assertEquals(RegisterResult.UNDERAGE, result);
}

@Test
public void invalidAgeEqualsZeroRegistryResult() {
Person person = new Person("Esteban",4, 0, Gender.MALE, true);
RegisterResult result = registry.registerVoter(person);
Assert.assertEquals(RegisterResult.INVALID_AGE, result);
}

@Test
public void invalidAgeNegativeRegistryResult() {
Person person = new Person("Perez",5, -2, Gender.MALE, true);
RegisterResult result = registry.registerVoter(person);
Assert.assertEquals(RegisterResult.INVALID_AGE, result);
}

@Test
public void duplicateRegistryResult() {
Person person2 = new Person("Francisco",6, 20, Gender.MALE, true);
RegisterResult result = registry.registerVoter(person2);
Person person = new Person("Daniel",6, 20, Gender.MALE, true);
RegisterResult result2 = registry.registerVoter(person);
Assert.assertEquals(RegisterResult.DUPLICATED, result2);
}


}
