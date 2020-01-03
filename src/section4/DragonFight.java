package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below)
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragon2.png");		
			JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
	
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		boolean burning=false;
		boolean sheilding=false;
		
		
		
		
		int playerhealth=100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
	int dragonhealth=100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerdamage=0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragondamage=0;
		
		JOptionPane.showMessageDialog(null, "you are going to fight a dragon");
		// 6.  Delete the slashes at the beginning of the next line.  
		//while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
	while(playerhealth>0 && dragonhealth>0) {
		
		
		
		
	
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
	
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String attack=JOptionPane.showInputDialog(null, "do you want to attack with sword, kick, or torch, heal,scream, sheild, mirror");
		// 9. If they typed in "yell":
		if(attack.equals("torch")){
			//-- Find a random number between 0 and 10 and store it in dragonDamage
		dragondamage=new Random().nextInt(10+1);
		dragonhealth-=dragondamage;
		burning=true;
		
		
		
		}
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		if(attack.equals("kick")){
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			dragondamage=new Random().nextInt(26);
			//-- Subtract that number from the dragon's health variable
			dragonhealth-=dragondamage;
		}
		if(attack.equals("sword")){
		dragondamage=new Random().nextInt(50+0);
		dragonhealth-=dragondamage;
		}
		
		if(attack.equals("mirror")){
			
			playerdamage=dragondamage;
			}
		if(attack.equals("shield")){
		sheilding=true;
		}
		if(attack.equals("heal")){
		playerhealth+=10;
				}
		
		if(attack.equals("scream")){
			dragondamage=0;
			dragonhealth-=dragondamage;
			}
	
		if(attack.equals("kill")){
			dragondamage=new Random().nextInt(100)+100;
			dragonhealth-=dragondamage;}
		
		if (burning) {
			dragondamage=10;
		dragonhealth-=dragondamage;
		}
		if(!sheilding) {
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		playerdamage=new Random().nextInt(35+0);
		// 12. Subtract this number from the player's health
		playerhealth-=playerdamage;
		}
		sheilding=false;
		
		// 13. If the user's health is less than or equal to 0
		if (playerhealth<=0){JOptionPane.showMessageDialog(null, "the dragon has killed you");}
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		if (dragonhealth<=0){JOptionPane.showMessageDialog(null, "The dragon is dead");}
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		{JOptionPane.showMessageDialog(null, "player's health "+playerhealth+"   dragon's health "+dragonhealth);}
	}
	}
}
