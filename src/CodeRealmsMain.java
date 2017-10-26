import help.HelpMain;
import help.HelpStrings;
import sandbox.Sandbox;

import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.util.*;


public class CodeRealmsMain {

    public static void main(String[] args){

        int count = 0;
        int[] a = {1,3,5};
        int[] b = {1,2,3,4,5};

        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if (a[i] == b[j]){
                    count++;
                }
            }
        }
        int[] c = new int[count];

        for (int k=0;k<a.length;k++){
            for (int l=0;l< (b.length);l++){
                if (Integer.compare(a[k], b[l]) == 0){
                    c[k] = b[l];
                }
            }
        }
        for (int i: c){
            System.out.println("final --> " + i);
        }
//       Scanner scan = new Scanner(System.in);
//        System.out.println("enter the year: ");
//        for (String temp : getYearData(scan.nextLine())){
//            System.out.println(temp);
//        }
//        String[] strings = {"hello", "there", "how's", "it", "going", "today"};
//        int[] ints = {12,54,23,71,15,02,596,235,394,12,54,97};
//
//        for (Object i: sortMyIntList(ints)){
//            System.out.println(i);
//        }

    }

    public static ArrayList sortMyIntList(int[] ints){
        int[] sortedList = new int[ints.length];
        ArrayList<Integer> sorted = new ArrayList<>();
        for (int i: ints){
            sorted.add(i);
        }

        Collections.sort(sorted);

        return sorted;
    }

    public static String[] getYearData(String year){
        String[] giveYear;
        String[] twoOFour = {
                "2004","23,853","22,839","36,483","31,352"
        };
        String[] twoOFive = {
                "2005","25,483","22,943","38,274","33,294"
        };
        String[] twoOSix = {
                "2006","24,872","23,049","39,002","36,888"
        };
        if (year.equals("2004")){
            giveYear = twoOFour.clone();
        }
        else if (year.equals("2005")){
            giveYear = twoOFive.clone();
        }
        else if (year.equals("2006")){
            giveYear = twoOSix.clone();
        }
        else {
            giveYear = new String[0];
        }
        return giveYear;
    }
}
