package javabasics;
import java.util.*;

public class Parameters {
	public static void CommonMovies(String actor,String actress,int commonmovies) {
		System.out.println(actor +" And "+actress+" has total of common movies are "+ commonmovies);		
	}
	public Parameters() {
		System.out.println("these is default constructor");
	}
	public Parameters(String actor,String actress,int totalNoOfMovies,int hits,int commonmovies) {
		System.out.println("Name of the actor is "+actor+". He has total no of movies of "+totalNoOfMovies+" which has total no of hits are "+hits);
		CommonMovies(actor,actress,commonmovies);
		
	}
	public static void main(String[] args) {
		Parameters pf=new Parameters();
		Scanner input=new Scanner(System.in);
		System.out.println("Name of the actor");
		String actor=input.next();
		System.out.println("Name of the actress");
		String actress=input.next();
		System.out.println("total no of movies");
		int totalNoOfMovies=input.nextInt();
		System.out.println("hits");
		int hits=input.nextInt();
		System.out.println("No of common movies");
		int common=input.nextInt();
		

		Parameters pm=new Parameters(actor, actress, totalNoOfMovies, hits,common);

		input.close();
		

	}

}
