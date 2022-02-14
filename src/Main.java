import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class Main {
    
    static String[] data = null;
    static int[] lottoNum = new int[6];
    static int[] decisionSpace = null;
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        

        while(true){
            data = bf.readLine().split(" ");

            if(data[0].equals("0")){
                break;
            }
            decisionSpace = new int[Integer.parseInt(data[0])+1];

            backtracking(0);

        }

    }

    public static void backtracking(int index){
        if(index==6){
            for(int i=0;i<lottoNum.length;i++){
                System.out.print(lottoNum[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=1;i<data.length;i++){
            if(decisionSpace[i]!=1){
                lottoNum[index] = Integer.parseInt(data[i]);
                decisionSpace[i] = 1;
                backtracking(index+1);
                decisionSpace[i] = 0;
            }
        }
    }

}


