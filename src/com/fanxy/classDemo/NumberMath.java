package com.fanxy.classDemo;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.classDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-11-03  17:45
 * @Description: TODO
 * @Version: 1.0
 */
public class NumberMath {
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

    //ValueOf()方法
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
    //compareTo()方法
//        public static void main(String args[]){
//            Integer x = 5;
//            System.out.println(x.compareTo(3));	//1
//            System.out.println(x.compareTo(5));	//0
//            System.out.println(x.compareTo(8));	//-1
//        }

    //equals() 方法
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

    //valueOf() 方法
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
    //toString()方法
//    public static void main(String[] args) {
//        Integer x = 5;
//        System.out.println(x.toString());
//        System.out.println(Integer.toString(12));
//        System.out.println(Integer.toString(12, 16));
//    }
    //parseInt()方法
    public static void main(String[] args) {
        int x = Integer.parseInt("9");  //9
        double c = Double.parseDouble("5"); //5.0
        int b = Integer.parseInt("444",8);

        System.out.println(x);
        System.out.println(c);
        System.out.println(b);
    }
}

