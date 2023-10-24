package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class YouTubePlayerPage {
    private final ElementsCollection playButtonElements = $$x("//div[contains(@class, 'play-menu')]/ytd-button-renderer[contains(@class, 'play-button')]");
    private final SelenideElement playButtonElement = $x("//div[contains(@class,'ytp-left-controls')]/button");

    public YouTubePlayerPage playVideo() {
        playButtonElements.first().click();
        return this;
    }

    public void checkVideoPlayed() {
        playButtonElement.shouldHave(attribute("title", "Пауза (k)"));
    }
}