package o;

import java.util.Scanner;      //ejercio entendido//

public class or {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, num1 = 0, num2 = 0, num3 = 0, num4 = 0, almaulti, x;
        int co;
        System.out.println("Ingrese un Numero de 4 Cifras ");
        co = sc.nextInt();
        a = co / 1000;
        x = co % 1000;
        b = x / 100;
        int f = x % 100;
        c = f / 10;
        d = f % 10;

        if (a >= b && b >= c && c >= d) { 
            num1 = a;
            num2 = b;
            num3 = c;
            num4 = d;
        } else {
            if (a >= c && c >= b && b >= d) {
                num1 = a;
                num2 = c;
                num3 = b;
                num4 = d;
            } else {
                if (a >= d && d >= c && c >= b) {
                    num1 = a;
                    num2 = d;
                    num3 = c;
                    num4 = b;

                } else {
                    if (b >= a && a >= c && c >= d) {
                        num1 = b;
                        num2 = a;
                        num3 = c;
                        num4 = d;
                    } else {
                        if (b >= c && c >= a && a >= d) {
                            num1 = b;
                            num2 = c;
                            num3 = a;
                            num4 = d;
                        } else {
                            if (b >= d && d >= c && c >= a) {
                                num1 = b;
                                num2 = d;
                                num3 = c;
                                num4 = a;

                            } else {
                                if (c >= b && b >= a && a >= d) {
                                    num1 = c;
                                    num2 = b;
                                    num3 = a;
                                    num4 = d;
                                } else {
                                    if (c >= a && a >= b && b >= d) {
                                        num1 = c;
                                        num2 = a;
                                        num3 = b;
                                        num4 = d;
                                    } else {
                                        if (c >= d && d >= a && a >= b) {
                                            num1 = c;
                                            num2 = d;
                                            num3 = a;
                                            num4 = b;
                                        } else {

                                            if (d >= c && c >= b && b >= a) {
                                                num1 = d;
                                                num2 = c;
                                                num3 = b;
                                                num4 = a;

                                            } else {
                                                if (d >= b && b >= c && c >= a) {
                                                    num1 = d;
                                                    num2 = b;
                                                    num3 = c;
                                                    num4 = a;

                                                } else {

                                                    if (d >= a && a >= b && b >= c) {
                                                        num1 = d;
                                                        num2 = a;
                                                        num3 = b;
                                                        num4 = c;

                                                    } else {
                                                        if (d >= c && c >= a && a >= b) {
                                                            num1 = d;
                                                            num2 = c;
                                                            num3 = a;
                                                            num4 = b;
                                                        }
                                                    }

                                                }

                                            }

                                        }
                                    }

                                }

                            }

                        }
                    }
                }

            }

        }

        almaulti = num1 * 1000 + num2 * 100 + num3 * 10 + num4 * 1;
        System.out.println("El numero Mayor es: " + almaulti);

    }
}
