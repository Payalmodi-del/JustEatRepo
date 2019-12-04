$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_Workspace/JustEatWithBDD_Payal/src/main/java/features/JustEat.feature");
formatter.feature({
  "line": 1,
  "name": "Use the website to find restaurants",
  "description": "         So that I can order food\r\n         As a hungry customer\r\n          I want to be able to find restaurants in my area",
  "id": "use-the-website-to-find-restaurants",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Search for restaurants in an area",
  "description": "",
  "id": "use-the-website-to-find-restaurants;search-for-restaurants-in-an-area",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I want food in \"AR51 1AA\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I search for restaurants",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see some restaurants in \"AR51 1AA\"",
  "keyword": "Then "
});
formatter.match({
  "location": "JustEatStepDefiniion.I_want_food_in_location()"
});
formatter.result({
  "duration": 14507463000,
  "status": "passed"
});
formatter.match({
  "location": "JustEatStepDefiniion.I_search_for_restaurants()"
});
formatter.result({
  "duration": 10768531500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AR51 1AA",
      "offset": 34
    }
  ],
  "location": "JustEatStepDefiniion.i_should_see_some_restaurants_in_given_location(String)"
});
formatter.result({
  "duration": 11381295099,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Entering wrong postcode",
  "description": "",
  "id": "use-the-website-to-find-restaurants;entering-wrong-postcode",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I want food at \"L6Y 4P9\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on send button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "it gives an error message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "L6Y 4P9",
      "offset": 16
    }
  ],
  "location": "JustEatStepDefiniion.i_want_food_at_location(String)"
});
formatter.result({
  "duration": 5555201200,
  "status": "passed"
});
formatter.match({
  "location": "JustEatStepDefiniion.i_click_on_send_button()"
});
formatter.result({
  "duration": 215380100,
  "status": "passed"
});
formatter.match({
  "location": "JustEatStepDefiniion.it_gives_an_error_message()"
});
formatter.result({
  "duration": 873900499,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Find Help",
  "description": "",
  "id": "use-the-website-to-find-restaurants;find-help",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I am on Just-Eat website",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I click on Help button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I lend on Help page",
  "keyword": "Then "
});
formatter.match({
  "location": "JustEatStepDefiniion.i_am_on_Just_Eat_website()"
});
formatter.result({
  "duration": 6440447900,
  "status": "passed"
});
formatter.match({
  "location": "JustEatStepDefiniion.i_click_on_Help_button()"
});
formatter.result({
  "duration": 2373580699,
  "status": "passed"
});
formatter.match({
  "location": "JustEatStepDefiniion.i_lend_on_Help_page()"
});
formatter.result({
  "duration": 823639800,
  "status": "passed"
});
});