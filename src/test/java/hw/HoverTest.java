package hw;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HoverTest {

    @BeforeAll
    static void configProperty () {
        Configuration.browserSize = System.getProperty("browserSize","1440x900");
        open("https://github.com");
    }

    @Test
    void openEnterprisePageTest() {
        $("div.header-menu-wrapper").$(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("div.application-main").shouldHave(Condition.text("Build like the best"));
    }
}
