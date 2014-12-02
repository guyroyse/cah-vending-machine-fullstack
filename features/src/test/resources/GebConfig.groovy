/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver

// Use chrome as the default
// See: http://code.google.com/p/selenium/wiki/ChromeDriver
driver = { new FirefoxDriver() }

environments {

	// run as “gradle -Dgeb.env=chrome cucumber”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}

	// run as “gradle -Dgeb.env=firefox cucumber”
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
	firefox {
		driver = { new FirefoxDriver() }
	}

	// run as “gradle -Dgeb.env=phantomjs cucumber”
	// See: https://github.com/detro/ghostdriver
	phantomjs {
		driver = { new PhantomJSDriver() }
	}

}

baseUrl = "http://localhost:8000/"

baseNavigatorWaiting = true

waiting {
	timeout = 30
	retryInterval = 0.5
}
