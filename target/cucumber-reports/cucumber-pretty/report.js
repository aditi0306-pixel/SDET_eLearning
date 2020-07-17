$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("eLearning_teacher.feature");
formatter.feature({
  "line": 2,
  "name": "This feature is to automate the registeration",
  "description": "I want to register to the site",
  "id": "this-feature-is-to-automate-the-registeration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ELearningteacher"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "To verify if application allows to create teacher user",
  "description": "",
  "id": "this-feature-is-to-automate-the-registeration;to-verify-if-application-allows-to-create-teacher-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Registeration1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open the browser and enter the URL",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#\"http://elearningm1.upskills.in/\""
    }
  ],
  "line": 9,
  "name": "I enter the username and password",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#Then I enter the username \"aditi123\" and password \"Aditi@123\""
    }
  ],
  "line": 11,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "elearning_teacher.i_open_the_browser_and_enter_the_URL()"
});
formatter.result({
  "duration": 16635192400,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_enter_the_username_and_password()"
});
formatter.result({
  "duration": 422904700,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_click_on_Login_button()"
});
formatter.result({
  "duration": 5408043000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Creating selenium course for students",
  "description": "",
  "id": "this-feature-is-to-automate-the-registeration;creating-selenium-course-for-students",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@CreatingCourse1"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I click on  \u0027Create a course\u0027 link after login",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "#Then I enter valid credentials in Course name textbox \"Selen191413\""
    }
  ],
  "line": 17,
  "name": "I enter valid credentials in Course name textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I click on Advance Settings Button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I select valid credentials from Category list box",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#Then I enter valid credentials in Course code text box \"se10911413\""
    }
  ],
  "line": 21,
  "name": "I enter valid credentials in Course code text box",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I select valid credentials from Language list box",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I click on Create this course button",
  "keyword": "Then "
});
formatter.match({
  "location": "elearning_teacher.i_click_on_Create_a_course_link_after_login()"
});
formatter.result({
  "duration": 1481537700,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_enter_valid_credentials_in_Course_name_textbox()"
});
formatter.result({
  "duration": 265240100,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_click_on_Advance_Settings_Button()"
});
formatter.result({
  "duration": 84874300,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_select_valid_credentials_from_Category_list_box()"
});
formatter.result({
  "duration": 4136597000,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_enter_valid_credentials_in_Course_code_text_box()"
});
formatter.result({
  "duration": 209476500,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_select_valid_credentials_from_Language_list_box()"
});
formatter.result({
  "duration": 105307700,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_click_on_Create_this_course_button()"
});
formatter.result({
  "duration": 5094148300,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Giving the content to selenium course",
  "description": "",
  "id": "this-feature-is-to-automate-the-registeration;giving-the-content-to-selenium-course",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@CourseContent1"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "I click on Add an introduction icon",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 28,
      "value": "#Then I give valid credentials in the textbox \"This is a Selenium Project\""
    }
  ],
  "line": 29,
  "name": "I give valid credentials in the textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "elearning_teacher.i_click_on_Add_an_introduction_icon()"
});
formatter.result({
  "duration": 1762784600,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_give_valid_credentials_in_the_textbox()"
});
formatter.result({
  "duration": 10786056400,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_click_on_Save_button()"
});
formatter.result({
  "duration": 1941609700,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Adding objectives and topics to the selenium course",
  "description": "",
  "id": "this-feature-is-to-automate-the-registeration;adding-objectives-and-topics-to-the-selenium-course",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@ObjectiveTopics1"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "I click on Course Description icon",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "I click on Description icon",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 36,
      "value": "#Then I enter valid credentials in Title textbox \"Selenium course for beginners\""
    },
    {
      "line": 37,
      "value": "#And I enter valid credentials in Content textbox \"Selenium course for beginners\""
    }
  ],
  "line": 38,
  "name": "I enter valid credentials in Title textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I enter valid credentials in Content textbox",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on Objectives icon",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "I enter valid credentials in Title textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "I enter valid credentials in Content textbox",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I click on Topics icon",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "I enter valid credentials in Title textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "I enter valid credentials in Content textbox",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "elearning_teacher.i_click_on_Course_Description_icon()"
});
formatter.result({
  "duration": 4033395200,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_click_on_Description_icon()"
});
formatter.result({
  "duration": 2986590500,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_enter_valid_credentials_in_Title_textbox()"
});
formatter.result({
  "duration": 845541900,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_enter_valid_credentials_in_Content_textbox()"
});
formatter.result({
  "duration": 10613811700,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_click_on_save_button()"
});
formatter.result({
  "duration": 2487838300,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_click_on_Objectives_icon()"
});
formatter.result({
  "duration": 1381993400,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_enter_valid_credentials_in_Title_textbox()"
});
formatter.result({
  "duration": 389909900,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_enter_valid_credentials_in_Content_textbox()"
});
formatter.result({
  "duration": 10651968700,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_click_on_save_button()"
});
formatter.result({
  "duration": 2143089700,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_click_on_Topics_icon()"
});
formatter.result({
  "duration": 1828260600,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_enter_valid_credentials_in_Title_textbox()"
});
formatter.result({
  "duration": 370366900,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_enter_valid_credentials_in_Content_textbox()"
});
formatter.result({
  "duration": 10558539000,
  "status": "passed"
});
formatter.match({
  "location": "elearning_teacher.i_click_on_save_button()"
});
formatter.result({
  "duration": 2109617200,
  "status": "passed"
});
});