$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/filter.feature");
formatter.feature({
  "name": "to check filter option in homebase",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature7"
    }
  ]
});
formatter.scenario({
  "name": "To check one filter and clear it",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature7"
    }
  ]
});
formatter.step({
  "name": "launch the browser for checking filter",
  "keyword": "Given "
});
formatter.match({
  "location": "Homebaselogin.launch_the_browser_for_checking_filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "launch the url for filter checking",
  "keyword": "And "
});
formatter.match({
  "location": "Homebaselogin.launch_the_url_for_filter_checking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click furniture option and dining table option",
  "keyword": "When "
});
formatter.match({
  "location": "Homebaselogin.click_furniture_option_and_dining_table_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click colour filter option",
  "keyword": "And "
});
formatter.match({
  "location": "Homebaselogin.click_colour_filter_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clcik remove filter option",
  "keyword": "And "
});
formatter.match({
  "location": "Homebaselogin.clcik_remove_filter_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the url after checking",
  "keyword": "Then "
});
formatter.match({
  "location": "Homebaselogin.close_the_url_after_checking()"
});
formatter.result({
  "status": "passed"
});
});