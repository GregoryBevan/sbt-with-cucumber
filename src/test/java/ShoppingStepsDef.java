import io.cucumber.java8.En;

import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingStepsDef implements En {

    private int budget = 0;

    public ShoppingStepsDef() {
        Given("I have {int} in my wallet", (Integer money) -> budget = money);

        When("I buy {word} with {int}", (String product,Integer price) -> budget -= price);

        Then("I should have {int} in my wallet", (Integer finalBudget) ->
                assertThat(budget).isEqualTo(finalBudget.intValue()));
    }
}
