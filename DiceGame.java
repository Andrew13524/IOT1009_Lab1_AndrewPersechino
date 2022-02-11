// Andrew Persechino
// A00228632
// IOT1009 -  Mobile Application Development

public class DiceGame{
  public static void main(String[] args) {
    System.out.println("\nCreating a default d6...\n");
    Die d6 = new Die();
    System.out.println("Creating a d20...\n");
    Die d20 = new Die(20);
    System.out.println("Creating percentile die (a special d10)...\n");
    Die d10 = new Die("d10", 10);

    System.out.println(String.format("The current side up for d6 is %s\n", d6.getCurrentSideUp()));
    System.out.println(String.format("The current side up for d20 is %s\n", d20.getCurrentSideUp()));
    System.out.println(String.format("The current side up for Percentile is %s\n", d10.getCurrentSideUp()));

    System.out.println("\nTesting roll method\n\n");

    System.out.println("Rolling the d6...\n");
    d6.roll();
    System.out.println(String.format("The new value is %s\n", d6.getCurrentSideUp()));

    System.out.println("Rolling the d20...\n");
    d20.roll();
    System.out.println(String.format("The new value is %s\n", d20.getCurrentSideUp()));

    System.out.println("Rolling the Percentile...\n");
    d10.roll();
    System.out.println(String.format("The new value is %s\n\n", d10.getCurrentSideUp()));

    System.out.println("Setting the d20 to show 20...\n");
    d20.setCurrentSideUp(20);
    System.out.println(String.format("The side up is %s.\n\n", d20.getCurrentSideUp()));

    System.out.println("Creating 5 d6...\n");
    Die[] diceArray = new Die[5];
    for(int i = 0; i < diceArray.length; i++){
      diceArray[i] = new Die();
    }

    boolean notYahtzee = true;
    int count = 0;
    while(notYahtzee){
      count++;
      notYahtzee = false;
      for(int i = 0; i < diceArray.length; i++){
        diceArray[i].roll();
      }
      int value = diceArray[0].getCurrentSideUp();
      for(int i = 1; i < diceArray.length; i++){
        if(diceArray[i].getCurrentSideUp() != value){
          notYahtzee = true;
        }
      }
    }
    System.out.println(String.format("YAHTZEE! It took %s rolls.", count));
  }
}
