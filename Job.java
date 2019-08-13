//A student will get a job if he studied total more than 15 hours a day and within this time at least 6 hours coding and 4 hours reading coding books and 5 hours doing CodeLab.
// Write code to find Student who got job by printing “You got the job”. If above conditions does not meet print “Job is not for you, work hard and try again!!!”



public class Job {
    public static void main(String[] args) {
        boolean studyhard = true;
        System.out.println(studyhard +" that we have to study 15 hours a day to get the job");
        String coding,readingcoding,codelab;
        coding="6";
        readingcoding="4";
        codelab="5";
        System.out.println("we have to do coding " + coding+" hours reading coding "+readingcoding+" hours code lab "+codelab+" hours");

        int value1=15;
        int value2=6;
        int value3=4;
        int value4=4;

        if ((value1==15)&&(value2==6)&&(value3==4)&&(value4==4)){
            System.out.println("you got the job");
        }
        else{
            System.out.println("Job is not for you, work hard and try again!!!");
        }

    }

}


