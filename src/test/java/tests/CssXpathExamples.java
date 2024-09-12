package tests;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {

    void cssXpath() {
        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]").setValue("elkdy@maik.ru");
        $(by("data-testid","email")).setValue("elkdy@maik.ru");
        $x("//*[@data-testid='email']").setValue("elkdy@maik.ru");

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email"
        $("[id=email]").setValue("elkdy@maik.ru");
        $(by("id","email")).setValue("elkdy@maik.ru");
        $(byId("email")).setValue("elkdy@maik.ru");
        $("#email").setValue("elkdy@maik.ru"); //TOP!!
        $x("//*[@id='email']").setValue("elkdy@maik.ru");

        // <input type="email" class="inputtext login_form_input_box" name="email"
        $("[name=email]").setValue("elkdy@maik.ru");
        $(by("name","email")).setValue("elkdy@maik.ru");
        $(byName("email")).setValue("elkdy@maik.ru");
        $x("//*[@name='email']").setValue("elkdy@maik.ru");

        // <input type="email" class="inputtext login_form_input_box"
        $("[class=inputtext][class=login_form_input_box]").setValue("elkdy@maik.ru");
        $(".login_form_input_box").setValue("elkdy@maik.ru"); //TOP
        $(".inputtext.login_form_input_box").setValue("elkdy@maik.ru");
        $("input.inputtext.login_form_input_box").setValue("elkdy@maik.ru");
        $x("//input[@class='inputtext'][@class='login_form_input_box']").setValue("elkdy@maik.ru");

        // <div class="inputtext">
        //     <input type="email" class=login_form_input_box">
        // </div
        $(".inputtext .login_form_input_box").setValue("elkdy@maik.ru"); //добавляе пробел, т.к. 2 разных эл-та
        $(".inputtext").$(".login_form_input_box").setValue("elkdy@maik.ru");
        $("div.inputtext").$("input.login_form_input_box").setValue("elkdy@maik.ru");
        $("div.inputtext input.login_form_input_box").setValue("elkdy@maik.ru");

        // <div>Hello, qa_guru!</
        $(byText("Hello, qa_guru!")); //по всему тексту
        $(withText("lo, qa_guru!")); //по части текста
        $x("//*[text()='Hello, qa_guru!']"); //wrong
        $x("//*[contains(text(),'Hello, qa_guru!')]");

    }
}