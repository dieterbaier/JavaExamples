package dieterbaier.java;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import dieterbaier.java.strategy.Gender;
import dieterbaier.java.strategy.GreetingStrategy;

import org.testng.annotations.Test;

public class StrategyTest {

  @Test
  public void greetFemale() {
    assertThat(GreetingStrategy.instance(Gender.female).great("Smith"), is("Hello Mrs. Smith"));
  }

  @Test
  public void greetMale() {
    assertThat(GreetingStrategy.instance(Gender.male).great("Smith"), is("Hello Mr. Smith"));
  }

  @Test
  public void greetUnknownGender() {
    assertThat(GreetingStrategy.instance(Gender.unknown).great("Smith"), is("Hello Smith"));
  }
}
