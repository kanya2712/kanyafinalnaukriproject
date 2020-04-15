$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testcase.feature");
formatter.feature({
  "line": 1,
  "name": "Naukri Website",
  "description": "",
  "id": "naukri-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To check whether user can register naukri account",
  "description": "",
  "id": "naukri-website;to-check-whether-user-can-register-naukri-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tc01_Register"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launchs the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user opens the naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter valid details for register",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "submit the register button",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStep.user_launchs_the_chrome_browser()"
});
formatter.result({
  "duration": 15457845500,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.user_opens_the_naukri_homepage()"
});
formatter.result({
  "duration": 3832718300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.enter_valid_details_for_register()"
});
formatter.result({
  "duration": 3086166500,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.submit_the_register_button()"
});
formatter.result({
  "duration": 2536916200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "To check whether user can login naukri account",
  "description": "",
  "id": "naukri-website;to-check-whether-user-can-login-naukri-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@tc02_login"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user already launchs the chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user already opens naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enter \"\u003cEmail Id\u003e\" and \"\u003cpassword\u003e\" to open login page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "submit the login button",
  "keyword": "And "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "naukri-website;to-check-whether-user-can-login-naukri-account;",
  "rows": [
    {
      "cells": [
        "Email Id",
        "password"
      ],
      "line": 21,
      "id": "naukri-website;to-check-whether-user-can-login-naukri-account;;1"
    },
    {
      "cells": [
        "manasaanthireddy34@gmail.com",
        "Manasa@34"
      ],
      "line": 22,
      "id": "naukri-website;to-check-whether-user-can-login-naukri-account;;2"
    },
    {
      "cells": [
        "manasaanthireddy73@gmail.com",
        "Manasa@73"
      ],
      "line": 23,
      "id": "naukri-website;to-check-whether-user-can-login-naukri-account;;3"
    },
    {
      "cells": [
        "manasareddy#gmail.com",
        "manasa"
      ],
      "line": 24,
      "id": "naukri-website;to-check-whether-user-can-login-naukri-account;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "To check whether user can login naukri account",
  "description": "",
  "id": "naukri-website;to-check-whether-user-can-login-naukri-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@tc02_login"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user already launchs the chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user already opens naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enter \"manasaanthireddy34@gmail.com\" and \"Manasa@34\" to open login page",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "submit the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_already_launchs_the_chrome()"
});
formatter.result({
  "duration": 15277107300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_already_opens_naukri_homepage()"
});
formatter.result({
  "duration": 214766300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "manasaanthireddy34@gmail.com",
      "offset": 12
    },
    {
      "val": "Manasa@34",
      "offset": 47
    }
  ],
  "location": "LoginStep.user_enter_and_to_open_login_page(String,String)"
});
formatter.result({
  "duration": 788167000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.submit_the_login_button()"
});
formatter.result({
  "duration": 5779839500,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "To check whether user can login naukri account",
  "description": "",
  "id": "naukri-website;to-check-whether-user-can-login-naukri-account;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@tc02_login"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user already launchs the chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user already opens naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enter \"manasaanthireddy73@gmail.com\" and \"Manasa@73\" to open login page",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "submit the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_already_launchs_the_chrome()"
});
formatter.result({
  "duration": 14732744800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_already_opens_naukri_homepage()"
});
formatter.result({
  "duration": 323357600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "manasaanthireddy73@gmail.com",
      "offset": 12
    },
    {
      "val": "Manasa@73",
      "offset": 47
    }
  ],
  "location": "LoginStep.user_enter_and_to_open_login_page(String,String)"
});
formatter.result({
  "duration": 914219400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.submit_the_login_button()"
});
formatter.result({
  "duration": 5825495300,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "To check whether user can login naukri account",
  "description": "",
  "id": "naukri-website;to-check-whether-user-can-login-naukri-account;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@tc02_login"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user already launchs the chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user already opens naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enter \"manasareddy#gmail.com\" and \"manasa\" to open login page",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "submit the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_already_launchs_the_chrome()"
});
formatter.result({
  "duration": 12968536200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_already_opens_naukri_homepage()"
});
formatter.result({
  "duration": 797635400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "manasareddy#gmail.com",
      "offset": 12
    },
    {
      "val": "manasa",
      "offset": 40
    }
  ],
  "location": "LoginStep.user_enter_and_to_open_login_page(String,String)"
});
formatter.result({
  "duration": 780490100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.submit_the_login_button()"
});
formatter.result({
  "duration": 5743352900,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "To check whether user can go to job search page",
  "description": "",
  "id": "naukri-website;to-check-whether-user-can-go-to-job-search-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@tc03_Advancejobsearchpage"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user already on chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "user go to naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user go to search page and search for the jobs",
  "keyword": "Then "
});
formatter.match({
  "location": "AdvanceJobSearchStep.user_already_on_chrome()"
});
formatter.result({
  "duration": 14235466400,
  "status": "passed"
});
formatter.match({
  "location": "AdvanceJobSearchStep.user_go_to_naukri_homepage()"
});
formatter.result({
  "duration": 588900,
  "status": "passed"
});
formatter.match({
  "location": "AdvanceJobSearchStep.user_go_to_search_page_and_search_for_the_jobs()"
});
formatter.result({
  "duration": 17626929400,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "To check whether user Search Interview questions",
  "description": "",
  "id": "naukri-website;to-check-whether-user-search-interview-questions",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@tc04_InterviewQuestions"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "user is on chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "User opens Naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user enter into companies",
  "keyword": "Then "
});
formatter.match({
  "location": "CompaniesStep.user_is_on_chrome()"
});
formatter.result({
  "duration": 12394558600,
  "status": "passed"
});
formatter.match({
  "location": "CompaniesStep.user_opens_Naukri_homepage()"
});
formatter.result({
  "duration": 459500,
  "status": "passed"
});
formatter.match({
  "location": "CompaniesStep.user_enter_into_companies()"
});
formatter.result({
  "duration": 11771321600,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "To check whether user can open Homecalculator page",
  "description": "",
  "id": "naukri-website;to-check-whether-user-can-open-homecalculator-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@tc05_HomeCalculator"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "user launchs the chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "user enters naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "user enters home calculator page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeCalculatorStep.user_launchs_the_chrome()"
});
formatter.result({
  "duration": 13805425900,
  "status": "passed"
});
formatter.match({
  "location": "HomeCalculatorStep.user_enters_naukri_homepage()"
});
formatter.result({
  "duration": 414900,
  "status": "passed"
});
formatter.match({
  "location": "HomeCalculatorStep.user_enters_home_calculator_page()"
});
formatter.result({
  "duration": 15592028600,
  "status": "passed"
});
});