package com.bldea.crorepathiapp.package1;

public class Candidates {
		 private String name;
		 private int age;
		 private String city;
		 private String state;
		 private static int amount;
		
		/**
		 * @param name
		 * @param age
		 * @param occupation
		 * @param city
		 * @param state
		 */
		public Candidates(String name, int age, String city, String state) {
			super();
			this.name = name;
			this.age = age;
			this.city = city;
			this.state = state;
		}

		/**
		 * @return the amount
		 */
		public int getAmount() {
			return amount;
		}

		/**
		 * @param amount the amount to set
		 */
		public static void setAmount(int amt) {
			amount = amt;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the age
		 */
		public int getAge() {
			return age;
		}

		/**
		 * @param age the age to set
		 */
		public void setAge(int age) {
			this.age = age;
		}

		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}

		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}

		/**
		 * @return the state
		 */
		public String getState() {
			return state;
		}

		/**
		 * @param state the state to set
		 */
		public void setState(String state) {
			this.state = state;
		}

	

}


