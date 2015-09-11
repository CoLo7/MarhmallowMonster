package src.marshmallow.controller;

import src.marshmallow.model.MarshmallowMonster;




import src.marshmallow.view.MonsterOutput;

public class MonsterController
{
	private MarshmallowMonster gabeMonster;
	private MonsterOutput myOutput;
	
	public MonsterController()
	{
		int eyes = 5;
		double legs = 6;
		double hair = 3;
		int noses = 1;
		boolean hasBellyButton = false;
		String name = "BullyMong";
		
		myOutput = new MonsterOutput();
		gabeMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	public void start()
	{
		myOutput.dislpayMonsterInfo(gabeMonster);
	}
} 
