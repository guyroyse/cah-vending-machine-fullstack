package pages

import geb.Page

class VendingMachinePage extends Page {

	static url = "/"

	static at = {
		title == "Vending Machine"
	}

	static content = {
		display { $("#display") }
		coinReturn { $("#coinReturn") }
		coin { $("#coin") }
		insertCoin { $("#insertCoin") }
	}

	def displays(value) {
		display.text() == value
	}

	def coinReturnIsEmpty() {
		coinReturn.children().size() == 0
	}

}
