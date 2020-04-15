Feature: Naukri Website

@tc01_Register
Scenario: To check whether user can register naukri account
          
          Given user launchs the chrome browser
          When user opens the naukri homepage 
          Then enter valid details for register
          Then submit the register button


@tc02_login
Scenario Outline: To check whether user can login naukri account
          
          Given user already launchs the chrome 
          When user already opens naukri homepage
          Then user enter "<Email Id>" and "<password>" to open login page
          And submit the login button 
          
Examples: 
                        |Email Id                         |password          |
                        |manasaanthireddy34@gmail.com     |Manasa@34         |      
                        |manasaanthireddy73@gmail.com     |Manasa@73         |
                        |manasareddy#gmail.com            |manasa            |
                       
@tc03_Advancejobsearchpage
Scenario: To check whether user can go to job search page
          
          Given user already on chrome
          When user go to naukri homepage
          Then user go to search page and search for the jobs
          
@tc04_InterviewQuestions
Scenario: To check whether user Search Interview questions
          
          Given user is on chrome
          When User opens Naukri homepage
          Then user enter into companies
  
@tc05_HomeCalculator
Scenario: To check whether user can open Homecalculator page

          Given user launchs the chrome
          When user enters naukri homepage
          Then user enters home calculator page