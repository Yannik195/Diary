package de.yanniksimon.diary;

public class Entry  {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getProductivity() {
        return productivity;
    }

    public void setProductivity(int productivity) {
        this.productivity = productivity;
    }

    String title;
    String description;
    int overall;
    int mood;
    int productivity;

    public Entry(String title, String description, int overall, int mood, int productivity){
        this.title = title;
        this.description = description;
        this.overall = overall;
        this.mood = mood;
        this.productivity = productivity;
    }


}
