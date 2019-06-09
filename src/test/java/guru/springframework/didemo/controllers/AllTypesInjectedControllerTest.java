package guru.springframework.didemo.controllers;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {
        ConstructorInjectedControllerTest.class,
        PropertyInjectedControllerTest.class,
        SetterInjectedControllerTest.class})
public class AllTypesInjectedControllerTest {
}
