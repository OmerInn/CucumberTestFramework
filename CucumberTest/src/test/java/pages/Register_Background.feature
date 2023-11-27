Feature: Register Test

  Background:
    Given Navigate to Website Register
    And click Sign in button
    And  type email "dellpc62@gmail.com"
    And click on Create an Account button

  Scenario: Kişi 1
    And type firstname "Omer" and lastname "Tanımaz"
    And type password "omer123"


  Scenario: Kisi 2
    And type firstname "Asıf" and lastname "Mermer"
    And type password "asf123"
  Scenario Outline: Kisi 3

    And type firstname "<isim>" and lastname "<soyisim>"
    And type password "<sifre>"

    Examples:
      | isim | soyisim | sifre |
      |Mustafa|Ozdemir |1234   |
      |Fatih  |Armağan | 4567  |