package com.obsqura.assignmentswithpom;

import org.testng.annotations.Test;

import seleniumpages.CheckBoxAndRadioButtonPage;

public class CheckBoxAndRadioButtonTest extends BaseSelenium {
	CheckBoxAndRadioButtonPage checkBoxAndRadioButtonPageObj;
	@Test
	public void checkAndVerifyRedCheckBoxIsEnabled() {
		checkBoxAndRadioButtonPageObj = new CheckBoxAndRadioButtonPage(driver);
		checkBoxAndRadioButtonPageObj.verifyRedCheckBoxIsEnabled();
	}
	@Test
	public void checkAndVerifyRedCheckBoxIsSelected() {
		checkBoxAndRadioButtonPageObj = new CheckBoxAndRadioButtonPage(driver);
		checkBoxAndRadioButtonPageObj.verifyRedCheckBoxIsSelected();
	}
	@Test
	public void checkAndVerifyOperaRadioBoxIsSelected() {
		checkBoxAndRadioButtonPageObj = new CheckBoxAndRadioButtonPage(driver);
		checkBoxAndRadioButtonPageObj.verifyOperaRadioBoxIsSelected();
	}
}
