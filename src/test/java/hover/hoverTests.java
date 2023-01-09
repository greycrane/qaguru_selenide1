package hover;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class hoverTests {
    @Test
    void hoverTest() {
        // Открыть страницу selenide в GitHub
        open("https://github.com");
        // Навести курсор на меню Solutions
        $(byText("Solutions")).hover();
        // Нажать на меню Enterprise
        $(byText("Enterprise")).click();
        $("h1").shouldHave(text("Build like the best"));
    }
}
