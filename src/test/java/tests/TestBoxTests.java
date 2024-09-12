package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TestBoxTests {

    @Test
    void fillFormTest() {
        Configuration.pageLoadStrategy = "eager";
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Elksy");
        $("#userEmail").setValue("Elksy@maik.ru");
        $("#currentAddress").setValue("Seoul, South Korea");
        $("#permanentAddress").setValue("Seoul, South Korea");
        $("#submit").click();

        $("#submit").shouldHave();
    }
}
