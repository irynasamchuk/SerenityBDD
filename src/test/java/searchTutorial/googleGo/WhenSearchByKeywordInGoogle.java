package searchTutorial.googleGo;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import searchTutorial.steps.GoogleSearch;

@RunWith(SerenityRunner.class)
public class WhenSearchByKeywordInGoogle {
    @Steps
    GoogleSearch sam;

    @Managed
    WebDriver driver;

    @Test
    public void shouldSeeRelevantSearchResult(){
        sam.isOnTheGoogleHomePage();

        sam.searchesByKeywordsFor("Cucumber Recipes");

        sam.shouldSeeOnlyResultsContaining("Cucumber");
    }

//    @Test
//    public void cookingLightSouuldShowCorrectSnippet(){
//        sam.isOnTheGoogleHomePage();
//        sam.searchesByKeywordsFor("Cucamber");
//        sam.shouldSeeEntrySnippedWithContent("50+ Cucumber Recipes - Cooking Light", "Cucumbers are great in salads, but why stop there? These healthy ");
//    }
}
