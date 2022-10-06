Feature: Verifying AdactionHotelApp Login Details

  Scenario Outline: verifying AdactinHotelApp Login Credentials
    Given User on AdactinHotelApp page
    When User Should login "<username>", "<password>"
    And User Should Search Hotel "<Location>","<Hotel>","<RoomType>","<NoOfRooms>","<Adults>","<Child>"
    And User Should Select a Hotel
    And user Should Book a Hotel "<firstName>", "<lastName>", "<Address>","<cardNo>","<cardType>","<expMonth>","<expYear>","<ccv>",
    Then User  should get Order Id

    Examples: 
      | username   | password | Location    | Hotel          | RoomType     | NoOfRooms | Adults    | Child     | firstName | lastName | Address | cardNo           | cardType         | expMonth | expYear | ccv |
      | Greens8767 | L4R739   | Sydney      | Hotel Sunshine | Standard     | 1 - One   | 1 - One   | 0 - None  | Vijay     | kumar    | OMR     | 9876543210009988 | American Express | December |    2022 | 987 |
      | Greens8767 | L4R739   | Paris       | Hotel Creek    | Double       | 2 - Two   | 2 - Two   | 1 - One   | Raj       | kumar    | Guindy  | 9876543210009981 | VISA             | January  |    2022 | 123 |
      | Greens8767 | L4R739   | Melbourne   | Hotel Hervey   | Deluxe       | 3 - Three | 3 - Three | 2 - Two   | Ravi      | raj      | Merina  | 9876543210009982 | Master Card      | February |    2022 | 565 |
      | Greens8767 | L4R739   | Brisbane    | Hotel Cornice  | Super Deluxe | 4 - Four  | 4 - Four  | 3 - Three | Surya     | kumar    | ECR     | 9876543210009983 | Other            | March    |    2022 | 456 |
      | Greens8767 | L4R739   | Adelaide    | Hotel Creek    | Standard     | 5 - Five  | 1 - One   | 4 - Four  | Sanjay    | kumar    | CMBT    | 9876543210009984 | VISA             | April    |    2022 | 457 |
      | Greens8767 | L4R739   | London      | Hotel Hervey   | Double       | 6 - Six   | 2 - Two   | 0 - None  | Raja      | selvam   | Aavadi  | 9876543210009985 | Master Card      | May      |    2022 | 125 |
      | Greens8767 | L4R739   | New York    | Hotel Cornice  | Deluxe       | 7 - Seven | 3 - Three | 4 - Four  | Sundar    | raj      | Okiyam  | 9876543210009986 | American Express | June     |    2022 | 746 |
      | Greens8767 | L4R739   | Los Angeles | Hotel Sunshine | Double       | 8 - Eight | 4 - Four  | 3 - Three | Santhos   | kumar    | Paris   | 9876543210009987 | Other            | July     |    2022 | 147 |
      | Greens8767 | L4R739   | Brisbane    | Hotel Hervey   | Standard     | 9 - Nine  | 1 - One   | 2 - Two   | Vicky     | raj      | KKnagar | 9876543210009980 | VISA             | August   |    2022 | 265 |
      | Greens8767 | L4R739   | Paris       | Hotel Creek    | Double       | 10 - Ten  | 2 - Two   | 1 - One   | viji      | mani     | OMR     | 9876543210009989 | VISA             | October  |    2022 | 128 |
