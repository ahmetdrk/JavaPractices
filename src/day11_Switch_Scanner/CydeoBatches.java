package day11_Switch_Scanner;

public class CydeoBatches {

    public static void main(String[] args) {

        String batchType1 = "US morning";
        String result1 = "";

        if (batchType1 == "US morning" || batchType1 == "US evening" || batchType1 == "EU") {
            if (batchType1 == "US morning") {
                result1 = "Class times are 10-5 EST. M, T, Th, F.";

            } else if (batchType1 == "US evening") {
                result1 = "Class times are 7-10 EST. M, T, W, Th, S, S";

            } else {
                result1 = "Class times are  10-5 EST. M, T, W, Th, F.";
            }

        } else {
            result1 = "Invalid Batch";

        }
        System.out.println(result1);



        String batchType2 = "US evening";
        String result2 = "";

        switch (batchType2) {
            case "US morning" :
                result2 = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening" :
                result2 = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            default:
                result2 = "Class times are  10-5 EST. M, T, W, Th, F.";

        }
        System.out.println (result2);




        String batchType3 = "EU";
        String result3 = "";



    }

}
/*
4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */