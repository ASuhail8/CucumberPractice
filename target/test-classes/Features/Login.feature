Feature: Application login

Scenario: Home page default login
Given User is on netbanking landing page
When User login into application  with username and passoword
Then Homepage is populated
And Cards are displayed