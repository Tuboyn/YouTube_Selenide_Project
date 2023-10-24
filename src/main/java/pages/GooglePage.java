package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class GooglePage {

    private final SelenideElement searchField = $x("//textarea[@title='Поиск']");
    private final ElementsCollection searchResultElements = $$x("//span/a/h3");

    public GooglePage search(String request) {
        searchField.setValue(request).pressEnter();
        return this;
    }

    public void chooseResult(String searchItem) {
        searchResultElements.findBy(Condition.text(searchItem)).click();
    }
}