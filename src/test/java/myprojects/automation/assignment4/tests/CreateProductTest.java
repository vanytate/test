package myprojects.automation.assignment4.tests;

import myprojects.automation.assignment4.BaseTest;
import myprojects.automation.assignment4.GeneralActions;
import org.testng.annotations.Test;



public class CreateProductTest extends BaseTest {

   @Test

    // TODO implement test for product creation
    @Test  (dependsOnMethods ="generalActions.login(login, password)");

    public void createNewProduct(String login, String password) { // it was by default



        // actions.login(login, password); // it was by default
        // ...

    }

    // TODO implement logic to check product visibility on website
    @Test

}

// тут я пробувала спочатку generalActions.login, заплуталась остаточно, у всіх прикладах такі тести у відео були із асертами

//Рекомендації із завдання
1. Логику сценария можно разбить на пару методов @Test
и настроить цепочку выполнения используя атрибут dependsOnMethods для данной аннотации.
        2. Тестовый скрипт должен содержать проверки (assertions) и дополнительный лог действий,
        который можно увидеть в отчете о прогоне тестов. Для удобства логирование некоторых действий можно вынести в свою реализацию
        слушателя WebDriverEventListener, речь о котором шла на прошлой лекции.
        3. @DataProvider предназначен для передачи тестовых данных в скрипты.
        Используйте данную аннотацию для передачи логина и пароля в процессе авторизации.
        4. @Parameters позволяет передавать параметры из testng.xml.
        Используйте данную аннотацию для определения того, какой тип драйвера необходимо поднять для теста
        (Chrome, Firefox или же Internet Explorer.)