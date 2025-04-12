/**
 * 我是你爹
 */
import javax.swing.*;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args)
    {
        //整数
        System.out.println(666);
        System.out.println(-777);
        System.out.println("黑马程序员");
        System.out.println(111);
        System.out.println(111);
        String text = "Woshinidie";
        System.out.println(text + text.hashCode());
        String subtext = text.substring(1, 3); //左闭右开
        System.out.println(subtext);
        String Revere_text = new StringBuilder(text).reverse().toString();
        System.out.println(Revere_text);
        StringBuilder test_reverse = new StringBuilder(text).append('a');
        System.out.println(test_reverse.getClass());
        int index = text.indexOf("nidie");
        System.out.println(index);



    }
}

