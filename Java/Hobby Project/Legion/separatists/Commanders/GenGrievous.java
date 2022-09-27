package separatists;

public class GenGrievous {
	public static void main(String args[]){
	Commander.CommanderClass Grievous = new Commander.CommanderClass();{
		Grievous.Name = "General Grievous";
		Grievous.Points = 175;
		Grievous.Health = 8;
		Grievous.Courage = 2;
		Grievous.Keywords = new String[] {"Arsenal 2", "Block", "Impervious", "Jedi Hunter", "Relentless",
				"Scale"};
		Grievous.WeaponProfiles = new String[] {"Trophy Lightsaber", "Trophy Lightsaber"};
		Grievous.UpgradeSlots = new String[] {"Command", "Command", "Armament", "Training"};
		Grievous.ProfilePic = "C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/Legion Reference Docs/Separatists/Unit Cards/Commander/General Grievous.jpeg";
					
		Grievous.print();
	}	
	}
}
