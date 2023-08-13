package hw;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests {

    @BeforeAll
    static void configProperty() {
        Configuration.browserSize = System.getProperty("browserSize", "1440x900");
        open("https://the-internet.herokuapp.com/drag_and_drop");
    }

    @Test
    void dragAndDropTest() {
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }

    @Test
    // FAILED
    public void dragAndDropActionsTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().moveToElement($("#column-a")).clickAndHold().moveToElement($("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
