
public class Character implements Player {

	//Properties
	private int stamina;
	private int skill;
	private int luck;
	private int potionOfSkill;
	private int potionOfStamina;
	private int potionOfLuck;
	private int provisions;
	
	
	/*
	 * Constructor
	 * Set up skill, stamina, luck, potion, provisions
	 */
	public Character() {
		
	}
	
	@Override
	public boolean tryLuck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean battle(int eSkill, int eStamina) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean provision() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean potionSkill() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean potionStamina() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean potionFortune() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doubleAttack(int eSkill1, int eStamina1, int eSkill2, int eStamina2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean singleAttackRound(int eSkill, int eStamina) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int roll2Dice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int roll1Die() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean flawlessFight(int eSkill, int eStamina) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void inventory() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getSkill() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSkill(int adjust) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getStamina() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setStamina(int adjust) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLuck() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setLuck(int adjust) {
		// TODO Auto-generated method stub

	}

}
