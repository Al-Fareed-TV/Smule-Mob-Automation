package smule.pages.feed;

import smule.actions.PageActions;

public class FeedPage {
    PageActions actions = new PageActions();
    public void exploreFeed(){
        actions.scrollScreen(100,1700,100,0);
        actions.tap(300,1650);
    }

}
