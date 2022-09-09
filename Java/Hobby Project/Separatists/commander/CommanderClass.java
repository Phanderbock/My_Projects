package commander;

import java.lang.reflect.Field;
import java.util.Arrays;

public class CommanderClass {
	
	static class Commander{
		public String Name;
		public int Points;
		public int Health;
		public int Courage;
		public String[] Keywords;
		public String[] WeaponProfiles;
		public String[] UpgradeSlots;
		
		@Override
		public String toString() {
		  return getClass().getSimpleName() + "[name=" + Name + "]";
		}
		
		public void print() {
			System.out.println(Name);
			System.out.println("Points: " + Points);
			System.out.println("Health: " + Health + " Courage: " + Courage);
			System.out.println("Keywords: " + Arrays.toString(Keywords));
			System.out.println("Weapon Profiles: " + Arrays.toString(WeaponProfiles));
			System.out.println("Upgrades: " + Arrays.toString(UpgradeSlots));
			
		}
		
	}
	
	public String toString() {
		  StringBuilder result = new StringBuilder();
		  String newLine = System.getProperty("line.separator");

		  result.append( this.getClass().getName() );
		  result.append( " Object {" );
		  result.append(newLine);

		  //determine fields declared in this class only (no fields of superclass)
		  Field[] fields = this.getClass().getDeclaredFields();

		  //print field names paired with their values
		  for ( Field field : fields  ) {
		    result.append("  ");
		    try {
		      result.append( field.getName() );
		      result.append(": ");
		      //requires access to private field:
		      result.append( field.get(this) );
		    } catch ( IllegalAccessException ex ) {
		      System.out.println(ex);
		    }
		    result.append(newLine);
		  }
		  result.append("}");

		  return result.toString();
		}
}	
