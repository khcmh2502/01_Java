package edu.kh.oop.practice.model.vo;

public class Hero {
	
	// 속성
	// 필드 == 멤버 변수
	private String nickName; // 닉네임
	private String job; 	//직업
	private int hp; 		// 체력
	private int mp; 		// 마력
	private int level; 		// 레벨
	private double exp; 	// 경험치
	
	// 기본생성자
	public Hero() {}

	// 매개변수생성자
	public Hero(String nickName, String job, int hp, int mp, int level, double exp) {
		this.nickName = nickName;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
		
		System.out.printf(
				"=============캐릭터 생성=============\n"
				+ "%s 직업으로 '%s' 님이 생성되었습니다.\n"
				+ "현재 레벨 : %d\n"
				+ "현재 hp : %d\n"
				+ "현재 mp : %d\n"
				+ "현재 경험치 : %.1f\n",
				job, nickName, level, hp, mp, exp );
		
	}

	// 기능
	
	// getter/setter
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}
	
	/*
	 * 전달받은 경험치를 현재 경험치에 누적하고, 
	 * 공격했다는 메세지 출력.
		(단, 현재 경험치가 300 이상이면
		현재 레벨을 1 증가시키고,
		레벨이 올랐다는 메세지 출력)
	 * */
	public void attack(double exp) {
		this.exp += exp;
		
		System.out.printf("'%s' 은/는 공격을 했다!!! 현재 경험치 : %.1f\n",
					nickName, this.exp );
		
		if(this.exp >= 300) {
			level += 1;
			System.out.println("레벨이 올랐습니다!! 현재레벨 : " + level);
		}
		
	}
	
	/*
	 * 대시 할 때 마다 현재 mp에서 -10씩 감소되며 
	 * 대시했다는 메세지 출력.
		(단, 현재 mp가 0 이하라면
		마력이 부족하여 대시할 수 없다는 메세지 출력)
	 * */
	public void dash() {
		
		if(mp <= 0) {
			System.out.println("[마력 부족]더 이상 대시 할 수 없어요~!");
		} else {
			mp -= 10; // mp = mp - 10;
			System.out.printf("'%s'의 엄청 빠른 대시!!! 남은 마력 : %d\n",
							nickName, mp );
		}
		
	}

	/*
	 * 호출 시 해당 메서드를 호출한 객체의 현재 정보를 출력
	 * */
	@Override
	public String toString() {
		return "========'%s'님의 정보========\n"
				+ "- 현재 레벨 : %d\n"
				+ "- 현재 hp : %d\n"
				+ "- 현재 mp : %d\n"
				+ "- 현재 exp : %.1f\n";
	}
	
	
	
	
	
	
	
	
	
	
	
}
