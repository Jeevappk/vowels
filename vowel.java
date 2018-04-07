package github;
import java.io.*;
public class vowel {
	public static void main(String[] args)throws Exception {
		String option;
		System.out.println("enter your choice:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		option=br.readLine();		
		switch(option) {
		case "a":
			System.out.println("vowel");
			break;
		case "e":
			System.out.println("vowel");
			break;
		case "i":
			System.out.println("vowel");
			break;
		case "o":
			System.out.println("vowel");
			break;
		case "u":
			System.out.println("vowel");
			break;
		default:
			System.out.println("consonant");
			break;	
		}
	}
}
