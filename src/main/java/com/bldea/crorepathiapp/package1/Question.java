package com.bldea.crorepathiapp.package1;

import java.util.Scanner;

public class Question {
	static String result;
	static String result2;
	static String result4;
	static int count_life_line=3;
	static int aud_phn=1;
	static int cnt_50_50 = 1;
	static int skip_cnt=1;
	static Scanner sc = new Scanner(System.in);
	//Question 1
	public static boolean fetchQuestion1(String name) {
		System.out.println("1.Who is the founder of Java?");
		System.out.println("a)Dennies Ritchie\n"+"b)Charles Babbage\n"+"c)Rahul Gandhi\n"+"d)James Gosling\n"+"e)Life Line");
		result = sc.next();
		//1
		if (result.equalsIgnoreCase("d")) {
			Candidates.setAmount(1000);
			return true;
		} 
		else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {//if audience poll is selected
					if (aud_phn != 0) {
						aud_phn = 0;
						//Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidates.setAmount(1000);
							return true;
						} else {
							return false;
						}
					} else {//if 50-50 is selected
						
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidates.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(1000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {//if skip is selected
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(1000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidates.setAmount(1000);
							return true;
						} else {
							return false;
						}

					} 
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								//Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidates.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(1000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(1000);
								return true;
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
									//	Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidates.setAmount(1000);
						return true;
					} 
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
							//	Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidates.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Dennis Ritchie\n" + "d)James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidates.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
									//	Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidates.setAmount(1000);
					return true;
				}
			}

		}
		return false;
	}
	//Question 2
		public static boolean fetchQuestion2(String name){  // throws Exception{
			System.out.println("2. Who is the captain of RCB?");
			System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n"+"e)Life Line");
			result = sc.next();
			if (result.equalsIgnoreCase("c")) {
				Candidates.setAmount(2000);
				return true;
			} else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							//Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidates.setAmount(2000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidates.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidates.setAmount(2000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidates.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidates.setAmount(2000);
									return true;
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidates.setAmount(2000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidates.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidates.setAmount(2000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									//Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidates.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidates.setAmount(2000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidates.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidates.setAmount(2000);
									return true;
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result4.equalsIgnoreCase("a")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											//Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidates.setAmount(2000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidates.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidates.setAmount(2000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
								    aud_phn = 0;
								//	Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidates.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidates.setAmount(2000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidates.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Virat\n"+"c) Faf duplesis\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidates.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result4.equalsIgnoreCase("a")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											//Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidates.setAmount(2000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidates.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidates.setAmount(2000);
						return true;
					}
				}

			}


			return false;
		}
	

	//Question 3
	public static boolean fetchQuestion3(String name) {
		System.out.println("1.Who is the Founder of Infosys?");
		System.out.println("a)Dr. Narayan Murty\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Anil Ambani\n"+"e)Life Line");
		result = sc.next();
		//1
		if (result.equalsIgnoreCase("a")) {
			Candidates.setAmount(4000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						//Thread.sleep(10000);
						System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidates.setAmount(4000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Dr. Narayan Murty\n"+"b)G R Gopinath\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidates.setAmount(4000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(4000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Dr. Narayan Murty\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Anil Ambani\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(2000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(2000);
								return true;
							}
							else {
								
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Dr. Narayan Murty\n"+"b)G R Gopinath\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(4000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Dr. Narayan Murty\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Anil Ambani\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(4000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)Dr. Narayan Murty\n"+"b)G R Gopinath\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidates.setAmount(4000);
							return true;
						} else {
							return false;
						}

					} else {
						
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
							    aud_phn = 0;
								//Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidates.setAmount(4000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(2000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Dr. Narayan Murty\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Anil Ambani\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(4000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(2000);
								return true;
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(4000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Dr. Narayan Murty\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Anil Ambani\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(4000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidates.setAmount(4000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
							//	Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidates.setAmount(4000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Dr. Narayan Murty\n"+"b)G R Gopinath\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(4000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Dr. Narayan Murty\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Anil Ambani\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(4000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Dr. Narayan Murty\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Anil Ambani\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidates.setAmount(4000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 7%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(4000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Dr. Narayan Murty\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Anil Ambani\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(4000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)Dr. Narayan Murty\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Anil Ambani\n");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					Candidates.setAmount(4000);
					return true;
				}
			}

		}


		return false;
	}

	// life line 1 complete
	//Question 4
	public static boolean fetchQuestion4(String name) {
		System.out.println("1.Who founded The Deccan Airways?");
		System.out.println("a)Vijay Malya\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Rahul Gandhi\n"+"e)Life line");
		result = sc.next();
		//1
		if (result.equalsIgnoreCase("b")) {
			Candidates.setAmount(8000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
					    aud_phn = 0;
						//Thread.sleep(10000);
						System.out.println("option a = 5%\n" + "option b = 88%\n" + "option c = 0%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidates.setAmount(8000);
							return true;
						} else {
							return false;
						}
					} else {
						
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Vijay Malya\n"+"b)G R Gopinath\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidates.setAmount(8000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(8000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Vijay Malya\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Rahul Gandhi\n"+"e)Life line");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidates.setAmount(8000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(8000);
								return true;
							}
							else {
								
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Vijay Malya\n"+"b)G R Gopinath\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidates.setAmount(8000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Vijay Malya\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Rahul Gandhi\n"+"e)Life line");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidates.setAmount(8000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)Vijay Malya\n"+"b)G R Gopinath\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidates.setAmount(8000);
							return true;
						} else {
							return false;
						}

					} else {
						
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
							    aud_phn = 0;
								//Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidates.setAmount(8000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(2000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Vijay Malya\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Rahul Gandhi\n"+"e)Life line");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidates.setAmount(8000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(8000);
								return true;
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidates.setAmount(8000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Vijay Malya\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Rahul Gandhi\n"+"e)Life line");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidates.setAmount(8000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidates.setAmount(2000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
							//	Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidates.setAmount(8000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Vijay Malya\n"+"b)G R Gopinath\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidates.setAmount(8000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Vijay Malya\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Rahul Gandhi\n"+"e)Life line");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidates.setAmount(8000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Vijay Malya\n"+"b)G R Gopinath\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidates.setAmount(8000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 88%\n" + "option c = 7%\n" + "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidates.setAmount(8000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Vijay Malya\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Rahul Gandhi\n"+"e)Life line");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidates.setAmount(8000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)Vijay Malya\n"+"b)G R Gopinath\n"+"c)Ratan Tata\n"+"d)Rahul Gandhi\n"+"e)Life line");
				result = sc.next();
				if (result.equalsIgnoreCase("b")) {
					Candidates.setAmount(8000);
					return true;
				}
			}

		}


		return false;
	}
	//Question 5
	public static boolean fetchQuestion5(String name) {
		System.out.println("1.Where did the World's Longest Railway Platform is Located?");
		System.out.println("a)China\n"+"b)America\n"+"c)Delhi\n"+"d)Hubballi\n"+"e)Life Line");
		result = sc.next();
		//1
		if (result.equalsIgnoreCase("a")) {
			Candidates.setAmount(10000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						//Thread.sleep(10000);
						System.out.println("option a = 7%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 88%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidates.setAmount(10000);
							return true;
						} else {
							return false;
						}
					} else {
						
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c)Delhi\n"+"d)Hubballi\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidates.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)China\n"+"b)America\n"+"c)Delhi\n"+"d)Hubballi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(2000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c)Delhi\n"+"d)Hubballi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)China\n"+"b)America\n"+"c)Delhi\n"+"d)Hubballi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("c)Delhi\n"+"d)Hubballi\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidates.setAmount(10000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								//Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 7%\n" + "option d = 88%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidates.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(2000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("c)Delhi\n"+"d)Hubballi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(2000);
								return true;
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 7%\n" + "option d =88%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)China\n"+"b)America\n"+"c)Delhi\n"+"d)Hubballi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidates.setAmount(2000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
							    aud_phn = 0;
							//	Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 7%\n" + "option d = 88%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidates.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c)Delhi\n"+"d)Hubballi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)China\n"+"b)America\n"+"c)Delhi\n"+"d)Hubballi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c)Delhi\n"+"d)Hubballi\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidates.setAmount(10000);
									return true;
								} else {
				
					return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 7%\n" + "option d = 88%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)China\n"+"b)America\n"+"c)Delhi\n"+"d)Hubballi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)China\n"+"b)America\n"+"c)Delhi\n"+"d)Hubballi\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidates.setAmount(10000);
					return true;
				}
			}

		}


		return false;
	}

	//Question 6
	public static boolean fetchQuestion6(String name) {
		System.out.println("1.Where is the Birth Place of Basavanna?");
		System.out.println("a)Bagewadi\n"+"b)Badami\n"+"c)Bangalore\n"+"d)Banaras\n"+"e)Life Line");
		result = sc.next();
		
				//1
		if (result.equalsIgnoreCase("a")) {
			Candidates.setAmount(20000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						//Thread.sleep(10000);
						System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidates.setAmount(20000);
							return true;
						} else {
							return false;
						}
					} else {
						
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Bagewadi\n"+"b)Badami\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidates.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(20000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Bagewadi\n"+"b)Badami\n"+"c)Bangalore\n"+"d)Banaras\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(20000);
								return true;
							}
							else {
								
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Bagewadi\n"+"b)Badami\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Bagewadi\n"+"b)Badami\n"+"c)Bangalore\n"+"d)Banaras\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)Bagewadi\n"+"b)Badami\n"+"c)Bangalore\n"+"d)Banaras\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidates.setAmount(20000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								//Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidates.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(20000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Bagewadi\n"+"b)Badami\n"+"c)Bangalore\n"+"d)Banaras\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(2000);
								return true;
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Bagewadi\n"+"b)Badami\n"+"c)Bangalore\n"+"d)Banaras\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidates.setAmount(2000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
							//	Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidates.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Bagewadi\n"+"b)Badami\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Bagewadi\n"+"b)Badami\n"+"c)Bangalore\n"+"d)Banaras\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Bagewadi\n"+"b)Badami\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidates.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 7%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Bagewadi\n"+"b)Badami\n"+"c)Bangalore\n"+"d)Banaras\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)Bagewadi\n"+"b)Badami\n"+"c)Bangalore\n"+"d)Banaras\n");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					Candidates.setAmount(20000);
					return true;
				}
			}

		}


		return false;
	}

	//Question 7
	public static boolean fetchQuestion7(String name) {
		System.out.println("1.Who is the captain of Indian cricket Team?");
		System.out.println("a)Virat Kohli\n"+"b)M S Dhoni\n"+"c)Rohit Sharma\n"+"d)K L Rahul\n");
		result = sc.next();
		// life line 1
				//1
		if (result.equalsIgnoreCase("c")) {
			Candidates.setAmount(30000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						//Thread.sleep(10000);
						System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidates.setAmount(30000);
							return true;
						} else {
							return false;
						}
					} else {
						
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c)Rohit Sharma\n"+"d)K L Rahul\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidates.setAmount(30000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(30000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Virat Kohli\n"+"b)M S Dhoni\n"+"c)Rohit Sharma\n"+"d)K L Rahul\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(2000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(30000);
								return true;
							}
							else {
								
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c)Rohit Sharma\n"+"d)K L Rahul\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(30000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Virat Kohli\n"+"b)M S Dhoni\n"+"c)Rohit Sharma\n"+"d)K L Rahul\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(30000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("c)Rohit Sharma\n"+"d)K L Rahul\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidates.setAmount(30000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								//Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidates.setAmount(30000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(30000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Virat Kohli\n"+"b)M S Dhoni\n"+"c)Rohit Sharma\n"+"d)K L Rahul\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(30000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(30000);
								return true;
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(30000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Virat Kohli\n"+"b)M S Dhoni\n"+"c)Rohit Sharma\n"+"d)K L Rahul\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(30000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidates.setAmount(2000);
						return true;
					} else {
						
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"+"b. 50-50 \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
							//	Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidates.setAmount(2000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c)Rohit Sharma\n"+"d)K L Rahul\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(30000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("c)Rohit Sharma\n"+"d)K L Rahul\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(30000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Virat Kohli\n"+"b)M S Dhoni\n"+"c)Rohit Sharma\n"+"d)K L Rahul\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidates.setAmount(30000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(30000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Virat Kohli\n"+"b)M S Dhoni\n"+"c)Rohit Sharma\n"+"d)K L Rahul\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(30000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)Virat Kohli\n"+"b)M S Dhoni\n"+"c)Rohit Sharma\n"+"d)K L Rahul\n");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidates.setAmount(30000);
					return true;
				}
			}

		}


		return false;
	}

	//Question 8
	public static boolean fetchQuestion8(String name) {
		System.out.println("1.B.C Roy Award is given in the feild of ?");
		System.out.println("a)Music\n"+"b)Journalism\n"+"c)Medician\n"+"d)Environment\n");
		result = sc.next();
		//1
		if (result.equalsIgnoreCase("c")) {
			Candidates.setAmount(50000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
					    aud_phn = 0;
						//Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c =88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidates.setAmount(50000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Music\n"+"b)Journalism\n"+"c)Medician\n"+"d)Environment\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidates.setAmount(2000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(50000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Music\n"+"b)Journalism\n"+"c)Medician\n"+"d)Environment\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(50000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Music\n"+"b)Journalism\n"+"c)Medician\n"+"d)Environment\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Music\n"+"b)Journalism\n"+"c)Medician\n"+"d)Environment\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)Music\n"+"b)Journalism\n"+"c)Medician\n"+"d)Environment\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidates.setAmount(50000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								//Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidates.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(50000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Music\n"+"b)Journalism\n"+"c)Medician\n"+"d)Environment\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(50000);
								return true;
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Music\n"+"b)Journalism\n"+"c)Medician\n"+"d)Environment\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidates.setAmount(2000);
						return true;
					} else {
						
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
							//	Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidates.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c)Medician\n"+"d)Environment\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Music\n"+"b)Journalism\n"+"c)Medician\n"+"d)Environment\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c)Medician\n"+"d)Environment\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidates.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Music\n"+"b)Journalism\n"+"c)Medician\n"+"d)Environment\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidates.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)Music\n"+"b)Journalism\n"+"c)Medician\n"+"d)Environment\n");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidates.setAmount(50000);
					return true;
				}
			}

		}


		return false;
	}
//Question 9
	public static boolean fetchQuestion9(String name) {
		System.out.println("1.Plant receive their nutrients main from?");
		System.out.println("a)chlorophyll\n"+"b)atmospere\n"+"c)light\n"+"d)soil\n");
		result = sc.next();
		
				//1
		if (result.equalsIgnoreCase("d")) {
			Candidates.setAmount(100000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						//Thread.sleep(10000);
						System.out.println("option a = 7%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 88%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidates.setAmount(100000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)chlorophyll\n"+"d)soil\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidates.setAmount(100000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(100000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)chlorophyll\n"+"b)atmospere\n"+"c)light\n"+"d)soil\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(100000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)chlorophyll\n"+"d)soil\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(100000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)chlorophyll\n"+"b)atmospere\n"+"c)light\n"+"d)soil\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)chlorophyll\n"+"d)soil\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidates.setAmount(100000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								//Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 7%\n" + "option d = 88%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidates.setAmount(100000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(100000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)chlorophyll\n"+"b)atmospere\n"+"c)light\n"+"d)soil\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(2000);
								return true;
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 7%\n" + "option d = 88%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(100000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)chlorophyll\n"+"b)atmospere\n"+"c)light\n"+"d)soil\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidates.setAmount(100000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
							//	Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 7%\n" + "option d = 88%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidates.setAmount(100000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)chlorophyll\n"+"d)soil\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(100000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)chlorophyll\n"+"b)atmospere\n"+"c)light\n"+"d)soil\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)chlorophyll\n"+"d)soil\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidates.setAmount(100000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 7%\n" + "option d = 88%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(100000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)chlorophyll\n"+"b)atmospere\n"+"c)light\n"+"d)soil\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)chlorophyll\n"+"b)atmospere\n"+"c)light\n"+"d)soil\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidates.setAmount(100000);
					return true;
				}
			}

		}


		return false;
	}

	//Question 10
	public static boolean fetchQuestion10(String name) {
		System.out.println("1.Garampani sanctury is located at ?");
		System.out.println("a)Assam\n"+"b)Sikkim\n"+"c)Nagaland\n"+"d)Gujarat\n");
		result = sc.next();
		//1
		if (result.equalsIgnoreCase("a")) {
			Candidates.setAmount(1000000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						//Thread.sleep(10000);
						System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidates.setAmount(1000000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Assam\n"+"b)Sikkim\n"+"c)Nagaland\n"+"d)Gujarat\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidates.setAmount(1000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(1000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Assam\n"+"b)Sikkim\n"+"c)Nagaland\n"+"d)Gujarat\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(1000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Assam\n"+"d)Gujarat\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(1000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Assam\n"+"b)Sikkim\n"+"c)Nagaland\n"+"d)Gujarat\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)Assam\n"+"b)Sikkim\n"+"c)Nagaland\n"+"d)Gujarat\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidates.setAmount(1000000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
							//	aud_phn = 0;
								//Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidates.setAmount(1000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidates.setAmount(1000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Assam\n"+"b)Sikkim\n"+"c)Nagaland\n"+"d)Gujarat\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidates.setAmount(2000);
								return true;
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(1000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Assam\n"+"b)Sikkim\n"+"c)Nagaland\n"+"d)Gujarat\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidates.setAmount(1000000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
							//	Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidates.setAmount(1000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)Assam\n"+"d)Gujarat\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(1000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Assam\n"+"b)Sikkim\n"+"c)Nagaland\n"+"d)Gujarat\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Assam\n"+"d)Gujarat\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidates.setAmount(1000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										//Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 7%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidates.setAmount(1000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Assam\n"+"b)Sikkim\n"+"c)Nagaland\n"+"d)Gujarat\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidates.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)Assam\n"+"b)Sikkim\n"+"c)Nagaland\n"+"d)Gujarat\n");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					Candidates.setAmount(1000000);
					return true;
				}
			}

		}


		return false;
	}

	
}		// life line 1 complete
