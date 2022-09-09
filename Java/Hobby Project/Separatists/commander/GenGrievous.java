package commander;

import commander.CommanderClass.Commander;



public class GenGrievous {
	public static void main(String[] args) {
	Commander Grievous = new Commander();{
		Grievous.Name = "General Grievous";
		Grievous.Points = 175;
		Grievous.Health = 8;
		Grievous.Courage = 2;
		Grievous.Keywords = new String[] {"Arsenal 2", "Block", "Impervious", "Jedi Hunter", "Relentless",
				"Scale"};
		Grievous.WeaponProfiles = new String[] {"Trophy Lightsaber", "Trophy Lightsaber"};
		Grievous.UpgradeSlots = new String[] {"Command", "Command", "Armament", "Training"};
					
		System.out.println("Name: " + Grievous.Name);
	}
	}
}
