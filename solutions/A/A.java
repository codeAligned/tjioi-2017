import java.util.*;
import java.io.*;

public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int robot_time = (A/100) * T;
            if(robot_time > B){
                System.out.println("What do you mean I'm slow?");
            } else{
                System.out.println("Once you quit track you can never come back");
            }
        }
    }
}
