package service;

import model.Dictionary;

import java.util.ArrayList;
import java.util.List;

public class DictionaryService implements Iservice{
    private static List<Dictionary> dictionaryList = new ArrayList<>();

    static {
        dictionaryList.add(new Dictionary("Xin chào", "Hello"));
        dictionaryList.add(new Dictionary("xe đạp", "bike"));
        dictionaryList.add(new Dictionary("yêu", "love"));
    }


    @Override
    public String check(String english) {
        for (Dictionary dictionary: dictionaryList){
            if (dictionary.getEnglish().equals(english))return dictionary.getVietnam();
        }
        return "Không tìm thấy";
    }
}
