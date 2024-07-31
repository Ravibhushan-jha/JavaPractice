package Interview.FactoryPattern;

abstract class Plan {
  protected Double rate;

  abstract void getRate();

  public void caculate(int units){
      System.out.println(" Total Bill : "+ units*rate);
  }
}
