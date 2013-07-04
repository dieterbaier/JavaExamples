package dieterbaier.java.strategy;

class UnknownGenderGreeter extends GreetingStrategy {

  @Override
  protected String getSalutation() {
    return "";
  }

}
