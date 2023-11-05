package com.fanxy.classDemo;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.classDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-11-03  17:45
 * @Description: TODO Number类、Math类
 * @Version: 1.0
 */
public class NumberMathDemo {

    //Number类：Boolean、Byte、Short、Integer、Long、Character、Float、Double
//        public static void main(String[] args){
//            Integer x = 5;
//            x =  x + 10;
//            System.out.println(x);
//        }

    //直接调用Math类
//        public static void main (String []args)
//        {
//            System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
//            System.out.println("0度的余弦值：" + Math.cos(0));
//            System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
//            System.out.println("1的反正切值： " + Math.atan(1));
//            System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
//            System.out.println(Math.PI);
//        }

    //xxxValue()方法 -- 用于将Number对象转换为xxx数据类型的值并返回
//        public static void main(String args[]){
//            Integer x = 5;
//            // 返回 byte 原生数据类型
//            System.out.println( x.byteValue() );	//5
//
//            // 返回 double 原生数据类型
//            System.out.println(x.doubleValue());	//5.0
//
//            // 返回 long 原生数据类型
//            System.out.println( x.longValue() );	//5
//        }

    //compareTo()方法 -- 用于将Number对象与方法的参数进行比较
    //用于两个相同数据类型的比较，两个不同类型的数据不能用此方法来比较
//        public static void main(String args[]){
//            Integer x = 5;
//            System.out.println(x.compareTo(3));	//1
//            System.out.println(x.compareTo(5));	//0
//            System.out.println(x.compareTo(8));	//-1
//        }

    //equals()方法 -- 判断 Number 对象与方法的参数进是否相等
//        public static void main(String args[]){
//            Integer x = 5;
//            Integer y = 10;
//            Integer z =5;
//            Short a = 5;
//
//            System.out.println(x.equals(y));  	//false
//            System.out.println(x.equals(z)); 	//true
//            System.out.println(x.equals(a));	//false
//        }

    //valueOf() 方法 -- 用于返回给定参数的原生 Number 对象值，参数可以是原生数据类型, String等。
    //该方法是静态方法。该方法可以接收两个参数一个是字符串，一个是基数。
//    public static void main(String[] args) {
//        Integer x = Integer.valueOf(9);
//        Double c = Double.valueOf(5);
//        Float a = Float.valueOf("80");
//
//        Integer b = Integer.valueOf("444", 16);  //使用16进制
//
//        System.out.println(x);
//        System.out.println(c);
//        System.out.println(a);
//        System.out.println(b);
//    }

    //toString()方法 -- 用于返回以一个字符串表示的 Number 对象值。
    //如果方法使用了原生的数据类型作为参数，返回原生数据类型的 String 对象值。
    //如果方法有两个参数， 返回用第二个参数指定基数表示的第一个参数的字符串表示形式。
//    public static void main(String[] args) {
//        Integer x = 5;
//        System.out.println(x.toString());
//        System.out.println(Integer.toString(12));
//        System.out.println(Integer.toString(12, 16));
//    }

    //parseInt()方法 -- 将字符串参数作为有符号的十进制整数进行解析。
    //如果方法有两个参数， 使用第二个参数指定的基数，将字符串参数解析为有符号的整数。
//    public static void main(String[] args) {
//        int x = Integer.parseInt("9");  //9
//        double c = Double.parseDouble("5"); //5.0
//        int b = Integer.parseInt("444",8);
//
//        System.out.println(x);
//        System.out.println(c);
//        System.out.println(b);
//    }

    //abs()方法 -- 返回参数的绝对值
//    public static void main(String[] args) {
//        Integer a = -8;
//        double d = -100;
//        float f = -90f;
//
//        System.out.println(Math.abs(a));
//        System.out.println(Math.abs(d));
//        System.out.println(Math.abs(f));
//    }

    //

    // ceil()方法 --对一个数进行上舍入
    // 返回值大于或等于给定的参数，类型为双精度浮点型
    // floor() 方法可对一个数进行下舍入
    // 返回给定参数最大的整数，该整数小于或等于给定的参数。
//    public static void main(String[] args) {
//        double d = 100.675;
//        float f = -90;
//
//        System.out.println(Math.ceil(d));
//        System.out.println(Math.ceil(f));
//
//        System.out.println(Math.floor(d));
//        System.out.println(Math.floor(f));
//    }

    // rint()方法 --返回最接近参数的整数值，参数为double类型
//    public static void main(String[] args) {
//        double d = 100.675;
//        double e = 100.500;
//        double f = 100.200;
//
//        System.out.println(Math.rint(d));
//        System.out.println(Math.rint(e));
//        System.out.println(Math.rint(f));
//    }

    // round()方法 --返回一个最接近的 int、long 型值，四舍五入
    // 原来的数字加上 0.5 后再向下取整
    // 参数为 double 或 float 的原生数据类型
//    public static void main(String[] args) {
//        double d = 100.675;
//        double e = 100.500;
//        float f = 100;
//        float g = 90f;
//
//        System.out.println(Math.round(d));
//        System.out.println(Math.round(e));
//        System.out.println(Math.round(f));
//        System.out.println(Math.round(g));
//    }

    // min() 方法用于返回两个参数中的最小值
    // max() 方法用于返回两个参数中的最大值
//    public static void main(String[] args) {
//        System.out.println(Math.min(12.123,12.456));
//        System.out.println(Math.min(23.12,23.0));
//
//        System.out.println(Math.max(12.123, 18.456));
//        System.out.println(Math.max(23.12, 23.0));
//    }

    // exp() 方法用于返回自然数底数e的参数次方,参数为double类型
    // log() 方法用于返回参数的自然数底数（以 e 为底）的对数值
    // pow() 方法用于返回第一个参数的第二个参数次方
    // sqrt() 方法用于返回参数的算术平方根
//    public static void main(String[] args) {
//        double x = 11.635;
//        double y = 2.76;
//
//        System.out.printf("e的值为%.4f%n", Math.E);
//        System.out.printf("exp(%.3f)为%.3f\n", x, Math.exp(x));
//        System.out.printf("exp(%.2f)为%.3f\n", y, Math.exp(y));
//
//        System.out.println("-----------");
//        System.out.printf("log(%.3f) 为 %.3f%n", x, Math.log(x));
//
//        System.out.println("-----------");
//        System.out.printf("pow(%.3f, %.3f) 为 %.3f%n", x, y, Math.pow(x, y));
//
//        System.out.println("-----------");
//        System.out.printf("sqrt(%.3f) 为 %.3f%n", x, Math.sqrt(x));
//    }

    //三角函数
    public static void main(String[] args) {
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);   //角度转化为弧度

        // sin() 方法用于返回指定double类型参数的正弦值
        System.out.format("pi 的值为 %.4f\n",Math.PI);
        System.out.format("%.1f 度的正弦值为 %.4f%n",degrees,Math.sin(radians));

        // cos() 方法用于返回指定double类型参数的余弦值
        System.out.println("---------------------");
        System.out.format("%.1f 度的余弦值为 %.4f%n", degrees, Math.cos(radians));

        // tan() 方法用于返回指定double类型参数的正切值
        System.out.println("---------------------");
        System.out.format("%.1f 度的正切值是 %.4f%n", degrees, Math.tan(radians));

        // asin() 方法用于返回指定double类型参数的反正弦值
        System.out.println("---------------------");
        System.out.format("%.4f 的反正弦值为 %.4f 度 %n", Math.sin(radians), Math.toDegrees(Math.asin(Math.sin(radians))));

        // acos() 方法用于返回指定 double 类型参数的反余弦值
        System.out.println("----------------------");
        System.out.format("%.4f 的反余弦值为 %.4f 度\n",Math.cos(radians),Math.toDegrees(Math.acos(Math.sin(radians))));

        // 变量
        double a = 0.5;
        double b = 0.79;
        double c = 0.0;
        double d = 2;

        // 输出
        // acos() 方法用于返回指定 double 类型参数的反余弦值
        //指定的参数大于 1，则返回 NaN
        System.out.println("-----------------------");
        System.out.println(Math.acos(a));  // 1.0471975511965979
        System.out.println(Math.acos(b));  // 0.6599873293874984
        System.out.println(Math.acos(c));  // 1.5707963267948966
        System.out.println(Math.acos(d));  // d 大于 1，所以输出 NaN

        // atan() 方法用于返回指定double类型参数的反正切值
        System.out.println("-----------------------");
        System.out.format("%.4f 的反正切值为 %.4f 度\n",Math.cos(radians),Math.toDegrees(Math.atan(Math.sin(radians))));

        // atan2() 方法用于将矩形坐标 (x, y) 转换成极坐标 (r, theta)，返回所得角 theta.
        // 该方法通过计算 y/x 的反正切值来计算相角 theta，范围为从 -pi 到 pi
        double x = 45.0;    //横坐标
        double y = 30.0;    //纵坐标

        //计算极坐标的角theta
        System.out.println("------------------------");
        System.out.println( Math.atan2(x, y) );

        // toDegrees() 方法用于将参数转化为角度
        System.out.println("------------------------");
        System.out.println( Math.toDegrees(x) );
        System.out.println( Math.toDegrees(y) );

        // toRadians() 方法用于将角度转换为弧度
        System.out.println("------------------------");
        System.out.println( Math.toRadians(x) );
        System.out.println( Math.toRadians(y) );

        // random() 方法用于返回一个随机数，随机数范围为 0.0 =< Math.random < 1.0
        System.out.println("------------------------");
        System.out.println( Math.random() );
        System.out.println( Math.random() );
    }


    // Math 的 floor,round 和 ceil 方法实例比较
//    public static void main(String[] args) {
//        double[] nums = {1.4, 1.5, 1.6, -1.4, -1.5, -1.6};
//        for (double num : nums) {
//            test(num);
//            System.out.println("-----------------------");
//        }
//    }
//
//    private static void test(double num) {
//        System.out.println("Math.floor(" + num + ")=" + Math.floor(num));
//        System.out.println("Math.round(" + num + ")=" + Math.round(num));
//        System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));
//    }
}

