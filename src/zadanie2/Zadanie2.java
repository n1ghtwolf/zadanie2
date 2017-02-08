/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

import java.util.Scanner;

/**
 *
 * @author rtv
 */
public class Zadanie2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temp = 1;
        int count = 1;




        while (temp == 1) {
            System.out.println("Вариант 9");
            System.out.println("Введите тип самолета");
            String T = in.nextLine().trim();
            System.out.println("Введите номер рейса");
            double R = Double.parseDouble(in.nextLine().trim());
            System.out.println("Введите затраті на рейс,грн");
            double Z = Double.parseDouble(in.nextLine().trim());
            System.out.println("Введите количество пассажиров");
            double K = Double.parseDouble(in.nextLine().trim());
            System.out.println("Для вічисления средней стоимости перевозки нажмите 2,Для того чтобі ввести еще позицию, нажмите 1");
            temp = Double.parseDouble(in.nextLine().trim());

            count++;
        }
        Zadanie2 reisy[] = new Zadanie2[count];








        // TODO code application logic here
    }
}
