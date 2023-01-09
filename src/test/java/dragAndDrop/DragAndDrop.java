package dragAndDrop;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    void dragAndDropTest() {
        // Открыть страницу Drag and Drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // Найти элемент с текстом "A" и перетащить его на место элемента с текстом "B" (первый способ)
        $(byText("A")).dragAndDropTo($(byText("B")));
        // Найти элемент с текстом "A" и перетащить его на место элемента с текстом "B" (второй способ)
//        Selenide.actions().dragAndDrop($(byText("A")), $(byText("B"))).perform();
        // Проверить, что элемент в первой колонке имеет текст "B"
        $(byId("column-a")).shouldHave(text("B"));
    }
}
