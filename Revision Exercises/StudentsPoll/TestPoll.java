import java.util.Arrays;

public class TestPoll {
	static int[] sum = new int[10];

	public static void find(int[] poll) {
		for (int i = 0; i < poll.length; i++) {
			sum[poll[i] - 1]++;
		}
		for (int i = 0; i < sum.length; i++) {
			System.out.println(i + 1 + "\t" + sum[i]);
		}
	}

	public static void main(String[] args) {
		int[] poll = { 1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6, 10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6,
				7, 5, 6, 8, 4, 6, 8, 10 };
		System.out.println("Rating Frequency");
		find(poll);
	}
}
