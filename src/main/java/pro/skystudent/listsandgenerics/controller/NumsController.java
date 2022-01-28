package pro.skystudent.listsandgenerics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.skystudent.listsandgenerics.service.interfaces.NumsService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/nums")
public class NumsController {
    private final NumsService numsService;

    public NumsController(NumsService numsService) {
        this.numsService = numsService;
    }

    @GetMapping("/oddNums")
    public List printOddNums() {
        return numsService.printOddNums();
    }

    @GetMapping("/evenNums")
    public List printEvenNums() {
        return numsService.printEvenNums();
    }

    @GetMapping("/uniqueWords")
    public Set printUniqueWords() {
        return numsService.printUniqueWords();
    }

    @GetMapping("/uniqueWordsIgnoringCase")
    public List printUniqueWordsIgnoringCase() {
        return numsService.printUniqueWordsIgnoringCase();
    }

    @GetMapping("/doublesCount")
    public int printDoublesCount() {
        return numsService.printDoublesCount();
    }
}
