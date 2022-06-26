
@AllCode
Feature: LC Waikiki

//  @Register
 // Scenario Outline: Registering New Member
 // Given Controlling on the Sign Up Page
 // When type Email "<email>"
 // When type Password "<password>"
 // When type phone number "<phonenumber>"
 // When click agreement checkbox
 // When click Sign Up button

 //   Examples:
 //       | email                    | password        | phonenumber    |
 //      | oykunihansahin@gmail.com | oyku.22ocak1997 |5064370622|

    @Login
      Scenario Outline: Login with email and password
      Given Controlling on the Login Page and text "<email>" and "<password>"
      When click login button
      Then should see HomePage
      Examples:
        | email                    | password   |
        | oykunihansahin@gmail.com | oyku.22ocak1997|




  @ChoosingBlouseModals
  Scenario Outline: Choosing Woman Blouse Modals
    Given Controlling on the Home Page and text "<email>" and "<password>"
    When hover "<Category>" text and click "<Product>" text
    Then should see Blouse Modals Page
    Examples:
      |email                    |password        |Category | Product   |
      |oykunihansahin@gmail.com |oyku.22ocak1997 | KADIN   | Bluz      |

  @Filtering
  Scenario Outline: Filtering Woman Black Blouse Modals
    Given Controlling "<Category>" "<Product>" Modals Page and text "<email>" and "<password>"
    When click "<Color>" filter
    When click first product
    Then should see Product Page
    Examples:
      |email                    |password        |Category |Product |Color|
      |oykunihansahin@gmail.com |oyku.22ocak1997 |KADIN    |Bluz    |Siyah|

  @ChoosingSize
  Scenario Outline: Choosing Size
    Given Controlling "<Category>" "<Product>" "<Color>" Product Page and text "<email>" and "<password>"
    When click "<Size>" size
    When click add cart button
    Then should see Cart page
    Examples:
      |email                    |password        |Category |Product |Color| Size|
      |oykunihansahin@gmail.com |oyku.22ocak1997  |KADIN    |Bluz    |Siyah|  M  |

  @CartPage
  Scenario Outline: Controlling Cart Page
    Given Controlling "<Category>" "<Product>" "<Color>" "<Size>"Cart Page and text "<email>" and "<password>"
    When check "<Product>" name
    When check one piece
    When check "<Size>" size
    When click Go to Payment Step button
    Then should see Payment Step
    Then should see Order Summary Text
    Examples:
      |email                    |password          |Category |Product |Color|Size|
      |oykunihansahin@gmail.com |oyku.22ocak1997  |KADIN    |Bluz    |Siyah|M   |




