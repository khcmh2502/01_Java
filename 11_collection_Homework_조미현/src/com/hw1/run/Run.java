package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {
	public static void main(String[] args) {

		// Friend 객체만 넣을 수 있는 ArrayList 객체 생성

		List<Friend> friends = new ArrayList<Friend>();

		friends.add(new Friend("짱구"));
		friends.add(new Friend("철수"));
		friends.add(new Friend("유리"));
		friends.add(new Friend("훈이"));
		friends.add(new Friend("맹구"));

		// Collections.addAll();
		/*
		 * Collections.addAll(friends, new Friend("짱구"), new Friend("철수"), new
		 * Friend("유리") , new Friend("훈이"), new Friend("맹구"));
		 */

		// List.of() : Java 9 이상의 버전에서 사용 가능
		/*
		 * List<Friend> friends = List.of(new Friend("짱구"), new Friend("철수"), new
		 * Friend("유리") , new Friend("훈이"), new Friend("맹구"));
		 */

		// 랜덤으로 골목대장 뽑기
		// note ! Random random = new Random();

		int randomIndex = (int) (Math.random() * friends.size());

		Friend leader = friends.get(randomIndex);

		leader.pickLeader();
	}
}
