package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// java string token hackerrank solution:
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        String token[]=s.split("[^a-zA-Z]+");
        if(s.length()==0){
            System.out.println(0);
        }
        else{
            System.out.println(token.length);
        }
        for(String word:token)
            System.out.println(word);
        scan.close();
    }
}


