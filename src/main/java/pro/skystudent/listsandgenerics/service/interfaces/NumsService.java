package pro.skystudent.listsandgenerics.service.interfaces;

import java.util.List;
import java.util.Set;

public interface NumsService {

    List printOddNums();

    List printEvenNums();

    Set printUniqueWords();

    List printUniqueWordsIgnoringCase();

    int printDoublesCount();
}
