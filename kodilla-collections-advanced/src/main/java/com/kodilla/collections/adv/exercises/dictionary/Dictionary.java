package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
    public int size(){
        return dictionary.size();
    }
    
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishword) {
      List <EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>())  ;
      englishWords.add(englishword);
      dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return dictionary.getOrDefault(polishWord, Collections.emptyList())     ;
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
         List <EnglishWord> result  = new ArrayList<>();
         for (EnglishWord englishWord: dictionary.getOrDefault(polishWord, Collections.emptyList()))      {
             if (englishWord.getPartOfSpeech().equals(partOfSpeech))
                 result.add(englishWord)   ;
                   }
         return result;
    }
}