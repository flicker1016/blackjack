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
		 */
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> card = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(card::add);		
		Collections.shuffle(card);
		System.out.println(card);
		
		// 여태까지 뽑은 카드를 더하고 그 합이 21미만일때까지 뽑는다/ 21 블랙잭, 21 초과 버스트 
		// 카드를 한장씩 딜러 한장, 플레이어 한장씩 나눠주고, 각각 합을 구해야함
		// Iterator, while, for, if ?????
		// Iterator 아직 잘 모르는듯? 
		
		
		
		int dealer;
		int player;
		
		/*
		while (condition) {
			
		}
		
		for (Iterator iterator = card.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			
		}
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		for (Integer integer : card) {
			
		}
		
		if (condition) {
			
		} else {

		}
		break;
		continue;
		*/
		
		
		
		
	} // main

} // class
