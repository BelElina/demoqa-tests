package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TestBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Elksy");
        $("#userEmail").setValue("Elksy@maik.ru");
        $("#currentAddress").setValue("Seoul, South Korea");
        $("#permanentAddress").setValue("Seoul, South Korea");
        $("#submit").click();

        //$("#output").$("name").shouldHave(); -более длинная форма записи V
        $("#output #email").shouldHave();
        //$("#currentAddress",1); - возми вторую по счету айдишку currentAddress V
        $("#output #currentAddress").shouldHave();
        $("#output #permanentAddress").shouldHave();

    }
}
