import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.lang.reflect.*;

public class Main {
	static Story s;
	static Scanner in;
	static Character p;
	static Random rnd;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//MAIN PROGRAM
		//Create a Character
		Main m=new Main();
		p=new Character();
		//Create a Story class. Read in the story and save it.
		s=new Story();
		in=new Scanner(System.in);
		//Start in Chapter 1
		int nextChap=0;
		do {
			
			Method x=m.getClass().getMethod("c"+nextChap);
			nextChap=(int)x.invoke(m);
		}while (nextChap<401);
	}
	
	
	public int input() {
		String x=in.nextLine().toLowerCase();
		if (x.startsWith("inv")) {
			p.inventory();
			return 0;
		}else if (x.equals("provisions")) {
			p.provision();
			return 0;
		}else if (x.contains("strength")) {
			p.potionStamina();
			return 0;
		}else if (x.contains("skill")) {
			p.potionSkill();
			return 0;
		}else if (x.contains("fortune")) {
			p.potionFortune();
			return 0;
		}else if (x.equals("")) {
			return 0;
		}
		else {
			try {
				return (Integer.parseInt(x));
			}catch (NumberFormatException e) {
				return 0;
			}
		}
	}
	
	public int c0(){
		s.printText(0);
		//Go to chapter 1
		int nextChap=1;
		in.nextLine();
		return nextChap;
	}

	public int c1(){
		s.printText(1);
		int nextChap=this.input();
		switch (nextChap) {
		case 1:
			nextChap=270;
			break;
		case 2:
			nextChap=66;
			break;
		default:
			nextChap=1;
			break;
		}
		
		return nextChap;
	}

	public int c2(){
		s.printText(2);
		int nextChap=500;
		return nextChap;
	}

	public int c3(){
		s.printText(3);
		int nextChap=500;
		return nextChap;
	}

	public int c4(){
		s.printText(4);
		int nextChap=500;
		return nextChap;
	}

	public int c5(){
		s.printText(5);
		int nextChap=0;
		input();
		if (p.tryLuck()) {
			nextChap=185;
		}else {
			nextChap=395;
		}
		return nextChap;
	}

	public int c6(){
		s.printText(6);
		int nextChap=0;
		if (p.battle(11, 11, "Manticore")) {
			nextChap=364;
		}else {
			System.out.println("You have died");
			nextChap=500;
		}
		return nextChap;
	}

	public int c7(){
		s.printText(7);
		int nextChap=500;
		return nextChap;
	}

	public int c8(){
		s.printText(8);
		int nextChap=500;
		return nextChap;
	}

	public int c9(){
		s.printText(9);
		int nextChap=0;
		int x=input();
		switch (x) {
		case 1:
			nextChap=158;
			break;
		case 2:
			nextChap=375;
			break;
		default:
			nextChap=9;
		}
		return nextChap;
	}

	public int c10(){
		s.printText(10);
		int nextChap=0;
		input();
		p.setProvisions(0);
		if (p.isIronKey()) {
			nextChap=86;
		}else {
			nextChap=276;
		}
		
		return nextChap;
	}

	public int c11(){
		s.printText(11);
		int nextChap=0;
		p.setEmerald(true);
		int x=input();
		switch (x) {
		case 1:
			nextChap=140;
			break;
		case 2:
			nextChap=46;
			break;
		default:
			nextChap=11;
		}
		return nextChap;
	}

	public int c12(){
		s.printText(12);
		int nextChap=0;
		int x=input();
		switch (x) {
		case 1:
			nextChap=382;
			break;
		case 2:
			nextChap=195;
			break;
		case 3:
			nextChap=250;
			break;
		default:
			nextChap=12;
			break;
		}
		return nextChap;
	}

	public int c13(){
		s.printText(13);
		int nextChap=0;
		int x=input();
		switch (x) {
		case 1:
			nextChap=147;
			break;
		case 2:
			nextChap=182;
			break;
		default:
			nextChap=13;
		}
		return nextChap;
	}

	public int c14(){
		s.printText(14);
		int nextChap=0;
		int x=input();
		switch (x) {
		case 1:
			nextChap=157;
			break;
		case 2:
			nextChap=310;
			break;
		default:
			nextChap=14;
		}
		return nextChap;
	}

	public int c15(){
		s.printText(15);
		int nextChap=74;
		input();
		return nextChap;
	}

	public int c16(){
		s.printText(16);
		int nextChap=0;
		int die=p.roll1Die()+1;
		p.setStamina(p.getStamina()-die);
		System.out.println("You lost "+die+" stamina.");
		if (p.getStamina()<=0) {
			System.out.println("You are dead");
			nextChap=500;
		}else {
			int x=input();
			switch (x) {
			case 1:
				nextChap=16;
				break;
			case 2:
				nextChap=392;
				break;
			case 3:
				nextChap=177;
				break;
			case 4:
				nextChap=287;
				break;
			case 5:
				nextChap=132;
				break;
			case 6:
				nextChap=249;
				break;
			default:
				nextChap=16;
			}
		}
		return nextChap;
	}

	public int c17(){
		s.printText(17);
		int nextChap=500;
		return nextChap;
	}

	public int c18(){
		s.printText(18);
		int nextChap=0;
		int die=p.roll2Dice();
		System.out.println("You rolled "+die+" and your skill is "+p.getSkill());
		if (die<=p.getSkill()) {
			nextChap=55;
		}else {
			nextChap=202;
		}
		input();
		return nextChap;
	}

	public int c19(){
		s.printText(19);
		int nextChap=500;
		return nextChap;
	}

	public int c20(){
		s.printText(20);
		int nextChap=279;
		p.setSkill(p.getSkill()-1);
		p.setGold(p.getGold()+1);
		input();
		return nextChap;
	}

	public int c21(){
		s.printText(21);
		int nextChap=0;
		if (p.singleAttackRound(12, 8, "Bloodbeast")) {
			if (p.tryLuck()) {
				nextChap=97;
			}else {
				nextChap=279;
			}
		}else {
			nextChap=500;
		}
		return nextChap;
	}

	public int c22(){
		s.printText(22);
		int nextChap=0;
		int x=input();
		switch (x) {
		case 1:
			nextChap=63;
			break;
		case 2:
			nextChap=184;
			break;
		case 3:
			nextChap=311;
			break;
		default:
			nextChap=22;
		}
		
		return nextChap;
	}

	public int c23(){
		s.printText(23);
		int nextChap=154;
		input();
		return nextChap;
	}

	public int c24(){
		s.printText(24);
		int nextChap=0;
		int x=input();
		switch (x) {
		case 1:
			nextChap=324;
			break;
		case 2:
			nextChap=188;
			break;
		default:
			nextChap=24;
		}

		return nextChap;
	}

	public int c25(){
		s.printText(25);
		int nextChap=197;
		input();
		return nextChap;
	}

	public int c26(){
		s.printText(26);
		int nextChap=0;
		int dice=p.roll2Dice();
		System.out.println("You rolled "+dice+" and your skill is "+p.getSkill());
		if (dice<=p.getSkill()) {
			nextChap=55;
		}else {
			nextChap=202;
		}
		input();
		return nextChap;
	}

	public int c27(){
		s.printText(27);
		int nextChap=78;
		p.setCrippledServantTalk(true);
		input();
		return nextChap;
	}

	public int c28(){
		s.printText(28);
		int nextChap=213;
		p.setDwarfChainmail(true);
		p.setSkill(p.getSkill()+1);
		input();
		return nextChap;
	}

	public int c29(){
		s.printText(29);
		int nextChap=90;
		input();
		return nextChap;
	}

	public int c30(){
		s.printText(30);
		int nextChap=0;
		if (p.tryLuck()) {
			nextChap=160;
		}else {
			nextChap=319;
		}
		input();
		return nextChap;
	}

	public int c31(){
		s.printText(31);
		int nextChap=0;
		if (p.isSapphire()) {
			nextChap=376;
		}else {
			nextChap=3;
		}
		input();
		return nextChap;
	}

	public int c32(){
		s.printText(32);
		int nextChap=37;
		input();
		return nextChap;
	}

	public int c33(){
		s.printText(33);
		int nextChap=292;
		p.setBrassBell(true);
		p.setGrapplingIron(true);
		p.setSkill(p.getSkill()-3);
		input();
		return nextChap;
	}

	public int c34(){
		s.printText(34);
		int nextChap=500;
		return nextChap;
	}

	public int c35(){
		s.printText(35);
		int nextChap=0;
		int x=input();
		switch (x) {
		case 1:
			nextChap=333;
			break;
		case 2:
			nextChap=124;
			break;
		default:
			nextChap=35;
		}

		return nextChap;
	}

	public int c36(){
		s.printText(36);
		int nextChap=0;
		int dice=p.roll2Dice();
		System.out.println("You rolled "+dice+". Your skill is "+p.getSkill()+" and your stamina is "+p.getStamina());
		if (dice<=p.getSkill() && dice<=p.getStamina()) {
			nextChap=340;
		}else {
			nextChap=7;
		}
		input();
		return nextChap;
	}

	public int c37(){
		s.printText(37);
		int nextChap=0;
		int x=input();
		switch (x) {
		case 1:
			nextChap=351;
			break;
		case 2:
			nextChap=239;
			break;
		default:
			nextChap=37;
		}
		
		return nextChap;
	}

	public int c38(){
		s.printText(38);
		int nextChap=109;
		input();
		p.setStamina(p.getStamina()-3);
		if (p.getStamina()<=0) {
			System.out.println("You're dead");
			nextChap=500;
		}
		return nextChap;
	}

	public int c39(){
		s.printText(39);
		int nextChap=0;
		int result=p.battleWithEscape(7, 8, "Giant Fly");
		if (result>0) {
			nextChap=111;
		}else if (result<0) {
			nextChap=267;
		}else {
			System.out.println("You are dead");
			nextChap=500;
		}
		return nextChap;
	}

	public int c40(){
		s.printText(40);
		int nextChap=0;
		if (p.battle(9, 9, "Minotaur")) {
			nextChap=163;
		}else {
			nextChap=500;
			System.out.println("You are dead");
		}
		return nextChap;
	}

	public int c41(){
		s.printText(41);
		int nextChap=0;
		int x=input();
		p.setSearchAlcove(true);
		switch (x) {
		case 1:
			nextChap=98;
			break;
		case 2:
			if (p.isSearchBarbarian()) {
				System.out.println("You've already searched the Barbarian.");
				nextChap=41;
			}else {
				nextChap=126;
			}
			break;
		case 3:
			nextChap=83;
			break;
		default:
			nextChap=41;
		}
		return nextChap;
	}

	public int c42(){
		s.printText(42);
		int nextChap=0;
		p.setStamina(p.getStamina()-5);
		if (p.getStamina()<=0) {
			System.out.println("You're dead");
			nextChap=500;
		}else {
			int dice=p.roll2Dice();
			System.out.println("You rolled "+dice+" and your skill is "+p.getSkill());
			if (dice<=p.getSkill()) {
				nextChap=55;
			}else {
				nextChap=202;
			}
		}
		input();
		return nextChap;
	}

	public int c43(){
		s.printText(43);
		int nextChap=0;
		int x=input();
		switch (x) {
		case 1:
			nextChap=200;
			break;
		case 2:
			nextChap=316;
			break;
		default:
			nextChap=43;
		}
		return nextChap;
	}

	public int c44(){
		s.printText(44);
		int nextChap=500;
		return nextChap;
	}

	public int c45(){
		s.printText(45);
		int nextChap=0;
		p.setSkill(p.getSkill()-1);
		p.setStamina(p.getStamina()-4);
		if (p.getStamina()<=0) {
			System.out.println("You're dead");
			nextChap=500;
		}else {
			nextChap=312;
		}
		input();
		return nextChap;
	}

	public int c46(){
		s.printText(46);
		int nextChap=239;
		input();
		return nextChap;
	}

	public int c47(){
		s.printText(47);
		int nextChap=0;
		if (p.isHollowWoodenTube()) {
			nextChap=10;
		}else {
			nextChap=335;
		}
		input();
		return nextChap;
	}

	public int c48(){
		s.printText(48);
		int nextChap=197;
		input();
		return nextChap;
	}

	public int c49(){
		s.printText(49);
		int nextChap=0;
		int x=input();
		switch(x) {
		case 1:
			nextChap=205;
			break;
		case 2:
			nextChap=241;
			break;
		default:
			nextChap=49;
			break;
		}
		return nextChap;
	}

	public int c50(){
		s.printText(50);
		int nextChap=221;
		input();
		return nextChap;
	}

	public int c51(){
		s.printText(51);
		int nextChap=0;
		if (p.battle(6, 5, "Hobgoblin")) {
			nextChap=9;
		}else {
			System.out.println("You're dead");
			nextChap=500;
		}
		return nextChap;
	}

	public int c52(){
		s.printText(52);
		int nextChap=0;
		p.setBloodbeastDescription(true);
		p.setOpenRedBook(true);
		int x=input();
		switch(x) {
		case 1:
			if (p.isOpenBlackBook()) {
				System.out.println("You've already opened the black book");
				nextChap=369;
			}else {
				nextChap=138;
			}
			break;
		case 2:
			nextChap=369;
			break;
		default:
			nextChap=52;
			break;
		}
		return nextChap;
	}

	public int c53(){
		s.printText(53);
		int nextChap=0;
		int x=input();
		switch(x) {
		case 1:
			nextChap=370;
			break;
		case 2:
			nextChap=348;
			break;
		default:
			nextChap=53;
			break;
		}
		return nextChap;
	}

	public int c54(){
		s.printText(54);
		int nextChap=239;
		input();
		return nextChap;
	}

	public int c55(){
		s.printText(55);
		int nextChap=0;
		String answer=in.nextLine().toLowerCase();
		if (answer.equals("scorpion")) {
			nextChap=143;
		}else if (answer.equals("manticore")) {
			nextChap=40;
		}else if (answer.equals("no")) {
			nextChap=347;
		}else if (answer.startsWith("inv")) {
			p.inventory();
			nextChap=55;
		}else if (answer.equals("provisions")) {
			p.provision();
			nextChap=55;
		}else if (answer.contains("strength")) {
			p.potionStamina();
			nextChap=55;
		}else if (answer.contains("skill")) {
			p.potionSkill();
			nextChap=55;
		}else if (answer.contains("fortune")) {
			p.potionFortune();
			nextChap=55;
		}else if (answer.equals("")) {
			nextChap=55;
		
		}
		return nextChap;
	}

	public int c56(){
		s.printText(56);
		int nextChap=0;
		int x=input();
		switch(x) {
			case 1:
				nextChap=373;
				break;
			case 2:
				nextChap=215;
				break;
			default:
				nextChap=56;
				break;
		}
		return nextChap;
	}

	public int c57(){
		s.printText(57);
		int nextChap=0;
		p.setStamina(p.getStamina()-4);
		if (p.getStamina()<=0) {
			System.out.println("You're dead");
			nextChap=500;
		}else {
			nextChap=198;
		}
		return nextChap;
	}

	public int c58(){
		s.printText(58);
		int nextChap=0;
		int dice=p.roll2Dice();
		System.out.println("You rolled "+dice+" and your skill is "+p.getSkill());
		if(dice<=p.getSkill()) {
			nextChap=80;
		}else {
			nextChap=246;
		}
		input();
		return nextChap;
	}

	public int c59(){
		s.printText(59);
		int nextChap=0;
		int x=input();
		switch(x) {
		case 1:
			nextChap=341;
			break;
		case 2:
			nextChap=283;
			break;
		default:
			nextChap=59;
			break;
		}
		return nextChap;
	}

	public int c60(){
		s.printText(60);
		int nextChap=0;
		int x=input();
		switch (x) {
		case 1:
			nextChap=179;
			break;
		case 2:
			nextChap=365;
			break;
		default:
			nextChap=60;
			break;
		}
		return nextChap;
	}

	public int c61(){
		s.printText(61);
		int nextChap=500;
		return nextChap;
	}

	public int c62(){
		s.printText(62);
		int nextChap=0;
		int x=input();
		switch (x) {
		case 1:
			nextChap=16;
			break;
		case 2:
			nextChap=392;
			break;
		case 3:
			nextChap=177;
			break;
		case 4:
			nextChap=287;
			break;
		case 5:
			nextChap=132;
			break;
		case 6:
			nextChap=249;
			break;
		default:
			nextChap=62;
			break;
		}
		return nextChap;
	}

	public int c63(){
		s.printText(63);
		int nextChap=194;
		input();
		return nextChap;
	}

	public int c64(){
		s.printText(64);
		int nextChap=0;
		p.setBoneRing(true);
		int dice=p.roll2Dice();
		System.out.println("You rolled "+dice+" and your skill is "+p.getSkill());
		if (dice<=p.getSkill()) {
			nextChap=115;
		}else {
			nextChap=190;
		}
		input();
		return nextChap;
	}

	public int c65(){
		s.printText(65);
		int nextChap=0;
		if (p.isTrapDetectionPotion()) {
			nextChap=345;
		}else {
			nextChap=372;
		}
		input();
		return nextChap;
	}

	public int c66(){
		s.printText(66);
		int nextChap=0;
		int x=input();
		switch(x) {
		case 1:
			nextChap=293;
			break;
		case 2:
			nextChap=119;
			break;
		default:
			nextChap=66;
			break;
		}
		return nextChap;
	}

	public int c67(){
		s.printText(67);
		int nextChap=0;
		if (p.tryLuck()) {
			nextChap=146;
		}else {
			nextChap=219;
		}
		input();
		return nextChap;
	}

	public int c68(){
		s.printText(68);
		int nextChap=0;
		int x=input();
		switch(x) {
		case 1:
			nextChap=271;
			break;
		case 2:
			nextChap=30;
			break;
		case 3:
			nextChap=212;
			break;
		default:
			nextChap=68;
			break;
		}
		return nextChap;
	}

	public int c69(){
		s.printText(69);
		int nextChap=305;
		input();
		return nextChap;
	}

	public int c70(){
		s.printText(70);
		int nextChap=500;
		return nextChap;
	}

	public int c71(){
		s.printText(71);
		int nextChap=128;
		p.setSkeletonWarriorParchmentPoem(true);
		input();
		return nextChap;
	}

	public int c72(){
		s.printText(72);
		int nextChap=122;
		p.setSkill(p.getSkill()-2);
		input();
		return nextChap;
	}

	public int c73(){
		s.printText(73);
		int nextChap=0;
		int x=input();
		switch(x) {
		case 1:
			if (p.isSearchBarbarian()) {
				System.out.println("You've already searched the Barbarian");
				nextChap=83;
			}else {
				nextChap=126;
			}
			break;
		case 2:
			nextChap=83;
			break;
		default:
			nextChap=73;
			break;
		}
		return nextChap;
	}

	public int c74(){
		s.printText(74);
		int nextChap=0;
		int x=input();
		switch(x) {
		case 1:
			if (p.isGoldRing()) {
				nextChap=265;
			}else {
				System.out.println("You don't have the Gold Ring of Wishes!");
				nextChap=74;
			}
			break;
		case 2:
			nextChap=300;
			break;
		case 3:
			nextChap=327;
			break;
		default:
			nextChap=74;
			break;
		}
		return nextChap;
	}

	public int c75(){
		s.printText(75);
		int nextChap=0;
		int x=input();
		p.setLiquidInWounds(true);
		switch(x) {
		case 1:
			if (p.isOpenRedBook()) {
				System.out.println("You've already opened the red book!");
				nextChap=369;
			}else {
				nextChap=52;
			}
			break;
		case 2:
			nextChap=52;
			break;
		default:
			nextChap=75;
		}
		return nextChap;
	}

	public int c76(){
		s.printText(76);
		int nextChap=0;
		int x=input();
		switch(x) {
		case 1:
			nextChap=317;
			break;
		case 2:
			nextChap=117;
			break;
		default:
			nextChap=76;
			break;
		}
		return nextChap;
	}

	public int c77(){
		s.printText(77);
		int nextChap=400;
		input();
		return nextChap;
	}

	public int c78(){
		s.printText(78);
		int nextChap=0;
		int x=input();
		switch (x) {
		case 1:
			nextChap=301;
			break;
		case 2:
			nextChap=142;
			break;
		default:
			nextChap=78;
			break;
		}
		return nextChap;
	}

	public int c79(){
		s.printText(79);
		int nextChap=0;
		if (p.tryLuck()) {
			nextChap=106;
		}else {
			nextChap=383;
		}
		input();
		return nextChap;
	}

	public int c80(){
		s.printText(80);
		int nextChap=313;
		input();
		return nextChap;
	}

	public int c81(){
		s.printText(81);
		int nextChap=0;
		int x=input();
		switch(x) {
		case 1:
			nextChap=307;
			break;
		case 2:
			nextChap=263;
			break;
		case 3:
			nextChap=136;
			break;
		default:
			nextChap=81;
			break;
		}
		return nextChap;
	}

	public int c82(){
		s.printText(82);
		int nextChap=214;
		input();
		return nextChap;
	}

	public int c83(){
		s.printText(83);
		int nextChap=37;
		input();
		return nextChap;
	}

	public int c84(){
		s.printText(84);
		int nextChap=0;
		int dice=p.roll2Dice();
		System.out.println("You rolled "+dice);
		if (dice>8) {
			nextChap=152;
		}else {
			nextChap=121;
		}
		input();
		return nextChap;
	}

	public int c85(){
		s.printText(85);
		int nextChap=500;
		return nextChap;
	}

	public int c86(){
		s.printText(86);
		int nextChap=187;
		input();
		return nextChap;
	}

	public int c87(){
		s.printText(87);
		int nextChap=381;
		input();
		return nextChap;
	}

	public int c88(){
		s.printText(88);
		int nextChap=0;
		int x=input();
		switch(x) {
		case 1:
			nextChap=343;
			break;
		case 2:
			nextChap=268;
			break;
		default:
			nextChap=88;
			break;
		}
		return nextChap;
	}

	public int c89(){
		s.printText(89);
		int nextChap=0;
		if (p.tryLuck()) {
			nextChap=54;
		}else {
			nextChap=261;
		}
		input();
		return nextChap;
	}

	public int c90(){
		s.printText(90);
		int nextChap=0;
		if (p.isBloodbeastDescription()) {
			nextChap=172;
		}else {
			nextChap=357;
		}
		input();
		return nextChap;
	}

	public int c91(){
		s.printText(91);
		int nextChap=0;
		boolean success=false;
		p.setSkill(p.getSkill()-4);
		success=p.battle(5, 5, "First Orc");
		if (success) {
			success=p.battle(6,4,"Second Orc");
			if (success) {
				p.setSkill(p.getSkill()+4);
				nextChap=257;
			}else {
				System.out.println("You're dead");
				nextChap=500;
			}
		}else {
			System.out.println("You're dead");
			nextChap=500;
		}
		input();
		return nextChap;
	}

	public int c92(){
		s.printText(92);
		int nextChap=122;
		input();
		return nextChap;
	}

	public int c93(){
		s.printText(93);
		int nextChap=0;
		int x=input();
		switch(x) {
		case 1:
			nextChap=284;
			break;
		case 2:
			nextChap=230;
			break;
		default:
			nextChap=93;
			break;
		}
		return nextChap;
	}

	public int c94(){
		s.printText(94);
		int nextChap=174;
		p.setDagger(true);
		input();
		return nextChap;
	}

	public int c95(){
		s.printText(95);
		int nextChap=248;
		p.setIronShield(true);
		p.setSkill(p.getSkill()+1);
		input();
		return nextChap;
	}

	public int c96(){
		s.printText(96);
		int nextChap=500;
		return nextChap;
	}

	public int c97(){
		s.printText(97);
		int nextChap=134;
		input();
		return nextChap;
	}

	public int c98(){
		s.printText(98);
		int nextChap=0;
		if (p.tryLuck()) {
			nextChap=105;
		}else {
			nextChap=235;
		}
		input();
		return nextChap;
	}

	public int c99(){
		s.printText(99);
		int nextChap=0;
		int x=input();
		switch (x) {
		case 1:
			nextChap=266;
			break;
		case 2:
			nextChap=305;
			break;
		default:
			nextChap=99;
			break;
		}
		return nextChap;
	}

	public int c100(){
		s.printText(100);
		int nextChap=0;
		int x=input();
		switch(x) {
		case 1:
			nextChap=87;
			break;
		case 2:
			nextChap=217;
			break;
		default:
			nextChap=100;
			break;
		}
		return nextChap;
	}

	public int c101(){
		s.printText(101);
		int nextChap=0;
		return nextChap;
	}

	public int c102(){
		s.printText(102);
		int nextChap=0;
		return nextChap;
	}

	public int c103(){
		s.printText(103);
		int nextChap=0;
		return nextChap;
	}

	public int c104(){
		s.printText(104);
		int nextChap=0;
		return nextChap;
	}

	public int c105(){
		s.printText(105);
		int nextChap=0;
		return nextChap;
	}

	public int c106(){
		s.printText(106);
		int nextChap=0;
		return nextChap;
	}

	public int c107(){
		s.printText(107);
		int nextChap=0;
		return nextChap;
	}

	public int c108(){
		s.printText(108);
		int nextChap=0;
		return nextChap;
	}

	public int c109(){
		s.printText(109);
		int nextChap=0;
		return nextChap;
	}

	public int c110(){
		s.printText(110);
		int nextChap=0;
		return nextChap;
	}

	public int c111(){
		s.printText(111);
		int nextChap=0;
		return nextChap;
	}

	public int c112(){
		s.printText(112);
		int nextChap=0;
		return nextChap;
	}

	public int c113(){
		s.printText(113);
		int nextChap=0;
		return nextChap;
	}

	public int c114(){
		s.printText(114);
		int nextChap=0;
		return nextChap;
	}

	public int c115(){
		s.printText(115);
		int nextChap=0;
		return nextChap;
	}

	public int c116(){
		s.printText(116);
		int nextChap=0;
		return nextChap;
	}

	public int c117(){
		s.printText(117);
		int nextChap=0;
		return nextChap;
	}

	public int c118(){
		s.printText(118);
		int nextChap=0;
		return nextChap;
	}

	public int c119(){
		s.printText(119);
		int nextChap=0;
		return nextChap;
	}

	public int c120(){
		s.printText(120);
		int nextChap=0;
		return nextChap;
	}

	public int c121(){
		s.printText(121);
		int nextChap=0;
		return nextChap;
	}

	public int c122(){
		s.printText(122);
		int nextChap=0;
		return nextChap;
	}

	public int c123(){
		s.printText(123);
		int nextChap=0;
		return nextChap;
	}

	public int c124(){
		s.printText(124);
		int nextChap=0;
		return nextChap;
	}

	public int c125(){
		s.printText(125);
		int nextChap=0;
		return nextChap;
	}

	public int c126(){
		s.printText(126);
		int nextChap=0;
		return nextChap;
	}

	public int c127(){
		s.printText(127);
		int nextChap=0;
		return nextChap;
	}

	public int c128(){
		s.printText(128);
		int nextChap=0;
		return nextChap;
	}

	public int c129(){
		s.printText(129);
		int nextChap=0;
		return nextChap;
	}

	public int c130(){
		s.printText(130);
		int nextChap=0;
		return nextChap;
	}

	public int c131(){
		s.printText(131);
		int nextChap=0;
		return nextChap;
	}

	public int c132(){
		s.printText(132);
		int nextChap=0;
		return nextChap;
	}

	public int c133(){
		s.printText(133);
		int nextChap=0;
		return nextChap;
	}

	public int c134(){
		s.printText(134);
		int nextChap=0;
		return nextChap;
	}

	public int c135(){
		s.printText(135);
		int nextChap=0;
		return nextChap;
	}

	public int c136(){
		s.printText(136);
		int nextChap=0;
		return nextChap;
	}

	public int c137(){
		s.printText(137);
		int nextChap=0;
		return nextChap;
	}

	public int c138(){
		s.printText(138);
		int nextChap=0;
		return nextChap;
	}

	public int c139(){
		s.printText(139);
		int nextChap=0;
		return nextChap;
	}

	public int c140(){
		s.printText(140);
		int nextChap=0;
		return nextChap;
	}

	public int c141(){
		s.printText(141);
		int nextChap=0;
		return nextChap;
	}

	public int c142(){
		s.printText(142);
		int nextChap=0;
		return nextChap;
	}

	public int c143(){
		s.printText(143);
		int nextChap=0;
		return nextChap;
	}

	public int c144(){
		s.printText(144);
		int nextChap=0;
		return nextChap;
	}

	public int c145(){
		s.printText(145);
		int nextChap=0;
		return nextChap;
	}

	public int c146(){
		s.printText(146);
		int nextChap=0;
		return nextChap;
	}

	public int c147(){
		s.printText(147);
		int nextChap=0;
		return nextChap;
	}

	public int c148(){
		s.printText(148);
		int nextChap=0;
		return nextChap;
	}

	public int c149(){
		s.printText(149);
		int nextChap=0;
		return nextChap;
	}

	public int c150(){
		s.printText(150);
		int nextChap=0;
		return nextChap;
	}

	public int c151(){
		s.printText(151);
		int nextChap=0;
		return nextChap;
	}

	public int c152(){
		s.printText(152);
		int nextChap=0;
		return nextChap;
	}

	public int c153(){
		s.printText(153);
		int nextChap=0;
		return nextChap;
	}

	public int c154(){
		s.printText(154);
		int nextChap=0;
		return nextChap;
	}

	public int c155(){
		s.printText(155);
		int nextChap=0;
		return nextChap;
	}

	public int c156(){
		s.printText(156);
		int nextChap=0;
		return nextChap;
	}

	public int c157(){
		s.printText(157);
		int nextChap=0;
		return nextChap;
	}

	public int c158(){
		s.printText(158);
		int nextChap=0;
		return nextChap;
	}

	public int c159(){
		s.printText(159);
		int nextChap=0;
		return nextChap;
	}

	public int c160(){
		s.printText(160);
		int nextChap=0;
		return nextChap;
	}

	public int c161(){
		s.printText(161);
		int nextChap=0;
		return nextChap;
	}

	public int c162(){
		s.printText(162);
		int nextChap=0;
		return nextChap;
	}

	public int c163(){
		s.printText(163);
		int nextChap=0;
		return nextChap;
	}

	public int c164(){
		s.printText(164);
		int nextChap=0;
		return nextChap;
	}

	public int c165(){
		s.printText(165);
		int nextChap=0;
		return nextChap;
	}

	public int c166(){
		s.printText(166);
		int nextChap=0;
		return nextChap;
	}

	public int c167(){
		s.printText(167);
		int nextChap=0;
		return nextChap;
	}

	public int c168(){
		s.printText(168);
		int nextChap=0;
		return nextChap;
	}

	public int c169(){
		s.printText(169);
		int nextChap=0;
		return nextChap;
	}

	public int c170(){
		s.printText(170);
		int nextChap=0;
		return nextChap;
	}

	public int c171(){
		s.printText(171);
		int nextChap=0;
		return nextChap;
	}

	public int c172(){
		s.printText(172);
		int nextChap=0;
		return nextChap;
	}

	public int c173(){
		s.printText(173);
		int nextChap=0;
		return nextChap;
	}

	public int c174(){
		s.printText(174);
		int nextChap=0;
		return nextChap;
	}

	public int c175(){
		s.printText(175);
		int nextChap=0;
		return nextChap;
	}

	public int c176(){
		s.printText(176);
		int nextChap=0;
		return nextChap;
	}

	public int c177(){
		s.printText(177);
		int nextChap=0;
		return nextChap;
	}

	public int c178(){
		s.printText(178);
		int nextChap=0;
		return nextChap;
	}

	public int c179(){
		s.printText(179);
		int nextChap=0;
		return nextChap;
	}

	public int c180(){
		s.printText(180);
		int nextChap=0;
		return nextChap;
	}

	public int c181(){
		s.printText(181);
		int nextChap=0;
		return nextChap;
	}

	public int c182(){
		s.printText(182);
		int nextChap=0;
		return nextChap;
	}

	public int c183(){
		s.printText(183);
		int nextChap=0;
		return nextChap;
	}

	public int c184(){
		s.printText(184);
		int nextChap=0;
		return nextChap;
	}

	public int c185(){
		s.printText(185);
		int nextChap=0;
		return nextChap;
	}

	public int c186(){
		s.printText(186);
		int nextChap=0;
		return nextChap;
	}

	public int c187(){
		s.printText(187);
		int nextChap=0;
		return nextChap;
	}

	public int c188(){
		s.printText(188);
		int nextChap=0;
		return nextChap;
	}

	public int c189(){
		s.printText(189);
		int nextChap=0;
		return nextChap;
	}

	public int c190(){
		s.printText(190);
		int nextChap=0;
		return nextChap;
	}

	public int c191(){
		s.printText(191);
		int nextChap=0;
		return nextChap;
	}

	public int c192(){
		s.printText(192);
		int nextChap=0;
		return nextChap;
	}

	public int c193(){
		s.printText(193);
		int nextChap=0;
		return nextChap;
	}

	public int c194(){
		s.printText(194);
		int nextChap=0;
		return nextChap;
	}

	public int c195(){
		s.printText(195);
		int nextChap=0;
		return nextChap;
	}

	public int c196(){
		s.printText(196);
		int nextChap=0;
		return nextChap;
	}

	public int c197(){
		s.printText(197);
		int nextChap=0;
		return nextChap;
	}

	public int c198(){
		s.printText(198);
		int nextChap=0;
		return nextChap;
	}

	public int c199(){
		s.printText(199);
		int nextChap=0;
		return nextChap;
	}

	public int c200(){
		s.printText(200);
		int nextChap=0;
		return nextChap;
	}

	public int c201(){
		s.printText(201);
		int nextChap=0;
		return nextChap;
	}

	public int c202(){
		s.printText(202);
		int nextChap=0;
		return nextChap;
	}

	public int c203(){
		s.printText(203);
		int nextChap=0;
		return nextChap;
	}

	public int c204(){
		s.printText(204);
		int nextChap=0;
		return nextChap;
	}

	public int c205(){
		s.printText(205);
		int nextChap=0;
		return nextChap;
	}

	public int c206(){
		s.printText(206);
		int nextChap=0;
		return nextChap;
	}

	public int c207(){
		s.printText(207);
		int nextChap=0;
		return nextChap;
	}

	public int c208(){
		s.printText(208);
		int nextChap=0;
		return nextChap;
	}

	public int c209(){
		s.printText(209);
		int nextChap=0;
		return nextChap;
	}

	public int c210(){
		s.printText(210);
		int nextChap=0;
		return nextChap;
	}

	public int c211(){
		s.printText(211);
		int nextChap=0;
		return nextChap;
	}

	public int c212(){
		s.printText(212);
		int nextChap=0;
		return nextChap;
	}

	public int c213(){
		s.printText(213);
		int nextChap=0;
		return nextChap;
	}

	public int c214(){
		s.printText(214);
		int nextChap=0;
		return nextChap;
	}

	public int c215(){
		s.printText(215);
		int nextChap=0;
		return nextChap;
	}

	public int c216(){
		s.printText(216);
		int nextChap=0;
		return nextChap;
	}

	public int c217(){
		s.printText(217);
		int nextChap=0;
		return nextChap;
	}

	public int c218(){
		s.printText(218);
		int nextChap=0;
		return nextChap;
	}

	public int c219(){
		s.printText(219);
		int nextChap=0;
		return nextChap;
	}

	public int c220(){
		s.printText(220);
		int nextChap=0;
		return nextChap;
	}

	public int c221(){
		s.printText(221);
		int nextChap=0;
		return nextChap;
	}

	public int c222(){
		s.printText(222);
		int nextChap=0;
		return nextChap;
	}

	public int c223(){
		s.printText(223);
		int nextChap=0;
		return nextChap;
	}

	public int c224(){
		s.printText(224);
		int nextChap=0;
		return nextChap;
	}

	public int c225(){
		s.printText(225);
		int nextChap=0;
		return nextChap;
	}

	public int c226(){
		s.printText(226);
		int nextChap=0;
		return nextChap;
	}

	public int c227(){
		s.printText(227);
		int nextChap=0;
		return nextChap;
	}

	public int c228(){
		s.printText(228);
		int nextChap=0;
		return nextChap;
	}

	public int c229(){
		s.printText(229);
		int nextChap=0;
		return nextChap;
	}

	public int c230(){
		s.printText(230);
		int nextChap=0;
		return nextChap;
	}

	public int c231(){
		s.printText(231);
		int nextChap=0;
		return nextChap;
	}

	public int c232(){
		s.printText(232);
		int nextChap=0;
		return nextChap;
	}

	public int c233(){
		s.printText(233);
		int nextChap=0;
		return nextChap;
	}

	public int c234(){
		s.printText(234);
		int nextChap=0;
		return nextChap;
	}

	public int c235(){
		s.printText(235);
		int nextChap=0;
		return nextChap;
	}

	public int c236(){
		s.printText(236);
		int nextChap=0;
		return nextChap;
	}

	public int c237(){
		s.printText(237);
		int nextChap=0;
		return nextChap;
	}

	public int c238(){
		s.printText(238);
		int nextChap=0;
		return nextChap;
	}

	public int c239(){
		s.printText(239);
		int nextChap=0;
		return nextChap;
	}

	public int c240(){
		s.printText(240);
		int nextChap=0;
		return nextChap;
	}

	public int c241(){
		s.printText(241);
		int nextChap=0;
		return nextChap;
	}

	public int c242(){
		s.printText(242);
		int nextChap=0;
		return nextChap;
	}

	public int c243(){
		s.printText(243);
		int nextChap=0;
		return nextChap;
	}

	public int c244(){
		s.printText(244);
		int nextChap=0;
		return nextChap;
	}

	public int c245(){
		s.printText(245);
		int nextChap=0;
		return nextChap;
	}

	public int c246(){
		s.printText(246);
		int nextChap=0;
		return nextChap;
	}

	public int c247(){
		s.printText(247);
		int nextChap=0;
		return nextChap;
	}

	public int c248(){
		s.printText(248);
		int nextChap=0;
		return nextChap;
	}

	public int c249(){
		s.printText(249);
		int nextChap=0;
		return nextChap;
	}

	public int c250(){
		s.printText(250);
		int nextChap=0;
		return nextChap;
	}

	public int c251(){
		s.printText(251);
		int nextChap=0;
		return nextChap;
	}

	public int c252(){
		s.printText(252);
		int nextChap=0;
		return nextChap;
	}

	public int c253(){
		s.printText(253);
		int nextChap=0;
		return nextChap;
	}

	public int c254(){
		s.printText(254);
		int nextChap=0;
		return nextChap;
	}

	public int c255(){
		s.printText(255);
		int nextChap=0;
		return nextChap;
	}

	public int c256(){
		s.printText(256);
		int nextChap=0;
		return nextChap;
	}

	public int c257(){
		s.printText(257);
		int nextChap=0;
		return nextChap;
	}

	public int c258(){
		s.printText(258);
		int nextChap=0;
		return nextChap;
	}

	public int c259(){
		s.printText(259);
		int nextChap=0;
		return nextChap;
	}

	public int c260(){
		s.printText(260);
		int nextChap=0;
		return nextChap;
	}

	public int c261(){
		s.printText(261);
		int nextChap=0;
		return nextChap;
	}

	public int c262(){
		s.printText(262);
		int nextChap=0;
		return nextChap;
	}

	public int c263(){
		s.printText(263);
		int nextChap=0;
		return nextChap;
	}

	public int c264(){
		s.printText(264);
		int nextChap=0;
		return nextChap;
	}

	public int c265(){
		s.printText(265);
		int nextChap=0;
		return nextChap;
	}

	public int c266(){
		s.printText(266);
		int nextChap=0;
		return nextChap;
	}

	public int c267(){
		s.printText(267);
		int nextChap=0;
		return nextChap;
	}

	public int c268(){
		s.printText(268);
		int nextChap=0;
		return nextChap;
	}

	public int c269(){
		s.printText(269);
		int nextChap=0;
		return nextChap;
	}

	public int c270(){
		s.printText(270);
		int nextChap=0;
		return nextChap;
	}

	public int c271(){
		s.printText(271);
		int nextChap=0;
		return nextChap;
	}

	public int c272(){
		s.printText(272);
		int nextChap=0;
		return nextChap;
	}

	public int c273(){
		s.printText(273);
		int nextChap=0;
		return nextChap;
	}

	public int c274(){
		s.printText(274);
		int nextChap=0;
		return nextChap;
	}

	public int c275(){
		s.printText(275);
		int nextChap=0;
		return nextChap;
	}

	public int c276(){
		s.printText(276);
		int nextChap=0;
		return nextChap;
	}

	public int c277(){
		s.printText(277);
		int nextChap=0;
		return nextChap;
	}

	public int c278(){
		s.printText(278);
		int nextChap=0;
		return nextChap;
	}

	public int c279(){
		s.printText(279);
		int nextChap=0;
		return nextChap;
	}

	public int c280(){
		s.printText(280);
		int nextChap=0;
		return nextChap;
	}

	public int c281(){
		s.printText(281);
		int nextChap=0;
		return nextChap;
	}

	public int c282(){
		s.printText(282);
		int nextChap=0;
		return nextChap;
	}

	public int c283(){
		s.printText(283);
		int nextChap=0;
		return nextChap;
	}

	public int c284(){
		s.printText(284);
		int nextChap=0;
		return nextChap;
	}

	public int c285(){
		s.printText(285);
		int nextChap=0;
		return nextChap;
	}

	public int c286(){
		s.printText(286);
		int nextChap=0;
		return nextChap;
	}

	public int c287(){
		s.printText(287);
		int nextChap=0;
		return nextChap;
	}

	public int c288(){
		s.printText(288);
		int nextChap=0;
		return nextChap;
	}

	public int c289(){
		s.printText(289);
		int nextChap=0;
		return nextChap;
	}

	public int c290(){
		s.printText(290);
		int nextChap=0;
		return nextChap;
	}

	public int c291(){
		s.printText(291);
		int nextChap=0;
		return nextChap;
	}

	public int c292(){
		s.printText(292);
		int nextChap=0;
		return nextChap;
	}

	public int c293(){
		s.printText(293);
		int nextChap=0;
		return nextChap;
	}

	public int c294(){
		s.printText(294);
		int nextChap=0;
		return nextChap;
	}

	public int c295(){
		s.printText(295);
		int nextChap=0;
		return nextChap;
	}

	public int c296(){
		s.printText(296);
		int nextChap=0;
		return nextChap;
	}

	public int c297(){
		s.printText(297);
		int nextChap=0;
		return nextChap;
	}

	public int c298(){
		s.printText(298);
		int nextChap=0;
		return nextChap;
	}

	public int c299(){
		s.printText(299);
		int nextChap=0;
		return nextChap;
	}

	public int c300(){
		s.printText(300);
		int nextChap=0;
		return nextChap;
	}

	public int c301(){
		s.printText(301);
		int nextChap=0;
		return nextChap;
	}

	public int c302(){
		s.printText(302);
		int nextChap=0;
		return nextChap;
	}

	public int c303(){
		s.printText(303);
		int nextChap=0;
		return nextChap;
	}

	public int c304(){
		s.printText(304);
		int nextChap=0;
		return nextChap;
	}

	public int c305(){
		s.printText(305);
		int nextChap=0;
		return nextChap;
	}

	public int c306(){
		s.printText(306);
		int nextChap=0;
		return nextChap;
	}

	public int c307(){
		s.printText(307);
		int nextChap=0;
		return nextChap;
	}

	public int c308(){
		s.printText(308);
		int nextChap=0;
		return nextChap;
	}

	public int c309(){
		s.printText(309);
		int nextChap=0;
		return nextChap;
	}

	public int c310(){
		s.printText(310);
		int nextChap=0;
		return nextChap;
	}

	public int c311(){
		s.printText(311);
		int nextChap=0;
		return nextChap;
	}

	public int c312(){
		s.printText(312);
		int nextChap=0;
		return nextChap;
	}

	public int c313(){
		s.printText(313);
		int nextChap=0;
		return nextChap;
	}

	public int c314(){
		s.printText(314);
		int nextChap=0;
		return nextChap;
	}

	public int c315(){
		s.printText(315);
		int nextChap=0;
		return nextChap;
	}

	public int c316(){
		s.printText(316);
		int nextChap=0;
		return nextChap;
	}

	public int c317(){
		s.printText(317);
		int nextChap=0;
		return nextChap;
	}

	public int c318(){
		s.printText(318);
		int nextChap=0;
		return nextChap;
	}

	public int c319(){
		s.printText(319);
		int nextChap=0;
		return nextChap;
	}

	public int c320(){
		s.printText(320);
		int nextChap=0;
		return nextChap;
	}

	public int c321(){
		s.printText(321);
		int nextChap=0;
		return nextChap;
	}

	public int c322(){
		s.printText(322);
		int nextChap=0;
		return nextChap;
	}

	public int c323(){
		s.printText(323);
		int nextChap=0;
		return nextChap;
	}

	public int c324(){
		s.printText(324);
		int nextChap=0;
		return nextChap;
	}

	public int c325(){
		s.printText(325);
		int nextChap=0;
		return nextChap;
	}

	public int c326(){
		s.printText(326);
		int nextChap=0;
		return nextChap;
	}

	public int c327(){
		s.printText(327);
		int nextChap=0;
		return nextChap;
	}

	public int c328(){
		s.printText(328);
		int nextChap=0;
		return nextChap;
	}

	public int c329(){
		s.printText(329);
		int nextChap=0;
		return nextChap;
	}

	public int c330(){
		s.printText(330);
		int nextChap=0;
		return nextChap;
	}

	public int c331(){
		s.printText(331);
		int nextChap=0;
		return nextChap;
	}

	public int c332(){
		s.printText(332);
		int nextChap=0;
		return nextChap;
	}

	public int c333(){
		s.printText(333);
		int nextChap=0;
		return nextChap;
	}

	public int c334(){
		s.printText(334);
		int nextChap=0;
		return nextChap;
	}

	public int c335(){
		s.printText(335);
		int nextChap=0;
		return nextChap;
	}

	public int c336(){
		s.printText(336);
		int nextChap=0;
		return nextChap;
	}

	public int c337(){
		s.printText(337);
		int nextChap=0;
		return nextChap;
	}

	public int c338(){
		s.printText(338);
		int nextChap=0;
		return nextChap;
	}

	public int c339(){
		s.printText(339);
		int nextChap=0;
		return nextChap;
	}

	public int c340(){
		s.printText(340);
		int nextChap=0;
		return nextChap;
	}

	public int c341(){
		s.printText(341);
		int nextChap=0;
		return nextChap;
	}

	public int c342(){
		s.printText(342);
		int nextChap=0;
		return nextChap;
	}

	public int c343(){
		s.printText(343);
		int nextChap=0;
		return nextChap;
	}

	public int c344(){
		s.printText(344);
		int nextChap=0;
		return nextChap;
	}

	public int c345(){
		s.printText(345);
		int nextChap=0;
		return nextChap;
	}

	public int c346(){
		s.printText(346);
		int nextChap=0;
		return nextChap;
	}

	public int c347(){
		s.printText(347);
		int nextChap=0;
		return nextChap;
	}

	public int c348(){
		s.printText(348);
		int nextChap=0;
		return nextChap;
	}

	public int c349(){
		s.printText(349);
		int nextChap=0;
		return nextChap;
	}

	public int c350(){
		s.printText(350);
		int nextChap=0;
		return nextChap;
	}

	public int c351(){
		s.printText(351);
		int nextChap=0;
		return nextChap;
	}

	public int c352(){
		s.printText(352);
		int nextChap=0;
		return nextChap;
	}

	public int c353(){
		s.printText(353);
		int nextChap=0;
		return nextChap;
	}

	public int c354(){
		s.printText(354);
		int nextChap=0;
		return nextChap;
	}

	public int c355(){
		s.printText(355);
		int nextChap=0;
		return nextChap;
	}

	public int c356(){
		s.printText(356);
		int nextChap=0;
		return nextChap;
	}

	public int c357(){
		s.printText(357);
		int nextChap=0;
		return nextChap;
	}

	public int c358(){
		s.printText(358);
		int nextChap=0;
		return nextChap;
	}

	public int c359(){
		s.printText(359);
		int nextChap=0;
		return nextChap;
	}

	public int c360(){
		s.printText(360);
		int nextChap=0;
		return nextChap;
	}

	public int c361(){
		s.printText(361);
		int nextChap=0;
		return nextChap;
	}

	public int c362(){
		s.printText(362);
		int nextChap=0;
		return nextChap;
	}

	public int c363(){
		s.printText(363);
		int nextChap=0;
		return nextChap;
	}

	public int c364(){
		s.printText(364);
		int nextChap=0;
		return nextChap;
	}

	public int c365(){
		s.printText(365);
		int nextChap=0;
		return nextChap;
	}

	public int c366(){
		s.printText(366);
		int nextChap=0;
		return nextChap;
	}

	public int c367(){
		s.printText(367);
		int nextChap=0;
		return nextChap;
	}

	public int c368(){
		s.printText(368);
		int nextChap=0;
		return nextChap;
	}

	public int c369(){
		s.printText(369);
		int nextChap=0;
		return nextChap;
	}

	public int c370(){
		s.printText(370);
		int nextChap=0;
		return nextChap;
	}

	public int c371(){
		s.printText(371);
		int nextChap=0;
		return nextChap;
	}

	public int c372(){
		s.printText(372);
		int nextChap=0;
		return nextChap;
	}

	public int c373(){
		s.printText(373);
		int nextChap=0;
		return nextChap;
	}

	public int c374(){
		s.printText(374);
		int nextChap=0;
		return nextChap;
	}

	public int c375(){
		s.printText(375);
		int nextChap=0;
		return nextChap;
	}

	public int c376(){
		s.printText(376);
		int nextChap=0;
		return nextChap;
	}

	public int c377(){
		s.printText(377);
		int nextChap=0;
		return nextChap;
	}

	public int c378(){
		s.printText(378);
		int nextChap=0;
		return nextChap;
	}

	public int c379(){
		s.printText(379);
		int nextChap=0;
		return nextChap;
	}

	public int c380(){
		s.printText(380);
		int nextChap=0;
		return nextChap;
	}

	public int c381(){
		s.printText(381);
		int nextChap=0;
		return nextChap;
	}

	public int c382(){
		s.printText(382);
		int nextChap=0;
		return nextChap;
	}

	public int c383(){
		s.printText(383);
		int nextChap=0;
		return nextChap;
	}

	public int c384(){
		s.printText(384);
		int nextChap=0;
		return nextChap;
	}

	public int c385(){
		s.printText(385);
		int nextChap=0;
		return nextChap;
	}

	public int c386(){
		s.printText(386);
		int nextChap=0;
		return nextChap;
	}

	public int c387(){
		s.printText(387);
		int nextChap=0;
		return nextChap;
	}

	public int c388(){
		s.printText(388);
		int nextChap=0;
		return nextChap;
	}

	public int c389(){
		s.printText(389);
		int nextChap=0;
		return nextChap;
	}

	public int c390(){
		s.printText(390);
		int nextChap=0;
		return nextChap;
	}

	public int c391(){
		s.printText(391);
		int nextChap=0;
		return nextChap;
	}

	public int c392(){
		s.printText(392);
		int nextChap=0;
		return nextChap;
	}

	public int c393(){
		s.printText(393);
		int nextChap=0;
		return nextChap;
	}

	public int c394(){
		s.printText(394);
		int nextChap=0;
		return nextChap;
	}

	public int c395(){
		s.printText(395);
		int nextChap=0;
		return nextChap;
	}

	public int c396(){
		s.printText(396);
		int nextChap=0;
		return nextChap;
	}

	public int c397(){
		s.printText(397);
		int nextChap=0;
		return nextChap;
	}

	public int c398(){
		s.printText(398);
		int nextChap=0;
		return nextChap;
	}

	public int c399(){
		s.printText(399);
		int nextChap=0;
		return nextChap;
	}

	public int c400(){
		s.printText(400);
		int nextChap=401;
		return nextChap;
	}

}
