package org.example;

public class MarkingService {
    private String words;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String sayHello(){
        return "hello , " + words;
    }
}
