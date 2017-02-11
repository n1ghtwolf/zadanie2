/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rtv
 */
public class Zadanie2 {

  
    public static  Reisy reisy[];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //double temp = 1;
        //int count = 1;


 System.out.println("Сколько планируется итераций?");
 int temp  = Integer.parseInt(in.nextLine().trim());
reisy = new Reisy[temp];
        for (int i=0;i<temp;i++) {
            System.out.println("Вариант 9");
            
            System.out.println("Введите тип самолета");
            String T = in.nextLine().trim();
            System.out.println("Введите номер рейса");
            double R = Double.parseDouble(in.nextLine().trim());
            System.out.println("Введите затраті на рейс,грн");
            double Z = Double.parseDouble(in.nextLine().trim());
            System.out.println("Введите количество пассажиров");
            double K = Double.parseDouble(in.nextLine().trim());
            //System.out.println("Для вічисления средней стоимости перевозки нажмите 2,Для того чтобі ввести еще позицию, нажмите 1");
           
            reisy[i] = new Reisy(T,R,Z,K);
              
            
        }
       System.out.println(Arrays.toString(reisy));








        // TODO code application logic here
    }
}
