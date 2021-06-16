package leetcode.tw.jackson.structure;

public class Tester<T1, T2> {

    public T1 question;
    public T2 answer;

    public Tester(T1 question, T2 answer) {
        this.question = question;
        this.answer = answer;
    }
}
