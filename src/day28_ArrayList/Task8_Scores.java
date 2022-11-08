package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8_Scores {

    public static void main(String[] args) {

        //ArrayList<Integer> scores = new ArrayList<>();
        ArrayList <Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (int i = 0; i < scores.size(); i++) {
            if(scores.get(i)>=90){
                gradeOfA.add(scores.get(i));
            }else if(scores.get(i)>=80){
                gradeOfB.add(scores.get(i));
            }else if(scores.get(i)>=70){
                gradeOfC.add(scores.get(i));
            }else if(scores.get(i)>=60){
                gradeOfD.add(scores.get(i));
            }else{
                gradeOfF.add(scores.get(i));
            }
        }
        int numberOfA = gradeOfA.size();
        int numberOfB = gradeOfB.size();
        int numberOfC = gradeOfC.size();
        int numberOfD = gradeOfD.size();
        int numberOfF = gradeOfF.size();

        System.out.println("numberOfA = " + numberOfA);
        System.out.println("numberOfB = " + numberOfB);
        System.out.println("numberOfC = " + numberOfC);
        System.out.println("numberOfD = " + numberOfD);
        System.out.println("numberOfF = " + numberOfF);
    }
}
