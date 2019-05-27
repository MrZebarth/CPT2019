
public interface Player {

	
	/*Try your luck. Roll two dice, if it's lower than luck, return true. Subtract one from luck*/
	public boolean tryLuck();
	
	/*Give enemy skill and enemy stamina. Roll dice, add to skill for both player and enemy
	 * If the player is larger than enemy, subtract 2 from eStamina.
	 * Else, subtract 2 from player.
	 * Allow TryLuck after each roll. If successful after a victory, subtract 2 more from eStamina, else add 1 to eStamina
	 * If successful after a loss, add 1 to player Stamina, else subtract 1 more from player Stamina.
	 */
	public boolean battle(int eSkill, int eStamina, String eName);
	
	/*
	 * Eat a provision. Restores 4 stamina. Decreases one provision. Cannot be used in battle. Cannot be used if provisions==0.
	 * Return true if successful, return false otherwise.
	 */
	public boolean provision();
	
	/*
	 * Restore skill points to initial value. Return true if successful, return false if no potions left
	 */
	public boolean potionSkill();
	
	/*
	 * Restore Stamina Points to initial value. Return true if succesful, return false if no potions left.
	 */
	public boolean potionStamina();
	
	/*
	 * Restore Fortune Points and add one to intial luck value. Return true if successful, return false if no potions left.
	 */
	public boolean potionFortune();
	
	/*
	 * Give skill and stamina of both opponents
	 * Pick which character to fight (1 or 2) and attack as normal
	 * After that round, do a round against the other character. If you win, you simply block and no damage is done. Otherwise, you lose stamina.
	 */
	public boolean doubleAttack(int eSkill1, int eStamina1, String eName1, int eSkill2, int eStamina2, String eName2);
	
	/*
	 * Fight as normal. Return true the moment you win one round. Return false if you lose the entire fight.
	 */
	public boolean singleAttackRound(int eSkill, int eStamina, String eName);
	
	/*
	 * Roll 2 dice and return the result.
	 */
	public int roll2Dice();
	
	/*
	 * Roll 1 die and return the result.
	 */
	public int roll1Die();
	
	/*
	 * Fight as normal
	 * Return false the moment you lose one round. Return true if you win the whole thing.
	 */
	public boolean flawlessFight(int eSkill, int eStamina, String eName);	
	/*
	 * Scorpion Fight
	 * Each pincer attacks like its own creature.
	 * Player picks which one to attack.
	 * Like double Attack round, but return false if scorpion strength ever equals 22.
	 */
	public boolean scorpionFight(int eSkill1, int eStamina1, int eSkill2, int eStamina2);
	/*
	 * Print out the inventory
	 */
	public void inventory();
	
	/*
	 * Getters and Setters for Skill
	 */
	
	public int getSkill();
	
	public void setSkill(int adjust);
	
	/*
	 * Getters and Setters for Stamina
	 */
	
	public int getStamina();
	
	public void setStamina(int adjust);
	
	/*
	 * Getters and Setters for Luck
	 */
	
	public int getLuck();
	public void setLuck(int adjust);
}
