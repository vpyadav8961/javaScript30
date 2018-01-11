//This problem is of SNAPWIZ EDU *****//
//lINK ::https://hire.glider.ai/assignment/4bugmcgB7sjy6Y6A4/210536/k2qtBuWhxN8LWHhiA

/*
Key 1:  Prints 'A' on screen
Key 2: (Ctrl-A): Select screen
Key 3: (Ctrl-C): Copy selection to buffer
Key 4: (Ctrl-V): Print buffer on screen appending it
                 after what has already been prIf you can only press the keyboard for N times (with the above four
keys), write a program to produce maximum numbers of A's. That is to
say, the input parameter is N (No. of keys that you can press), the 
output is M (No. of As that you can prod


PROBLEM :

Given a Binary Search Tree (BST) and a range, count the number of nodes in the BST that lie in the given range. You are required to complete the function getCountOfNode. You should not read any input from stdin/console. There are multiple test cases. For each test case, this method will be called individually.


Input (only to be used for Expected Output):
The first line of the input contains an integer 'T' denoting the nummber of test cases. Then 'T' test cases follow. Each test case consists of three lines. Description of  test cases is as follows:
The First line of each test case contains an integer 'N' which denotes the no of nodes in the BST.   .
The Second line of each test case contains 'N' space separated values of the nodes in the BST.
The Third line of each test case contains two space separated integers 'l' and 'h' denoting the range, where l < h

Output:
You are required to complete the function getCountOfNode which takes three arguments. The first being the root of the tree, and then two integers l and h, denoting the range. The function returns an integer denoting the no of nodes in the given range.

Constraints:
1 <= T <= 50
1 <= N <= 50
1 <= l < h < 1000

Example:
Input
1
6
10 5 50 1 40 100
5 45

Output
3

PROBLEM :

Given a Binary Search Tree (BST) and a range, count the number of nodes in the BST that lie in the given range. You are required to complete the function getCountOfNode. You should not read any input from stdin/console. There are multiple test cases. For each test case, this method will be called individually.


Input (only to be used for Expected Output):
The first line of the input contains an integer 'T' denoting the nummber of test cases. Then 'T' test cases follow. Each test case consists of three lines. Description of  test cases is as follows:
The First line of each test case contains an integer 'N' which denotes the no of nodes in the BST.   .
The Second line of each test case contains 'N' space separated values of the nodes in the BST.
The Third line of each test case contains two space separated integers 'l' and 'h' denoting the range, where l < h

Output:
You are required to complete the function getCountOfNode which takes three arguments. The first being the root of the tree, and then two integers l and h, denoting the range. The function returns an integer denoting the no of nodes in the given range.

Constraints:
1 <= T <= 50
1 <= N <= 50
1 <= l < h < 1000

Example:
Input
1
6
10 5 50 1 40 100
5 45

Output
3

*/
import java.util.Scanner;
class MaxBPrint{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(findNumber(N));
	}

	static int findNumber(int N){
		//int max = 0;
		if(N <= 6)
			return N;

/*		for(int i = N - 3;i>=1;i--){
			int curr = (N - i - 1) * findNumber(i);
			if(curr>max)
				max = curr;
		}
		return max;*/
		int[] arr = new int[N];
		int i;
		int j;
		for(i = 1;i<=N;i++){
			arr[i-1] = i;
			for(j = i - 3;j>=1;j--){
				int curr = (i - j - 1) * arr[j-1];
				if(curr > arr[i-1])
					arr[i -1] = curr;
			}
		}
		return arr[N - 1];
	}
}