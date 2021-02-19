package _03_operator;

public class MyOperator {

    public static void main(String[] args) {
        //1. Toán tử số học +, -, *, /, %, ++, --
        int x = 8;
//        System.out.println(x++);
        //2. Toán tử gán =, +=, -=, *=, /=, %=
        x +=1; //x = x +1
        System.out.println(x);
        //3. Toán tử so sánh ==, !=, >, <, >=, <=

        System.out.println(9!=8);

        //4. Toán tử logic &&, ||, !
        System.out.println(6>2 || 6 > 9);

        //5. Toán tử bit &, |, ~, ^, <<, >>, >>>
        System.out.println((char)('A'|' '));
    }
}
