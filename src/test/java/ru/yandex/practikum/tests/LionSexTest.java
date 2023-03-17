package ru.yandex.practikum.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.practikum.model.Feline;
import ru.yandex.practikum.model.Lion;

@RunWith(Parameterized.class)
public class LionSexTest {

    private final String SEX;
    Feline feline;

    public LionSexTest(String Sex) {
        this.SEX = Sex;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Object[] invalidLionSex() {
        return new Object[]{
                null,
                "Лев",
                "Львица",
                "Male",
                "Female",
                "Lion",
                "Undefined"
        };
    }

    @Test(expected = Exception.class)
    public void invalidLionSexTest() {
        new Lion(SEX, feline);
    }
}