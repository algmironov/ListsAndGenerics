package pro.skystudent.listsandgenerics.service.impl;

import org.springframework.stereotype.Service;
import pro.skystudent.listsandgenerics.service.interfaces.NumsService;

import java.util.*;

@Service
public class NumsServiceImpl implements NumsService {

    @Override
    public List printOddNums() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> oddNums = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                oddNums.add(num);
            }
        }
        return oddNums;
    }

    @Override
    public List printEvenNums() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 10, 2, 8, 8, 12, 11, 144, 64, 256, 18, 20));
        List<Integer> evenNums = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                evenNums.add(num);
            }
        }
        evenNums.sort(Comparator.naturalOrder());
        for (int i = 0; i < evenNums.size() -1; i++) {
            if (evenNums.get(i).equals(evenNums.get(i + 1))) {
                evenNums.remove(evenNums.get(i));
            }
        }
        return evenNums;
    }

    @Override
    public Set printUniqueWords() {
        List<String> textWithDoubledWords = new ArrayList<>(List.of("На", "дворе", "трава", "на", "траве", "дрова", "раз", "дрова",
                "два", "дрова", "три", "дрова", "дрова", "вдоль", "двора", "дрова", "вширь", "двора",
                "не", "вместит", "двор", "дров", "надо", "дрова", "выдворить", "обратно", "со", "двора"));
        return new HashSet<>(textWithDoubledWords);
    }

    //Метод продолжает предыдущий и удаляет повторяющиеся слова, начинающиеся с заглавной буквы.
    @Override
    public List printUniqueWordsIgnoringCase() {
        List<String> textWithDoubledWords = new ArrayList<>(List.of("На", "дворе", "трава", "на", "траве", "дрова", "раз", "дрова",
                "два", "дрова", "три", "дрова", "дрова", "вдоль", "двора", "дрова", "вширь", "двора",
                "не", "вместит", "двор", "дров", "надо", "дрова", "выдворить", "обратно", "со", "двора"));
        Set<String> textWithoutDoubles = new HashSet<>();
        textWithoutDoubles.addAll(textWithDoubledWords);
        List<String> textToPrint = new ArrayList<>(textWithoutDoubles);
        for (int i = 0; i < textToPrint.size() - 1; i++) {
            if (textToPrint.get(i).equalsIgnoreCase(textToPrint.get(i + 1))) {
                textToPrint.remove(textToPrint.get(i));
            }
        }

        return textToPrint;
    }

    @Override
    public int printDoublesCount() {
        List<String> textWithDoubledWords = new ArrayList<>(List.of("На", "дворе", "трава", "на", "траве", "дрова", "раз", "дрова",
                "два", "дрова", "три", "дрова", "дрова", "вдоль", "двора", "дрова", "вширь", "двора",
                "не", "вместит", "двор", "дров", "надо", "дрова", "выдворить", "обратно", "со", "двора"));
        int doublesCounter = 0;
        int indexCounter = 0;
        textWithDoubledWords.sort(String::compareToIgnoreCase);
        for (int i = 0; i < textWithDoubledWords.size() - 1; i++ ) {
            if (textWithDoubledWords.get(i).equalsIgnoreCase(textWithDoubledWords.get(i + 1))) {
                doublesCounter++;
            }
        }
        return doublesCounter;
    }
}
