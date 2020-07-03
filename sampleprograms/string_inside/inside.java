package sample_programs.string_inside;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class inside {

	private static BufferedReader br;
	private static Scanner sc;

	public static void main(String[] args) throws IOException {
	
		File f = new File("D:\\Profile\\Projects\\Snippets\\Java\\src\\sample_programs\\string_inside\\Sample.txt");
		FileReader fr = new FileReader(f);
		sc = new Scanner(System.in);
		br = new BufferedReader(fr);
		String searchContent;
		String s;
		StringTokenizer st;
                int i=0;
		//int i=0,j=0;
		//int count=0;
		//String fc[] = null;
		ArrayList<String> al = new ArrayList<String>();
		if(f.exists())
		{
			System.out.println("File exists");
			
			while((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				while(st.hasMoreTokens())
				{
					//fc[i]=st.nextToken()
					al.add(st.nextToken());
					i++;
				}
				
			}
                        System.out.println("Total String Found : " + i);
		}
		else
		{
			System.out.println("File does not exists");
		}
		
		System.out.println(al);
                
                System.out.print("Enter String to search : ");
                searchContent = sc.next();
                
		if(al.contains(searchContent))
		{
			System.out.println(searchContent + " Found...");
		}
		else
		{
			System.out.println(searchContent + " Not found...");
		}
	}
}