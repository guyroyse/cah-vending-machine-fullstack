package pages

import geb.Page

class GoogleResultsPage extends Page {

	static at = {
		title.endsWith(" - Google Search")
	}

}
