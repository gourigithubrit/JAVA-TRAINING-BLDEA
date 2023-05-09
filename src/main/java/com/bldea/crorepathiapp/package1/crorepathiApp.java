/**
 * 
 */
package com.bldea.crorepathiapp.package1;

import java.util.Scanner;

/**
 * @author gouri
 *
 */
public class crorepathiApp {
	public static void main(String[] args) {
		System.out.println("welcome to crorepathi game");
		System.out.println("lets welcome our first candidate");
		Scanner sc =new Scanner(System.in);
		
        System.out.println("What is your name?");
        String name=sc.next();
        System.out.println("what is your age?");
        int age=sc.nextInt();
        System.out.println("what is your city?");
        String city=sc.next();
        System.out.println("what is your state?");
        String state=sc.next();

 Candidates c1 = new Candidates (name, age, city, state);
 //Question q= new Question;
 System.out.println("congratulations for making it till here Mr/Ms."+c1.getName());
 System.out.println("----------------------------");
 System.out.println("|the rules of the game are:|");
 System.out.println("----------------------------");
 System.out.println("1. There will be 10 questions which rewards a specific amount int" +"incremental order");
 System.out.println("2. The game will contain 3 life lines,"+"(audiance phone,50-50 and skip the question");
 System.out.println("3. You can quit the game at any stage,");
 System.out.println("Please type 1 if you wish to see the reward per question, else type_2");
 int type_1=sc.nextInt();
 if(type_1==1) {
	System.out.println("Question-1: 1000\n"+
                       "Question-2: 2000\n"+
			           "Question-3: 4000\n"+
                       "Question-4: 8000\n"+
			           "Question-5: 10000\n"+
                       "Question-6: 20000\n"+
			           "Question-7: 30000\n"+
                       "Question-8: 50000\n"+
			           "Question-9: 100000\n"+
                       "Question-10: 1000000\n");
	System.out.println("Do you wish to continue??(Type: YES/NO)");

	}
 else {
	System.out.println("Do you wish to continue??(Type: YES/NO)");
 }
	 String type_2=sc.next();
	 if(type_2.equalsIgnoreCase("Yes")==true) {
		 System.out.println("Lets Begin the Game");
		 System.out.println("Here is the first question.");
		 boolean res1=Question.fetchQuestion1(c1.getName());
		 if(res1==true) {
			System.out.println("Congratulations!! Your answer is correct.\n"+"You have won."+c1.getAmount());
			System.out.println("---------------------------------------------------------------");
			System.out.println("Here is next question.");
			boolean res2=Question.fetchQuestion2(c1.getName());
			if(res2==true) {
				System.out.println("Congratulations!! Your answer is correct.\n"+"You have won."+c1.getAmount());
				System.out.println("---------------------------------------------------------------");
				System.out.println("Here is next question.");
				boolean res3=Question.fetchQuestion3(c1.getName());
				if(res3==true) {
					System.out.println("Congratulations!! Your answer is correct.\n"+"You have won."+c1.getAmount());
					System.out.println("---------------------------------------------------------------");
					System.out.println("Here is next question.");boolean res4=Question.fetchQuestion4(c1.getName());
					if(res4==true) {
						System.out.println("Congratulations!! Your answer is correct.\n"+"You have won."+c1.getAmount());
						System.out.println("---------------------------------------------------------------");
						System.out.println("Here is next question.");
						boolean res5=Question.fetchQuestion5(c1.getName());
						if(res5==true) {
							System.out.println("Congratulations!! Your answer is correct.\n"+"You have won."+c1.getAmount());
							System.out.println("---------------------------------------------------------------");
							System.out.println("Here is next question.");
							boolean res6=Question.fetchQuestion6(c1.getName());
							if(res6==true) {
								System.out.println("Congratulations!! Your answer is correct.\n"+"You have won."+c1.getAmount());
								System.out.println("---------------------------------------------------------------");
								System.out.println("Here is next question.");
								boolean res7=Question.fetchQuestion7(c1.getName());
								if(res7==true) {
									System.out.println("Congratulations!! Your answer is correct.\n"+"You have won."+c1.getAmount());
									System.out.println("---------------------------------------------------------------");
									System.out.println("Here is next question.");
									boolean res8=Question.fetchQuestion8(c1.getName());
									if(res8==true) {
										System.out.println("Congratulations!! Your answer is correct.\n"+"You have won."+c1.getAmount());
										System.out.println("---------------------------------------------------------------");
										System.out.println("Here is next question.");
										boolean res9=Question.fetchQuestion9(c1.getName());
										if(res9==true) {
											System.out.println("Congratulations!! Your answer is correct.\n"+"You have won."+c1.getAmount());
											System.out.println("---------------------------------------------------------------");
											System.out.println("Here is next question.");
											boolean res10=Question.fetchQuestion10(c1.getName());
											if(res10==true) {
												System.out.println("Congratulations!! Your answer is correct.\n"+"You have won."+c1.getAmount());
												System.out.println("---------------------------------------------------------------");
												}
											else {
												System.out.println("We are sorry!! ypur answer is incorrect.\n"+"you have won Rs,"+c1.getAmount());
												}
											}
										else {
			System.out.println("We are sorry!! your answer is incorrect.\n"+"you have won Rs,"+c1.getAmount());
		}
										}
									else {
			System.out.println("We are sorry!! your answer is incorrect.\n"+"you have won Rs,"+c1.getAmount());
		}
									}
								else {
			System.out.println("We are sorry!! your answer is incorrect.\n"+"you have won Rs,"+c1.getAmount());
		}
							}
							else {
			System.out.println("We are sorry!! your answer is incorrect.\n"+"you have won Rs,"+c1.getAmount());
		}
						}
						else {
			System.out.println("We are sorry!! your answer is incorrect.\n"+"you have won Rs,"+c1.getAmount());
		}
					}
					else {
			System.out.println("We are sorry!! your answer is incorrect.\n"+"you have won Rs,"+c1.getAmount());
		}
					}
				else {
			System.out.println("We are sorry!! ypur answer is incorrect.\n"+"you have won Rs,"+c1.getAmount());
		}
				}
			else {
			System.out.println("We are sorry!! your answer is incorrect.\n"+"you have won Rs,"+c1.getAmount());
		}
			}
		else {
			System.out.println("We are sorry!! your answer is incorrect.\n"+"you have won Rs,"+c1.getAmount());
		}
		}
	 else {
		 System.out.println("Thank you for coming.All The Best");
	 }
	// }
	}
 }



