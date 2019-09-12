package searchTutorial.pageObject;

import net.thucydides.core.pages.PageObject;

import java.util.List;
import java.util.stream.Collectors;

public class GoogleResultPage extends PageObject {
    public static final String RESULT_TITLE = ".ellip";

    public List<String> getDsplayedResults() {
        return findAll(RESULT_TITLE).stream().map(element -> element.getAttribute("textContent"))
                .collect(Collectors.toList());
    }

//    public String getSnippedResultFromKeyword(String keyword) { //дописати сюди для сныпет та інших
//        return findBy("//dic[]CAIQAA");
//    }
}
