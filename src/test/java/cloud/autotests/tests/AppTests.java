package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static cloud.autotests.helpers.DriverHelper.getConsoleLogs;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("c05-kateAlmazova-lesson12")
    void generatedTest() {
        step("Open 'https://translate.yandex.ru/'", () -> {
            // todo
        });

        step("Select translation 'Russian -> English'", () -> {
            // todo
        });

        step("Type 'Привет, Мир!' in the left input field", () -> {
            // todo
        });

        step("Verify that the translation 'Hello, World!' is displayed in the right field", () -> {
            // todo
        });
    }

    @Test
    @Description("Autogenerated, because test steps contain text 'http...' and the page has 'title' tag")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://translate.yandex.ru/'", () ->
            open("https://translate.yandex.ru/"));

        step("Page title should have text 'Яндекс.Переводчик – словарь и онлайн перевод на английский, русский, немецкий, французский, украинский и другие языки.'", () -> {
            String expectedTitle = "Яндекс.Переводчик – словарь и онлайн перевод на английский, русский, немецкий, французский, украинский и другие языки.";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated, because test steps contain text 'http...'")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://translate.yandex.ru/'", () ->
            open("https://translate.yandex.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}