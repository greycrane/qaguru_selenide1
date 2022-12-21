package wiki;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class WikiTests {
    @Test
    void CheckJUnit5CodeSample() {
        // Открыть страницу selenide в GitHub
        open("https://github.com/selenide/selenide");
        // Перейти в раздел Wiki
        $("#wiki-tab").click();
        // Найти в фильтре страницу по тексту "Soft"
        $("#wiki-pages-filter").setValue("Soft");
        // Убедиться, что страница "SoftAssertions" присутствует в списке
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        // Перейти на страницу "SoftAssertions"
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        // Убедиться, что в статье есть пункт с кодом для JUnit5
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
