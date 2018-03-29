package sda.projekt.calezajecia;

import java.util.HashMap;
import java.util.Map;

public class DictonaryData {

    private Map<String, String> mapOfWords = new HashMap<>();


    public Map<String,String> getMapOfWords() {
        return mapOfWords;
    }

    public DictonaryData() {
        mapOfWords.put("Cześć", "Hello");
        mapOfWords.put("Narazie", "Bye");
        mapOfWords.put("Budowla", "Building");
        mapOfWords.put("Człowiek", "Human");
        mapOfWords.put("Komputer", "Computer");
        mapOfWords.put("Kawa", "Coffy");
        mapOfWords.put("Cistko", "Cake");
        mapOfWords.put("Zebra", "Zibra");
        mapOfWords.put("Okno", "Window");
        mapOfWords.put("Drzwi", "Door");
        this.mapOfWords = mapOfWords;
    }

public String ResultDictonary(String wordToTranslate){
        return mapOfWords.get(wordToTranslate);
}



}
