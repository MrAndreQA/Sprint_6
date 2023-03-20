package ru.yandex.practikum.tests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.practikum.model.Feline;

@RunWith(Parameterized.class)
public class InvalidAnimalTest {
    private final String animalKind;

    public InvalidAnimalTest(String animalKind) {
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Object[] invalidFelineAnimalKind() {
        return new Object[]{
                null,
                "Predator",
                "Всеядное",
                "Undefined"
        };
    }

    @Test(expected = Exception.class)
    public void getInvalidAnimalFoodTest() {
        Feline feline = new Feline();
        feline.getFood(animalKind);
    }
}