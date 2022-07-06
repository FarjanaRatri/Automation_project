Feature: User is able to login with valid username & password

Description: "User login to zoopla website and verify login"

 
 @regression
Scenario Outline: User login with valid username and verify page title
Given User can open any browser 
And User is able to enter "https://www.zoopla.co.uk/" url
When User clicks on the Login in botton
And user enters email "<email>" and password "<password>"
And User clicks on Sign in botton
Then User is able to verify successful login & verify page title

Examples:
|  username              | password |
| ferdausi2830@gmail.com |  123456  |
| ferdausi2830           |  123456  |    
| ferdausi2830@gmail.com |  12345   |
| ferdausi2830@gmail.com |  1234567  |
| ferdausi2830@gmail.com |  12345678 |
| ferdausi2830@gmail.com |  123456789|
| ferdausi2830@gmail.com |  123456789ABCDE|
| ferdausi2830@gmail.com |  123456789ABCDEF|
| ferdausi2830@gmail.com |  123456789ABCDEFG|

