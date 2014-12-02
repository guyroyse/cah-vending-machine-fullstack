import pages.*

import static cucumber.api.groovy.EN.*

When(~/^I search for '(.*)'$/) { text ->
  at GoogleHomePage
  page.searchFor(text)
}

Then(~/^The Internet does not break$/) { ->
  at GoogleResultsPage
}
