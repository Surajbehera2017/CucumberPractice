Feature: UPM Login

# Data driven testing can be achieved using the scenarioOutlne\Example
  @tag1
  Scenario Outline: Title of your scenario
    Given The browser is opened
    When I enter the "<Uname>" and "<Pwd>"
    Then The UPM homescreen should open

    Examples: 
      | Uname  | Pwd    |
      | Suraj  | behera |
      | Uname2 | pwd2   |

# Data can be kept near o the step to make it more readable, using the List<List<String>> keyword. 
  @tag2
  Scenario: Title of your scenario
    Given The browser is opened
    When I enter the Username and password
      | Uname1 | pwd1 |
      | Uname2 | pwd2 |
    Then The UPM homescreen should open


# Data can be kept near o the step to make it more readable, using the class to keep all related data/collumn name should be same as  the class member(Variable)
  @tag3
  Scenario: Title of your scenario
    Given The browser is opened
    When I enter the credentials and login
      | userName | password |
      | Uname1   | pwd1     |
      | Uname2   | pwd2     |
    Then The UPM homescreen should open
