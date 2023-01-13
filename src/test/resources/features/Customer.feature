Feature: Validate Customer page

  Background:
    Given User is on Serenity page "https://demo.serenity.is/"
    When User enters username as "admin" and password as "serenity"
    Then User should be on "Dashboard" page

  Scenario: Validate filter by search
    Given User is on Serenity page "https://demo.serenity.is/Northwind/Customer"
    When User write "sdasd" into search box
    Then User should see the following information in the table
      | ID    | Company Name             | Contact Name | Contact title  | Region          | Postal Code | Country | City  | Phone      | Fax          | Representatives |
      | C0001 | 234324234"""$$"#%$%"#4 & | asdasdasd    | 35434534535345 | 3fghfghfghgfhgf | 5874122     | Denmark | Århus | adadadsasd | asdasdasddas | Anne Dodsworth  |
