package Step;

import Pages.SearchPage;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchStep extends ScenarioSteps {
    SearchPage searchPage;

    public void AlreadyOnSkillAcademyWebPage()throws InterruptedException{
        searchPage.open();
        Thread.sleep(2000);
        searchPage.checkSearchBoxAlreadyDisplayed();
    }

    public void InputKeyword(String keyword){
        searchPage.inputKeyword(keyword);
    }

    public void ClickSearchButton(){
        searchPage.clickSearchButton();
    }

    public void GetsTheResultOfKeywordEntered(String keyword)throws InterruptedException{
        Thread.sleep(3000);
        searchPage.getsTheResultOfKeywordEntered(keyword);
    }

    public void GetsNoResultFoundPage()throws InterruptedException{
        Thread.sleep(3000);
        searchPage.getsNoResultFoundPage();
    }
}