import pages.*

import static cucumber.api.groovy.EN.*

Given(~/^I am on the Vending Machine Page$/) { ->
  to VendingMachinePage
}

Then(~/^The display shows (.*)$/) { display ->
  assert page.displays(display)
}

Then(~/^The coin return has no coins$/) { ->
  assert page.coinReturnIsEmpty()
}

When(~/^I insert a (.*)$/) { coin ->
  page.coin.value coin
  page.insertCoin.click()
}

When(~/^I insert an invalid coin$/) { ->
  assert false
}

Then(~/^The coin return has the invalid coin$/) { ->
  assert false
}
