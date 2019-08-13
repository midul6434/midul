public class Twoareey {
    public static void main(String[] args) {
        int[][] Results = {{20,30,5},
                            {40,88,5},
                             {33,69,33},
                                {40,55,88},
        };
        System.out.println(Results[2][2]);
        int [][] no = new int[2][2];
        no [0][0]=25;
        no[0][1]=32;
        no[1][0]=33;
        no[1][1]=44;

        System.out.println(no[0][0]);
        System.out.println("--------");
        int i=0;
        int j=0;
        for(i=0;i<no.length;i++)
         for (j=0;j<no.length;j++)
            System.out.println(no[i][i]);
        System.out.println(no[j][j]);








    }
}
