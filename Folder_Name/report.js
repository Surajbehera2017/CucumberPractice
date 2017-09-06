$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Selenium/Mars_Wrkspace/Cucumber/src/Cucumber_Feature/UPM.feature");
formatter.feature({
  "line": 1,
  "name": "UPM Login",
  "description": "",
  "id": "upm-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Title of your scenario",
  "description": "",
  "id": "upm-login;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "The browser is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the Username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The UPM homescreen should open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef1.the_browser_is_opened()"
});
formatter.result({
  "duration": 105944206,
  "status": "passed"
});
formatter.match({
  "location": "stepdef1.i_enter_the_Username_and_password()"
});
formatter.result({
  "duration": 79617,
  "status": "passed"
});
formatter.match({
  "location": "stepdef1.the_UPM_homescreen_should_open()"
});
formatter.result({
  "duration": 65311,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Title of your scenario",
  "description": "",
  "id": "upm-login;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "The browser is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I enter the Username and password",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "The UPM homescreen should open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef1.the_browser_is_opened()"
});
formatter.result({
  "duration": 56291,
  "status": "passed"
});
formatter.match({
  "location": "stepdef1.i_enter_the_Username_and_password()"
});
formatter.result({
  "duration": 44474,
  "status": "passed"
});
formatter.match({
  "location": "stepdef1.the_UPM_homescreen_should_open()"
});
formatter.result({
  "duration": 50071,
  "status": "passed"
});
});