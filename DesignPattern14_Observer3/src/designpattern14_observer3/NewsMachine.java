package designpattern14_observer3;

import java.util.ArrayList;

public class NewsMachine extends Observable{
    private String title;
    private String news;
    
    public String getTitle() {
        return title;
    }

    public String getNews() {
        return news;
    }
    
    public void setNewsInfo(String title, String news){
        this.title = title;
        this.news = news;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers)
            observer.update(title, news);
    }
    
}
