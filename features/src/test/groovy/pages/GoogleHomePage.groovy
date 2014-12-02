package pages

import geb.Page

class GoogleHomePage extends Page {

	static url = "/"

	static at = {
		title == "Google"
	}

}
