package com.catena;

import java.util.Arrays;
import java.util.List;

public class CatenaEntry {

	public static void main(String[] args) {

		List<String> allEmails = Arrays.asList("jaypal.sodha@tcs.com", "jaypal.sodha@gmail.com",
				"jaypal.sodha@yahoo.com", "jaypal.sodha111@tcs.com");
		List<String> friendList = Arrays.asList("abc@tcs.com", "jaypal.sodha@tcs.com", "jaypal.sodha@gmail.com",
				"jaypal.sodha111@tcs.com");
		System.out.println(findNumberOfEmailsFromMyFriend(friendList, allEmails));
	}

	public static int findNumberOfEmailsFromMyFriend(List<String> friendList, List<String> allEmails) {
		int count = 0;
		for (String eachEmail : allEmails) {
			if (friendList.contains(eachEmail)) {
				count++;
			}
		}
		return count;
	}
}
