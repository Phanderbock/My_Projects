package separatists;

public class CadBaneBounty {
	public static void main(String[] args) {
	
	Operative.OperativeClass CadBane = new Operative.OperativeClass();{
		CadBane.Name = "Cad Bane";
		CadBane.Points = 105;
		CadBane.Health = 6;
		CadBane.Courage = 3;
		CadBane.Keywords = new String[] {"Jump 1", "Bounty", "Danger Sense 3", "Independent: Dodge 2", 
				"Sharpshooter 1", "Steady"};
		CadBane.WeaponProfiles = new String[] {"Martial Arts", "Dual LL-30 Blaster Pistols"};
		CadBane.UpgradeSlots = new String[] {"Comms", "Gear", "Armament", "Training", "Training", 
				"Grenades"};
		
		CadBane.print();
		}
	}
}