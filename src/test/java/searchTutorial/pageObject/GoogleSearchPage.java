package searchTutorial.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.google.com/")
public class GoogleSearchPage extends PageObject {

    @FindBy(name = "q")
    WebElementFacade searchField;

    @FindBy(name = "btnK")
    WebElementFacade searchButton;
    public void EnterSearchTerms(String keywords) {
        searchField.type(keywords);

    }

    public void submitSearch() {
        searchButton.click();
    }

}
