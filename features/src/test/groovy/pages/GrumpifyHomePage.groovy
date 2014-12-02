package pages

import geb.Page

class GrumpifyHomePage extends Page {

	static url = "/"

	static at = {
		title == "Awesome App"
	}

	static content = {
		header { $("#header") }
	}

}
