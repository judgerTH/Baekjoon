package step6;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int[] count = new int[26];

        // 입력받은 str에서 해당 알파벳에 해당하는 배열 index에 ++
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) -'A' ;
            count[num]++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < count.length; i++) {
            if(max < count[i]){
                max = count[i];
                answer = (char)(i+'A');
            } else if (max == count[i]){
                answer = '?';
            }
        }
        System.out.println(answer);
	}
}
