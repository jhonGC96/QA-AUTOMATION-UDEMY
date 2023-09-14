package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

public class ListPage extends BasePage {
    private String searchField = "//body/div[1]/div[1]/div[1]/span[1]/input[2]";
    private String searchResult = "tt-suggestion";
    private String url = "https://twitter.github.io/typeahead.js/examples/";

    public ListPage() {
        super(driver);
    }

    public void navigateToListPage() {
        navigateTo(url);
    }

    public void enterSearchCriteria(String state) throws InterruptedException {
        try {
            Thread.sleep(600);
            write(searchField, state);
        } catch (NoSuchElementException e) {
            System.out.println("The webElement search field couln´t be found");
            e.printStackTrace();
        }

    }

    public List<String> getAllSearchResults() {
        List<WebElement> list = bringMeAllElements(searchResult);
        List<String> stringsFromList = new ArrayList<String>();
        
        for (WebElement e : list) {
            stringsFromList.add(e.getText());
        }

        return stringsFromList;
    }
}
