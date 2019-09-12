package searchTutorial.steps;

import net.thucydides.core.annotations.Step;
import searchTutorial.pageObject.GoogleResultPage;
import searchTutorial.pageObject.GoogleSearchPage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.everyItem;

public class GoogleSearch {
    private String actor;

    GoogleSearchPage searchPage;
    GoogleResultPage resultPage;

    @Step("#actor searches for things related to {0} ")
    public void searchesByKeywordsFor(String keywords) {
        searchPage.EnterSearchTerms(keywords);
        searchPage.submitSearch();
    }

    @Step("#actor should see only result containing the word {0}")
    public void shouldSeeOnlyResultsContaining(String expectedTerms) {
        List<String> results = resultPage.getDsplayedResults();

        assertThat(results, everyItem(containsString(expectedTerms)));
    }

    @Step("#actor The user starts on the GoogleSearch home page")
    public void isOnTheGoogleHomePage() {
        searchPage.open();
    }

//    @Step("#actor should see the snippet {1} in the seach result entry from {0}")
//    public void shouldSeeEntrySnippedWithContent(String keyword, String expectedSnipped) {
//        String snipped = resultPage.getSnippedResultFromKeyword(keyword);
//        assertThat(snipped, containsString(expectedSnipped));
//    }
}
