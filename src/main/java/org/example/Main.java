package org.example;

import java.util.HashMap;
import java.util.Map;


public class Main {

  public static String findFrequencyElement(String s) {

    if (s.isBlank() || s.isEmpty()) {
      throw new IllegalArgumentException("String is blank or empty.");
    } else {
      Map<Character, Integer> frequencyMap = new HashMap<>();

      for (char c : s.toLowerCase().toCharArray()) {
        if (Character.isLetter(c)) {
          frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
      }

      var maxValue = 0;
      char charWithMaxValue = 0;

      for (Map.Entry <Character, Integer> elementOfMap : frequencyMap.entrySet()) {
        if (elementOfMap.getValue() > maxValue) {
          maxValue = elementOfMap.getValue();
          charWithMaxValue = elementOfMap.getKey();
        }
      }

      return String.format("%s - %s", charWithMaxValue, maxValue);
    }
  }

}