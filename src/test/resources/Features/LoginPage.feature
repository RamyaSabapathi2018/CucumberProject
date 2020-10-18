Feature: Adactinhotelapp Feature

  Scenario Outline: Adactinhotel Login with Valid UserName and Valid Password
    Given User is in Login Page
    When User enters valid "<userName>" and valid "<password>"
    Then User click the Login Button
    Then User is in Search Hotel Page
    And User select "<location>","<hotels>","<roomType>","<noOfRooms>","<checkinDate>","<checkOutDate>"
    Then User click on Search Button
    Then User is in Select Hotel Page
    Then User selects the Hotel
    Then User click the Continue button
    Then User is in Hotel Booking page
    And User enters the "<firstName>","<lastName>","<bllingAddress>","<creditCardNumber>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvv>"
    Then User click the Book Now button
    Then User fetch the Booking order Number and display it
    Then User Close the browser

    Examples: 
      | userName       | password | location    | hotels         | roomType | noOfRooms | checkinDate | checkOutDate | firstName | lastName  | bllingAddress          | creditCardNumber    | creditCardType | expiryMonth | expiryYear | cvv |
      | RamyaSabapathi | Mugil@03 | Sydney      | Hotel Creek    | Standard | 1 - One   | 15/10/2020  | 16/10/2020   | Ramya     | Sabapathi | Navalur Chennai-600130 | 1234 5678 9012 3456 | VISA           | March       |       2022 | 123 |
      | RamyaSabapathi | Mugil@03 | Brisbane    | Hotel Sunshine | Standard | 1 - One   | 16/10/2020  | 17/10/2020   | Ramya     | Sabapathi | Navalur Chennai-600130 | 1234 5678 9012 3456 | VISA           | March       |       2022 | 123 |
      | RamyaSabapathi | Mugil@03 | London      | Hotel Creek    | Standard | 1 - One   | 15/10/2020  | 16/10/2020   | Ramya     | Sabapathi | Navalur Chennai-600130 | 1234 5678 9012 3456 | VISA           | March       |       2022 | 123 |
      | RamyaSabapathi | Mugil@03 | Melbourne   | Hotel Sunshine | Standard | 1 - One   | 16/10/2020  | 17/10/2020   | Ramya     | Sabapathi | Navalur Chennai-600130 | 1234 5678 9012 3456 | VISA           | March       |       2022 | 123 |
      | RamyaSabapathi | Mugil@03 | Los Angeles | Hotel Creek    | Standard | 1 - One   | 15/10/2020  | 16/10/2020   | Ramya     | Sabapathi | Navalur Chennai-600130 | 1234 5678 9012 3456 | VISA           | March       |       2022 | 123 |
