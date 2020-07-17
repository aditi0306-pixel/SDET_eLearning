@ELearning
Feature: This feature is to automate the registeration
  I want to register to the site
  
 @Registeration
    Scenario: To verify if application allows to create user
     Given I open the browser and enter the URL "http://elearningm1.upskills.in/"
     Then I enter the username "aditi123" and password "Aditi@123"
     And I click on Login button
     
 @CreatingCourse
    Scenario: Creating Finance course for students
     Given I click on  'Create a course' link after login
	   Then I enter valid credentials in Course name textbox "Sel11113"
	   Then I click on Advance Settings Button
	   Then I select valid credentials from Category list box
	   Then I enter valid credentials in Course code text box "s011113"
	   Then I select valid credentials from Language list box
	   Then I click on Create this course button
	   
 @CourseContent
    Scenario: Giving the content to Finance course
     Given I click on Add an introduction icon
     Then I give valid credentials in the textbox "This is a Selenium Project"
     And I click on Save button
     
 @ObjectiveTopics
    Scenario: Adding objectives and topics to the course
     When I click on Course Description icon
     And I click on Description icon
     Then I enter valid credentials in Title textbox "Selenium course for beginners"
     And I enter valid credentials in Content textbox "Selenium course for beginners" 
     And I click on save button
     When I click on Objectives icon
      Then I enter valid credentials in Title textbox "Selenium course for beginners"
     And I enter valid credentials in Content textbox "Selenium course for beginners"
     And I click on save button
     Then I click on Topics icon
      Then I enter valid credentials in Title textbox "Selenium course for beginners"
     And I enter valid credentials in Content textbox "Selenium course for beginners"
     And I click on save button
     
     
	   