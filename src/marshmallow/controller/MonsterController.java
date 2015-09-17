package src.marshmallow.controller;

import src.marshmallow.model.MarshmallowMonster;
import src.marshmallow.view.MonsterOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster gabeMonster;
	private MonsterOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		int eyes = 5;
		double legs = 6;
		double hair = 3;
		int noses = 1;
		boolean hasBellyButton = false;
		String name = "BullyMong";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MonsterOutput();
		gabeMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	public void start()
	{
		myOutput.displayMonsterInfo(gabeMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info " + gabeMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		gabeMonster.setMonsterName(betterMonsterName);
		System.out.println("Type in a different number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		gabeMonster.setMonsterEyes(betterMonsterEyes);
		System.out.println("Type in a different number of Noses");
		int betterMonsterNoses = monsterScanner.nextInt();
		gabeMonster.setMonsterNoses(betterMonsterNoses);
		System.out.println("Type in how many hairs you want the monster to have");
		double betterMonsterHair = monsterScanner.nextDouble();
		gabeMonster.setMonsterHair(betterMonsterHair);
		System.out.println("Type in how many legs you want your monster to have");
		double betterMonsterLegs = monsterScanner.nextDouble();
		gabeMonster.setMonsterLegs(betterMonsterLegs);
		System.out.println("Type in how many belly buttons you want your monster to have");
		boolean betterMonsterBellyButton = monsterScanner.nextBoolean();
		gabeMonster.setMonsterBellyButton(betterMonsterBellyButton);
	}
} 
