import pages.*

import static cucumber.api.groovy.EN.*

Then(~/^It is awesome$/) { ->
  at GrumpifyHomePage
  assert page.header.text() == "Awesome App is Awesome"
}
