Feature: Verifying AdactionHotelApp Login Details
Scenario: verifying AdactinHotelApp Login Credentials
Given User on AdactinHotelApp page
When User Should Enter UserName and Password
And User Should Click Login button
Then User Should Verify after Login Success  Msg 