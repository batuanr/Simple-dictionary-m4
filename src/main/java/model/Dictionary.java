package model;

public class Dictionary {
    private String vietnam;
    private String english;

    public Dictionary(String vietnam, String english) {
        this.vietnam = vietnam;
        this.english = english;
    }

    public String getVietnam() {
        return vietnam;
    }

    public void setVietnam(String vietnam) {
        this.vietnam = vietnam;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }
}
