package dieterbaier.java.strategy;

class FemaleGreeter extends GreetingStrategy {

  @Override
  protected String getSalutation() {
    return "Mrs.";
  }
}
