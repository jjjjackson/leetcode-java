package leetcode.tw.jackson.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Solution0127 {

    List<String> wordList;

    public int ladderLength(
        String beginWord,
        String endWord,
        List<String> wordList
    ) {
        this.wordList = wordList;

        int result = 0;
        Deque<String> queue = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();

        queue.offerLast(beginWord);

        while (queue.size() > 0) {
            result++;
            int size = queue.size();

            while (size > 0) {
                size--;
                String word = queue.pollFirst();

                if (sameWord(word, endWord)) { // Leetcode 上的 String Pool 可能有問題，所以用不了 word == endWord
                    return result;
                }

                if (visited.contains(word)) {
                    continue;
                }

                List<String> relatives = getRelativeWords(word);
                visited.add(word);

                relatives
                    .stream()
                    .filter(r -> !visited.contains(r))
                    .forEach(r -> queue.offerLast(r));
            }
        }

        return 0;
    }

    public List<String> getRelativeWords(String source) {
        return wordList
            .stream()
            .filter(
                word -> {
                    int diff = 0;
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) != source.charAt(i)) {
                            diff++;
                        }
                    }
                    return diff == 1;
                }
            )
            .collect(Collectors.toList());
    }

    private boolean sameWord(String a, String b ) {
        for (int i = 0; i < b.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
