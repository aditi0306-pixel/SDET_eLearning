@ELearningteacher
Feature: This feature is to automate the registeration
  I want to register to the site
  
 @Registeration1
    Scenario: To verify if application allows to create teacher user
     Given I open the browser and enter the URL 
     Then I enter the username and password
     And I click on Login button
     
 @CreatingCourse1
    Scenario: Creating selenium course for students
     Given I click on  'Create a course' link after login
	   Then I enter valid credentials in Course name textbox
	   Then I click on Advance Settings Button
	   Then I select valid credentials from Category list box
	   Then I enter valid credentials in Course code text box
	   Then I select valid credentials from Language list box
	   Then I click on Create this course button
	   
 @CourseContent1
    Scenario: Giving the content to selenium course
     Given I click on Add an introduction icon
     Then I give valid credentials in the textbox
     And I click on Save button
     
 @ObjectiveTopics1
    Scenario: Adding objectives and topics to the selenium course
     When I click on Course Description icon
     And I click on Description icon 
     Then I enter valid credentials in Title textbox 
     And I enter valid credentials in Content textbox 
     And I click on save button
     When I click on Objectives icon
      Then I enter valid credentials in Title textbox 
     And I enter valid credentials in Content textbox
     And I click on save button
     Then I click on Topics icon
      Then I enter valid credentials in Title textbox 
     And I enter valid credentials in Content textbox
     And I click on save button
     
     
	   