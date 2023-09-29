package smule.pages.feed;

import smule.actions.PageActions;

public class FeedPage {
    PageActions actions = new PageActions();
    public FeedPage exploreFeed(){
        actions.scrollScreeen(100,1500,100,0);
        return new FeedPage();
    }
    public void selectRandomFeed(){
        actions.tap(300,300);
    }
}
