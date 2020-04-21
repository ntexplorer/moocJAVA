/**
 * @Time 2020/4/21 20:11
 * @Author T
 * @Project moocJAVA
 * @Class Test
 * @Software IntelliJ IDEA
 * @Version 1.0
 */

package homework.test;

import homework.model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The type Test.
 */
public class Test {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        initializeShow();
    }

    /**
     * Show info.
     */
    public static void showInfo() {
        System.out.println("*************欢迎来到马戏团***********");
        System.out.println("*************请选择表演者*************");
        System.out.println("*************  1、棕熊  *************");
        System.out.println("*************  2、狮子  *************");
        System.out.println("*************  3、猴子  *************");
        System.out.println("*************  4、鹦鹉  *************");
        System.out.println("*************  5、小丑  *************");
    }

    /**
     * Continue info.
     */
    public static void continueInfo() {
        System.out.println("******  是否继续观看（1/0）  ********");
    }

    /**
     * Start show.
     */
    public static void startShow() {
        Bear bear = new Bear("Bill", 1);
        Parrot parrot = new Parrot("Rose", 1, "牡丹鹦鹉");
        Lion lion = new Lion("Lain", 2, "灰色", "公狮");
        Monkey monkey = new Monkey("Tom", 1, "金丝猴");
        Scanner keyboard = new Scanner(System.in);
        showInfo();
        try {
            int input = keyboard.nextInt();
            switch (input) {
                case 1: {
                    System.out.println(bear.act());
                    break;
                }

                case 2: {
                    System.out.println(lion.act());
                    break;
                }

                case 3: {
                    System.out.println(monkey.act());
                    break;
                }
                case 4: {
                    System.out.println(parrot.act());
                    break;
                }

                case 5: {
                    class Clown implements IAct {
                        private final String name = "Kahle";
                        private final int actAge = 5;
                        private final String outfit = "身穿五彩服装，头上带着彩色的帽子，脸上画着夸张的彩妆";

                        @Override
                        public String skill() {
                            return "脚踩高跷，进行杂技魔术表演";
                        }

                        @Override
                        public String act() {
                            return "表演者：" + this.name + "\n艺龄：" + this.actAge + "年\n着装：" + this.outfit
                                    + "\n技能：" + this.skill();
                        }
                    }
                    System.out.println(new Clown().act());
                    break;
                }
                default: {
                    System.out.println("**  输入信息不正确，请重新输入  **");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("异常输入，请重试！");
            String input = keyboard.nextLine();
            startShow();
        }

    }


    /**
     * Initialize show.
     */
    public static void initializeShow() {
        startShow();
        while (true) {
            continueInfo();
            Scanner sc = new Scanner(System.in);
            try {
                int nextInput = sc.nextInt();
                if (nextInput == 0) {
                    System.out.println("****  欢迎下次光临  ****");
                    break;
                } else if (nextInput == 1) {
                    startShow();
                } else {
                    System.out.println("无效的输入，请重试");
                }
            } catch (InputMismatchException e) {
                System.out.println("异常输入，请重试");
                String nex = sc.nextLine();
            }

        }
    }
}
