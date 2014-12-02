package pages

import geb.Page

class GoogleHomePage extends Page {

	static url = "/"

	static at = {
		title == "Google"
	}

	static content = {
		searchField(wait: true) { $('input[name="q"]') }
		searchButton(wait: true) { $('input[name="btnK"]') }
	}

	def searchFor(query) {
		this.searchField.value(query)
		this.searchButton.click()
	}

}
