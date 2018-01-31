package org.itstep;

import org.itstep.model.Account;
import org.itstep.service.ClientImitator;
import org.openqa.selenium.WebDriver;

public class ClickerLauncher {

	public static void main(String[] args) {

		Account acc = new Account("Varfolomey", "Visilovich", "Varfolich@gmail.com", "Varfolichent");

		ClientImitator imitator = new ClientImitator();

		WebDriver driver = imitator.loginAmazonAccount(acc);

    }
}
