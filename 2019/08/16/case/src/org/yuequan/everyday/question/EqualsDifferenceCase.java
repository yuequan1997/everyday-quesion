package org.yuequan.everyday.question;

public class EqualsDifferenceCase {
    public static void main(String[] args) {
        var strA = "aaabbbb";
        var strB = "aaabbbb";
        var strC = new String("aaabbbb");
        System.out.println("strA == strB 的结果是：" + (strA == strB));
        System.out.println("strA.equals(strB) 的结果是：" + strA.equals(strB));
        System.out.println("strC == strB 的结果是：" + (strC == strB));
        System.out.println("strC.equals(strB)的结果是：" + strC.equals(strB));

        Integer intA = 127;
        Integer intB = 127;
        //提示： 这一句是反例，包装类型不应使用==判断,应该使用equals
        System.out.println("intA == intB 的结果是：" + (intA == intB));
        System.out.println("intA.equals(intB) 的结果是：" + (intA.equals(intB)));

        Integer intC = 128;
        Integer intD = 128;
        //提示： 这一句是反例，包装类型不应使用==判断,应该使用equals
        System.out.println("intC == intD 的结果是：" + (intC == intD));
        System.out.println("intC.equals(intD) 的结果是：" + (intC.equals(intD)));
    }
}
