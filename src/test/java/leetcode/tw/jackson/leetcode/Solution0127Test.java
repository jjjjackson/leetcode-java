package leetcode.tw.jackson.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

class Question {

    String beginWord;
    String endWord;
    List<String> wordList;

    public Question(String beginWord, String endWord, List<String> wordList) {
        this.beginWord = beginWord;
        this.endWord = endWord;
        this.wordList = wordList;
    }
}

public class Solution0127Test {

    @Test
    public void testSuccessCases() {
        List<Tester<Question, Integer>> testers = new ArrayList<>();

        testers.add(
            new Tester<Question, Integer>(
                new Question(
                    "hit",
                    "cog",
                    new ArrayList<>(
                        Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")
                    )
                ),
                5
            )
        );

        testers.forEach(
            tester ->
                assertEquals(
                    tester.answer,
                    new Solution0127()
                    .ladderLength(
                            tester.question.beginWord,
                            tester.question.endWord,
                            tester.question.wordList
                        )
                )
        );
    }

    @Test
    public void testFailCases() {
        List<Tester<Question, Integer>> testers = new ArrayList<>();
        testers.add(
            new Tester<Question, Integer>(
                new Question(
                    "hit",
                    "cog",
                    new ArrayList<>(
                        Arrays.asList("hot", "dot", "dog", "lot", "log")
                    )
                ),
                0
            )
        );

        testers.forEach(
            tester ->
                assertEquals(
                    tester.answer,
                    new Solution0127()
                    .ladderLength(
                            tester.question.beginWord,
                            tester.question.endWord,
                            tester.question.wordList
                        )
                )
        );
    }
}
