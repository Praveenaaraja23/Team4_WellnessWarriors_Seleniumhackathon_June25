Feature: Non-Functional Testing - Home Page

@Launch_pageload
  Scenario: Homepage loads within acceptable time
    Given User is in browser
    When The Users is on SweetBalance homepage
    Then Page should be fully loaded within 3 seconds

#@Launch_read
  #Scenario: Homepage is responsive
    #Given The Users is on SweetBalance homepage
    #Then All elements should be readable and accessible without horizontal scrolling
#
#@Launch_labels
  #Scenario: Homepage maintains accessibility standards
    #Given The Users is on SweetBalance homepage
    #Then All major sections should be accessible with appropriate labels and alt texts
#
#@Launch_design
  #Scenario: Website is visually appealing
    #Given The Users is on SweetBalance homepage
    #Then User should find the design visually appealing and readable
#
#@Launch_access
  #Scenario: Navigation bar remains accessible
    #Given The Users is on SweetBalance homepage
    #Then User should be able to access other sections without scrolling up
#
#@Launch_allbrowser
  #Scenario: Website supports all browsers
    #Given The Users is on SweetBalance homepage
    #Then User should have a consistent experience across browsers