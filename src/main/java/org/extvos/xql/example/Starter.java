package org.extvos.xql.example;

import org.extvos.xql.annotation.Column;
import org.extvos.xql.Table;

import java.util.Timer;

public class Starter {
    // for step in range(2, int(n / 2)):
    //        p = int(n / step)
    //        if p - int(step / 2) <= 0:
    //            return
    //        if step % 2 != 0:
    //            if n % step == 0:
    //                s = [p - int(step / 2) + i for i in range(step)]
    //                print('1===', s)
    //        else:
    //            if n > p * step:
    //                s = [(p - (int(step / 2) - 1)) + i for i in range(step)]
    //            else:
    //                s = [(p - (int(step / 2))) + i for i in range(step)]
    //            # for i in range(int(step / 2)):
    //            # print('>>>', s)
    //            if sum(s) == n:
    //                print('2===', s)
    public static void getAns1(int n) {
        for (int step = 2; step < n / 2; step++) {
            int p = n / step;
//            System.out.println("p:" + p + ",step:" + step);
            if (p - step / 2 < 0) {
                return;
            }
            if (step % 2 != 0) {
                if (n % step == 0) {
                    System.out.print("getAns1: ");
                    for (int i = 0; i < step; i++) {
                        System.out.print((p - (step / 2) + i) + " ");
                    }
                    System.out.println("");
                }
            } else {
                int sum, o;
                if (n > step * p) {
                    o = p - ((step / 2) - 1);
                } else {
                    o = p - (step / 2);
                }
                sum = 0;
                for (int i = 0; i < step; i++) {
                    sum += (o + i);
                }
                if (sum == n) {
                    System.out.print("getAns1: ");
                    for (int i = 0; i < step; i++) {
                        System.out.print((o + i) + " ");
                    }
                    System.out.println("");
                }
            }

        }
    }

    public static void getAns2(int n) {
        int min = 1, max = 1, sum = 1;
        while (min <= n / 2 + 1) {
            if (sum == n) {
                System.out.print("getAns2: ");
                for (int k = min; k <= max; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
                sum = sum - min;
                min++;
                max++;
                sum = sum + max;
            }
            if (sum > n) {
                sum = sum - min;
                min++;
            } else {
                max++;
                sum = sum + max;
            }
        }
    }

    public static void main(String[] args) {
//        Table personTable;
//        try {
//            personTable = Table.declare(Person.class);
//        } catch (Exception e) {
//            System.out.println(e);
//            System.exit(-1);
//            return;
//        }
//        Person person = new Person("Mingcai", "SHEN");
//        person.id = 1;
//
//        System.out.println("Hello," + person);
//        System.out.println("Hello," + personTable.getTableName());
//        System.out.println("Hello," + person);
//        System.out.println("Hello," + person);
//        System.out.println("Hello," + person);
        int n = 15;

        getAns1(n);
        getAns2(n);
    }
}
