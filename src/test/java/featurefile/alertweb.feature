Feature: alert framewaork practice

@Reg
Scenario: verify alert pop with only option OK

And user click on click me button
Then user click on OK


@Reg
Scenario: verify alert 2nd popup with accept

And user click on 2nd click me button
And user accept the popup

@Reg
Scenario: verify alert popup with reject

And user click on 2nd click me button
And user reject the popup

@Reg
Scenario Outline: verify alert with enter data and accept

And user click on 3rd clickme button
And user click enter the data "<Name>"
And  User click on accept

Examples:

|Name|
|Himanshu|
|Shubham|
|sumeet|
|pranjal|
|anshu|



