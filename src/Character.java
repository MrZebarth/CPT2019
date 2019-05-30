
public class Character implements Player {

	//Properties
	private int stamina;
	private int skill;
	private int luck;
	private int staminaInitial;
	private int skillInitial;
	private int luckInitial;
	private int potionOfSkill;
	private int potionOfStamina;
	private int potionOfLuck;
	private int provisions;
	private int gold=0;
	private boolean emerald=false;
	private boolean crippledServantTalk=false;
	private boolean brassBell=false;
	private boolean grapplingIron=false;
	private boolean searchAlcove=false;
	private boolean bloodbeastDescription=false;
	private boolean openReadBook=false;
	private boolean boneRing=false;
	private boolean skeletonWarriorParchmentPoem=false;
	private boolean liquidInWounds=false;
	private boolean dagger=false;
	private boolean ironShield=false;
	private boolean goblet=false;
	private boolean doppelgangerPotion=false;
	private int ballThrown=0;
	private boolean amuletOfStrength=false;
	private boolean searchBarbarian=false;
	private boolean openBlackBook=false;
	private boolean waterBambooPipe=false;
	private boolean pearl=false;
	private boolean ironKey=false;
	private boolean sapphire=false;
	private boolean stilts=false;
	private boolean servantOfTrialmastersDoppelganger=false;
	private boolean rope=false;
	private boolean pixieFountain=false;
	private boolean leprechaunToothfalse;
	private boolean mirror=false;
	private boolean boneMonkeyCharm=false;
	private boolean oldBone=false;
	private boolean herbMeat=false;
	private boolean spiritGirlPoem=false;
	private boolean helmet=false;
	private boolean goldRing=false;
	private boolean hollowWoodenTube=false;
	private boolean diamond=false;
	private boolean sukumvitNote=false;
	private boolean topaz=false;
	private boolean elfAdvice=false;
	private boolean ruby=false;
	private boolean ninjaSword=false;
	private boolean ninjaDagger=false;
	private boolean box=false;
	private boolean mallet=false;
	private boolean spikes=false;
	private boolean garnet=false;
	private boolean cursedWristBand=false;
	private boolean cursedWater=false;
	private boolean jugOfAcid=false;
	private boolean trapDetectionPotion=false;
	private boolean elfBread=false;
	
	
	
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
	public boolean battle(int eSkill, int eStamina, String eName) {
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
	public boolean doubleAttack(int eSkill1, int eStamina1, String eName1, int eSkill2, int eStamina2, String eName2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean singleAttackRound(int eSkill, int eStamina, String eName) {
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
	public boolean flawlessFight(int eSkill, int eStamina, String eName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scorpionFight(int eSkill1, int eStamina1, int eSkill2, int eStamina2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void inventory() {
		// TODO Auto-generated method stub

	}

	/*GETTERS/SETTERS LAND*/
	
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

	public int getStaminaInitial() {
		return staminaInitial;
	}

	public void setStaminaInitial(int staminaInitial) {
		this.staminaInitial = staminaInitial;
	}

	public int getSkillInitial() {
		return skillInitial;
	}

	public void setSkillInitial(int skillInitial) {
		this.skillInitial = skillInitial;
	}

	public int getLuckInitial() {
		return luckInitial;
	}

	public void setLuckInitial(int luckInitial) {
		this.luckInitial = luckInitial;
	}

	public int getPotionOfSkill() {
		return potionOfSkill;
	}

	public void setPotionOfSkill(int potionOfSkill) {
		this.potionOfSkill = potionOfSkill;
	}

	public int getPotionOfStamina() {
		return potionOfStamina;
	}

	public void setPotionOfStamina(int potionOfStamina) {
		this.potionOfStamina = potionOfStamina;
	}

	public int getPotionOfLuck() {
		return potionOfLuck;
	}

	public void setPotionOfLuck(int potionOfLuck) {
		this.potionOfLuck = potionOfLuck;
	}

	public int getProvisions() {
		return provisions;
	}

	public void setProvisions(int provisions) {
		this.provisions = provisions;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public boolean isEmerald() {
		return emerald;
	}

	public void setEmerald(boolean emerald) {
		this.emerald = emerald;
	}

	public boolean isCrippledServantTalk() {
		return crippledServantTalk;
	}

	public void setCrippledServantTalk(boolean crippledServantTalk) {
		this.crippledServantTalk = crippledServantTalk;
	}

	public boolean isBrassBell() {
		return brassBell;
	}

	public void setBrassBell(boolean brassBell) {
		this.brassBell = brassBell;
	}

	public boolean isGrapplingIron() {
		return grapplingIron;
	}

	public void setGrapplingIron(boolean grapplingIron) {
		this.grapplingIron = grapplingIron;
	}

	public boolean isSearchAlcove() {
		return searchAlcove;
	}

	public void setSearchAlcove(boolean searchAlcove) {
		this.searchAlcove = searchAlcove;
	}

	public boolean isBloodbeastDescription() {
		return bloodbeastDescription;
	}

	public void setBloodbeastDescription(boolean bloodbeastDescription) {
		this.bloodbeastDescription = bloodbeastDescription;
	}

	public boolean isOpenReadBook() {
		return openReadBook;
	}

	public void setOpenReadBook(boolean openReadBook) {
		this.openReadBook = openReadBook;
	}

	public boolean isBoneRing() {
		return boneRing;
	}

	public void setBoneRing(boolean boneRing) {
		this.boneRing = boneRing;
	}

	public boolean isSkeletonWarriorParchmentPoem() {
		return skeletonWarriorParchmentPoem;
	}

	public void setSkeletonWarriorParchmentPoem(boolean skeletonWarriorParchmentPoem) {
		this.skeletonWarriorParchmentPoem = skeletonWarriorParchmentPoem;
	}

	public boolean isLiquidInWounds() {
		return liquidInWounds;
	}

	public void setLiquidInWounds(boolean liquidInWounds) {
		this.liquidInWounds = liquidInWounds;
	}

	public boolean isDagger() {
		return dagger;
	}

	public void setDagger(boolean dagger) {
		this.dagger = dagger;
	}

	public boolean isIronShield() {
		return ironShield;
	}

	public void setIronShield(boolean ironShield) {
		this.ironShield = ironShield;
	}

	public boolean isGoblet() {
		return goblet;
	}

	public void setGoblet(boolean goblet) {
		this.goblet = goblet;
	}

	public boolean isDoppelgangerPotion() {
		return doppelgangerPotion;
	}

	public void setDoppelgangerPotion(boolean doppelgangerPotion) {
		this.doppelgangerPotion = doppelgangerPotion;
	}

	public int getBallThrown() {
		return ballThrown;
	}

	public void setBallThrown(int ballThrown) {
		this.ballThrown = ballThrown;
	}

	public boolean isAmuletOfStrength() {
		return amuletOfStrength;
	}

	public void setAmuletOfStrength(boolean amuletOfStrength) {
		this.amuletOfStrength = amuletOfStrength;
	}

	public boolean isSearchBarbarian() {
		return searchBarbarian;
	}

	public void setSearchBarbarian(boolean searchBarbarian) {
		this.searchBarbarian = searchBarbarian;
	}

	public boolean isOpenBlackBook() {
		return openBlackBook;
	}

	public void setOpenBlackBook(boolean openBlackBook) {
		this.openBlackBook = openBlackBook;
	}

	public boolean isWaterBambooPipe() {
		return waterBambooPipe;
	}

	public void setWaterBambooPipe(boolean waterBambooPipe) {
		this.waterBambooPipe = waterBambooPipe;
	}

	public boolean isPearl() {
		return pearl;
	}

	public void setPearl(boolean pearl) {
		this.pearl = pearl;
	}

	public boolean isIronKey() {
		return ironKey;
	}

	public void setIronKey(boolean ironKey) {
		this.ironKey = ironKey;
	}

	public boolean isSapphire() {
		return sapphire;
	}

	public void setSapphire(boolean sapphire) {
		this.sapphire = sapphire;
	}

	public boolean isStilts() {
		return stilts;
	}

	public void setStilts(boolean stilts) {
		this.stilts = stilts;
	}

	public boolean isServantOfTrialmastersDoppelganger() {
		return servantOfTrialmastersDoppelganger;
	}

	public void setServantOfTrialmastersDoppelganger(boolean servantOfTrialmastersDoppelganger) {
		this.servantOfTrialmastersDoppelganger = servantOfTrialmastersDoppelganger;
	}

	public boolean isRope() {
		return rope;
	}

	public void setRope(boolean rope) {
		this.rope = rope;
	}

	public boolean isPixieFountain() {
		return pixieFountain;
	}

	public void setPixieFountain(boolean pixieFountain) {
		this.pixieFountain = pixieFountain;
	}

	public boolean isLeprechaunToothfalse() {
		return leprechaunToothfalse;
	}

	public void setLeprechaunToothfalse(boolean leprechaunToothfalse) {
		this.leprechaunToothfalse = leprechaunToothfalse;
	}

	public boolean isMirror() {
		return mirror;
	}

	public void setMirror(boolean mirror) {
		this.mirror = mirror;
	}

	public boolean isBoneMonkeyCharm() {
		return boneMonkeyCharm;
	}

	public void setBoneMonkeyCharm(boolean boneMonkeyCharm) {
		this.boneMonkeyCharm = boneMonkeyCharm;
	}

	public boolean isOldBone() {
		return oldBone;
	}

	public void setOldBone(boolean oldBone) {
		this.oldBone = oldBone;
	}

	public boolean isHerbMeat() {
		return herbMeat;
	}

	public void setHerbMeat(boolean herbMeat) {
		this.herbMeat = herbMeat;
	}

	public boolean isSpiritGirlPoem() {
		return spiritGirlPoem;
	}

	public void setSpiritGirlPoem(boolean spiritGirlPoem) {
		this.spiritGirlPoem = spiritGirlPoem;
	}

	public boolean isHelmet() {
		return helmet;
	}

	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}

	public boolean isGoldRing() {
		return goldRing;
	}

	public void setGoldRing(boolean goldRing) {
		this.goldRing = goldRing;
	}

	public boolean isHollowWoodenTube() {
		return hollowWoodenTube;
	}

	public void setHollowWoodenTube(boolean hollowWoodenTube) {
		this.hollowWoodenTube = hollowWoodenTube;
	}

	public boolean isDiamond() {
		return diamond;
	}

	public void setDiamond(boolean diamond) {
		this.diamond = diamond;
	}

	public boolean isSukumvitNote() {
		return sukumvitNote;
	}

	public void setSukumvitNote(boolean sukumvitNote) {
		this.sukumvitNote = sukumvitNote;
	}

	public boolean isTopaz() {
		return topaz;
	}

	public void setTopaz(boolean topaz) {
		this.topaz = topaz;
	}

	public boolean isElfAdvice() {
		return elfAdvice;
	}

	public void setElfAdvice(boolean elfAdvice) {
		this.elfAdvice = elfAdvice;
	}

	public boolean isRuby() {
		return ruby;
	}

	public void setRuby(boolean ruby) {
		this.ruby = ruby;
	}

	public boolean isNinjaSword() {
		return ninjaSword;
	}

	public void setNinjaSword(boolean ninjaSword) {
		this.ninjaSword = ninjaSword;
	}

	public boolean isNinjaDagger() {
		return ninjaDagger;
	}

	public void setNinjaDagger(boolean ninjaDagger) {
		this.ninjaDagger = ninjaDagger;
	}

	public boolean isBox() {
		return box;
	}

	public void setBox(boolean box) {
		this.box = box;
	}

	public boolean isMallet() {
		return mallet;
	}

	public void setMallet(boolean mallet) {
		this.mallet = mallet;
	}

	public boolean isSpikes() {
		return spikes;
	}

	public void setSpikes(boolean spikes) {
		this.spikes = spikes;
	}

	public boolean isGarnet() {
		return garnet;
	}

	public void setGarnet(boolean garnet) {
		this.garnet = garnet;
	}

	public boolean isCursedWristBand() {
		return cursedWristBand;
	}

	public void setCursedWristBand(boolean cursedWristBand) {
		this.cursedWristBand = cursedWristBand;
	}

	public boolean isCursedWater() {
		return cursedWater;
	}

	public void setCursedWater(boolean cursedWater) {
		this.cursedWater = cursedWater;
	}

	public boolean isJugOfAcid() {
		return jugOfAcid;
	}

	public void setJugOfAcid(boolean jugOfAcid) {
		this.jugOfAcid = jugOfAcid;
	}

	public boolean isTrapDetectionPotion() {
		return trapDetectionPotion;
	}

	public void setTrapDetectionPotion(boolean trapDetectionPotion) {
		this.trapDetectionPotion = trapDetectionPotion;
	}

	public boolean isElfBread() {
		return elfBread;
	}

	public void setElfBread(boolean elfBread) {
		this.elfBread = elfBread;
	}
	
	

}
