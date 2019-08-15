# [日面一问]2019.8.15-equals和==的区别是什么？
请看如下代码：
```java
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
```

思考一下，看看结果是否和你想的一样？

结果：
```
strA == strB 的结果是：true
strA.equals(strB) 的结果是：true
strC == strB 的结果是：false
strC.equals(strB)的结果是：true
intA == intB 的结果是：true
intA.equals(intB) 的结果是：true
intC == intD 的结果是：false
intC.equals(intD) 的结果是：true
```