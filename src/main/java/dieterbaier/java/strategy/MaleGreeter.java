package dieterbaier.java.strategy;

class MaleGreeter extends GreetingStrategy {

  @Override
  protected String getSalutation() {
    return "Mr.";
  }

}
