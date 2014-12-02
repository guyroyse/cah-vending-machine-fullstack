import pages.*

import static cucumber.api.groovy.EN.*

Then(~/^I am on the Google Home page$/) { ->
  at GoogleHomePage
}
