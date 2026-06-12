package blackjack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class V01 {

	public static void main(String[] args) {

		/*
		 * 1. 카드 랜덤 생성
		 * 2. 딜러, 플레이어
		 * 3. Scanner 입력 : y/n
		 * 4. 출력 : 플레이 여부, 현재까지의 카드 숫자의 합, 계속 플레이 여부, 게임 승패
		 * 5. 21이 될 때까지 뽑고, 21이 되면 블랙잭, 21 초과하면 버스트로 게임 종료
		 *  
		 */

		Scanner sc = new Scanner(System.in);

		List<Integer> card = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(card::add);		
		Collections.shuffle(card);
		System.out.println(card);

		// 여태까지 뽑은 카드를 더하고 그 합이 21미만일때까지 뽑는다/ 21 블랙잭, 21 초과 버스트 
		// 카드를 한장씩 딜러 한장, 플레이어 한장씩 나눠주고, 각각 합을 구해야함

		int dealer = 0;
		int player = 0;

		int index = 0;
		int sum = 0;

//		dealer += card.get(index++);
//		dealer += card.get(index++);
//		player += card.get(index++);
//		player += card.get(index++);
//		
		
//		while (dealer <= 16) {
//			System.out.println("딜러의 카드 합이 16 이하입니다. 카드를 한 장 뽑습니다.");
//			dealer += card.get(index++);
//		}
		
		if (dealer == 21) {
			System.out.println("딜러 블랙잭!");
		}	else if (dealer > 21) {
			System.out.println("딜러 버스트");
		} else  {
			System.out.println("딜러 최종 합 :  " + dealer);
		}
		
		System.out.println(dealer);
		System.out.println(player);




	} // main

} // class
