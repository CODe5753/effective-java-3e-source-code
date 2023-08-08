package effectivejava.chapter5.item29;

import effectivejava.chapter3.item13.Stack;

public class Main {

    // 171p
    static void case1() {
        Integer num = 100;
        var stack = new Stack();
        stack.push(num);

        // 171p. 지금 상태에서의 클라이언트는 스택에서 꺼낸 객체를 형변환 해야함
        // 런타임 오류가 날 가능성이 있음
        Integer popNum = (Integer) stack.pop();
    }

    //
    static void case2() {
        Integer num = 100;
        var stack = new effectivejava.chapter5.item29.technqiue1.Stack();
        stack.push(num);

        String popNum = (String) stack.pop();
    }

    public static void main(String[] args) {
        case2();
    }
}
