public class Die{
  private String name;
  private int numOfSides;
  private int currentSideUp;

  public String getName(){
    return name;
  }
  public int getNumOfSides(){
    return numOfSides;
  }
  public void setNumOfSides(int numOfSides){
    name = String.format("d%s", numOfSides);
    this.numOfSides = numOfSides;
  }
  public int getCurrentSideUp(){
    return currentSideUp;
  }
  public void setCurrentSideUp(int currentSideUp){
    this.currentSideUp = currentSideUp;
  }

  public void roll(){
    //System.out.println(String.format("ROLL METHOD: %s\n", (int)((Math.random() * numOfSides) + 1)));
    currentSideUp = (int)((Math.random() * numOfSides) + 1);
  }

  public Die(){
    name = "d6";
    numOfSides = 6;
    roll();
  }

  public Die(int numOfSides){
    name = String.format("d%s", numOfSides);
    this.numOfSides = numOfSides;
    roll();
  }

  public Die(String name, int numOfSides){
    this.name = name;
    this.numOfSides = numOfSides;
    roll();
  }
}
