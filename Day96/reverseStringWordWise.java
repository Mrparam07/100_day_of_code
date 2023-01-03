/*
Reverse String Wordwise
Send Feedback
Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always
*/

public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
		String str=input;
		int n = str.length();
		StringBuffer ans = new StringBuffer("");
		int i = 0;

		while (i < n) {
			int j = i;

			// Skip multiple spaces
			while (j < n && str.charAt(j) == ' ') {
				j++;
			}

			StringBuffer currentWord = new StringBuffer("");

			// Get the current word
			while (j < n && str.charAt(j) != ' ') {
				currentWord.append(str.charAt(j));
				j++;
			}

			// add current word in the ans with a space
			if (currentWord.length() != 0) {
				ans.insert(0, currentWord + " ");
			}

			i = j + 1;
		}

		if (ans.length() == 0) {
			return ans.toString();
		}

		// remove the last space
		return ans.substring(0, ans.length() - 1).toString();

	}
}
