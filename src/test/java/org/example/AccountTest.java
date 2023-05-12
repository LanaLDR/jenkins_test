package org.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String name;
    private final boolean result;
    private Account account;

    @Before
    public void setUp(){
        account = new Account(name);
    }

    public AccountTest(String name, boolean result){
        this.name = name;
        this.result = result;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSumData() {
        return new Object[][] {
                {"Кек Кеков", true},
                {"к кн", true},
                {" Артамон артамонович", false},
                {"Кек кекович ", false},
                {"Kek kekovkekovkekovkekov", false}
        };
    }

    @org.junit.Test
    public void checkNameToEmbossParamTest() {
        assertEquals(account.checkNameToEmboss(), result);
    }
}