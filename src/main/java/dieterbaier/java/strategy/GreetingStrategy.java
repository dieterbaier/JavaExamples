package dieterbaier.java.strategy;

public abstract class GreetingStrategy {

  public static GreetingStrategy instance(final Gender gender) {
    switch (gender) {
      case female:
        return new FemaleGreeter();
      case male:
        return new MaleGreeter();
      default:
        return new UnknownGenderGreeter();
    }
  }

  public String great(final String name) {
    String salutation = getSalutation();
    if (!salutation.isEmpty())
      salutation += " ";
    return new StringBuilder("Hello ").append(salutation).append(name).toString();
  }

  protected abstract String getSalutation();

}
