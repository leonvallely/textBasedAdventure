/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedadventure;
import java.util.*;
import java.lang.*;

/**
 *
 * @author LVallely
 */
public class TextBasedAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String decision1, decision2, decision3, decision4, decision5;
       
        int status, deaths;
        status = 1;
        deaths = 0;
        
        while (status == 1){
            System.out.println("You're walking in the woods"+"\n"+"There's no one around and your phone is dead"+
                "\n" +"Out of the corner of your eye, you spot him.." + "\n" + "Shia Lebeouf.");
            System.out.println("He follows you, gets down on all fours and sprints after you, what do you do?" + "\n" + "You can look for your car, run for your life or fight him.");
            decision1 = input.nextLine();
            decision1 = decision1.toUpperCase();
            decision1 = decision1.trim();
            if (decision1.contains("CAR")) {
                System.out.println("You cannot find you car, you are dead."+"\n"+"//////////////////////////");
                status = 1;
                deaths = deaths+1;
            
            } else if (decision1.contains("RUN")) {
                System.out.println("You flee successfully. Shia Lebeouf is brandishing a knife." + "\n" +"He's lurking in the shadows. It's actual Cannibal Shia Lebeouf!" +"\n"
                + "Shia likes to kill for sport, you see. Eating all the bodies that he may find." + "\n" + "You've lost him, but now you're lost yourself... Stranded with a murderer. You can either Creep silently through the underbrush,"+"\n"
                        +"Continue through the woods or look for him with a stick you found on the floor.");
                status = 2;
                
            } else if (decision1.contains("FIGHT")) {
                System.out.println("You swing your fist towards him only for him to catch your hand and crush it with his own, you cry out in pain whilst he stares you to insanity."+"\n"+
                        "All you know now is that you're dead. Or insane to the ponint where you think you're dead."+"\n"+"//////////////////////////");
                status = 1;
                deaths = deaths+1;
            } else {
                System.out.println("That is not a valid action, please try again."+"\n"+"//////////////////////////");
                status = 1;
            }
            while (status == 2){
                decision2 = input.nextLine();
                decision2 = decision2.toUpperCase();
                decision2 = decision2.trim();
                
                if (decision2.contains("UNDERBRUSH")||decision2.contains("SNEAK")){
                    System.out.println("Aha! In the distance you find a cottage that you can go to!"+"\n"+"You head on over to the door but your leg gets caught in a bear trap!"+"\n"+
                        "You escape with merely a limp. You get to the door and open it... Shia Lebeouf is sitting in a chair in the middle of the room."+"\n"+"You can either"
                        + " walk out the door or sneak up behind him.");
                    status = 3;
                    } else if (decision2.contains("WOODS")){
                        System.out.println("You continue through the woods, a squirrel scruttles past, startling you! Within the panic you feel a sharp pain within your stomach,"+ "\n"+
                        "you look down only to see the end of a knife as you slip into unconsciousness. You are dead."+"\n"+"//////////////////////////");
                        status = 1;
                        deaths = deaths+1;
                    } else if (decision2.contains("LOOK")){
                        System.out.println("You look around, look behind trees, look everywhere. He is nowhere to be seen. You decide"+"\n"+
                                "to give up. Just as you are walking to what seems to be the exit of the forest, he appears."+"\n"+
                                "In such shock, you have a heart attack and fall to the ground, you are dead."+"\n"+"//////////////////////////");
                        status = 1;
                        deaths = deaths+1;
                    } else {
                        System.out.println("That is not a valid action, please try again."+"\n"+"//////////////////////////");
                        status = 2;
                    }
                    }
                    while (status == 3){
                        decision3 = input.nextLine();
                        decision3 = decision3.toUpperCase();
                        decision3 = decision3.trim();
                        if (decision3.contains("DOOR")){
                            System.out.print("You decide to walk out the door, just as you are about to turn the handle, the door flies open and slams you in the face."+"\n"+
                                    "You are knocked to the ground, and as you are about to stand up, your vision turns black, Shia Lebeouf has killed you."+"\n"+"//////////////////////////");
                            deaths = deaths+1;
                            status = 1;
                        }
                        else if (decision3.contains("SNEAK")){
                            System.out.println("You sneak up behind him and start to strangle him, you're both struggling for your lives. Shia pulls out a knife,"+"\n"+
                                    " you start to wrestle it from him. There's not much time, you have to choose to either defend yourself from the knife, try and take it from him"+"\n"+
                                    " or attempt to run away!");
                            status = 4;
                        } else {
                            System.out.println("That is not a valid action, please try again."+"\n"+"//////////////////////////");
                            status = 3;
                        
                        }
                        while (status == 4){
                            decision4 = input.nextLine();
                            decision4 = decision4.toUpperCase();
                            decision4 = decision4.trim();
                            if (decision4.contains("DEFEND")){
                                System.out.print("You attempt to defend yourself from the knife that Shia wields. Within the struggle of it, he catches your stomach with it as you"+"\n"+
                                "slip into darkness... You are dead."+"//////////////////////////");
                                status = 1;
                                deaths = deaths+1;
                            }
                            else if (decision4.contains("TAKE")){
                                System.out.print("You go for the knife, within the struggle you are successful and stab him directly in the kidney!"+"\n"
                                        + "You are safe at last from Shia Lebeouf!"+"\n"+
                                        "You limp into the woods. You've beaten Shia Lebeouf..."+"\n"+
                                        "WAIT! HE'S STILL ALIVE! SHIA SURPRISE!"+"\n"+
                                        "There's a gun to your head and death in his eyes."+"\n"+
                                        "But you can do Jiu Jitsu so you have a choice: you can fight him, attempt to slash him with the knife"+"\n"+
                                        "or you can attempt to run away with a chance to be shot.");
                                status = 5;
                            } else {
                                System.out.print("That is not a valid action, please try again."+"//////////////////////////");
                                status = 4;
                            }
                            while (status == 5){
                                decision5 = input.nextLine();
                                decision5 = decision5.toUpperCase();
                                decision5 = decision5.trim();
                                if (decision5.contains("FIGHT")){
                                    System.out.print("Because of your insane Jiu Jitsu skills, you knock the gun out of his hand and body slam him to the floor!"+"\n"+
                                            "You're having a legendary fight with Shia Lebeouf! But it's a normal tuesday night for Shia Lebeouf..."+"\n"+
                                            "You try to swing a very conveniently placed Axe at Shia Lebeouf but due to the immense amount of pain in your leg he is able to dodge every swing!"+"\n"+
                                            "He parries to the left and you counter to the right! You catch him in the neck. You're chopping of his head now..."+"\n"+
                                            "You just decapitated hollywood superstar Shia Lebeouf!!!"+"\n"+
                                            "You fall to your knees and catch your breath."+"\n"+
                                            "You're finally safe from Shia Lebeouf..."+"\n"+"\n"+"You have died "+deaths+" times");
                                    
                                    
                                }
                                else if (decision5.contains("KNIFE")){
                                    System.out.print("You aim for his stomach with your knife, he catches your wrist with his hand and slams you to the ground. You are dead."+"\n"+"//////////////////////////");
                                    deaths = deaths + 1;
                                }
                                else if (decision5.contains("RUN")){
                                    System.out.print("You attempt to run away only to be shot in the back. You are dead"+"\n"+"//////////////////////////");
                                    deaths = deaths +1;
                                } else {
                                System.out.print("That is not a valid action, please try again."+"//////////////////////////");
                                status = 5;
                                    
                                }
                            }
                                
                                
                            }
                        }
                    }
                
                
            }
        }
// THIS GAME IS BASED ON A SONG CALLED 'ACTUAL CANNIBAL SHIA LEBEOUF', MY IMAGINATION IS NOT INSANE, ANDREW, HONEST...