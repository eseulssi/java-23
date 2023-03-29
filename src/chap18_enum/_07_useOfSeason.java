package chap18_enum;

import chap18_enum.enums.Season;

public class _07_useOfSeason {
	public static void main(String[] args) {
		
		Season[] seasonArr = Season.values();
		
				
				for(Season s : seasonArr) {
					s.printseasonMonth();
				}
	}

}
