package Vidu;

import java.util.Scanner;

public class Dowhithe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("Nhap a: " +a);
		int sum = 0, i = 0;
		do {
			if(i % 2 == 0){
				  sum +=i;
			}
		  i++;
		}while(i<=10);
		System.out.println("Tổn là: "+sum);
	}}
