Hello Cucumber, I Want Ice Cream
--------------------------------
This is the Hello Cucumber project from https://cucumber.io/docs/guides/10-minute-tutorial/ with a few enhancements:

- A background step has been added
- The IsItFriday class has been converted to a Spring Bean
- Spring Boot is used to wire in the IsItFriday class
- The [Pitest Cucumber Plugin](https://github.com/alexvictoor/pitest-cucumber-plugin) has been added and can be run by calling **mvn pitest:mutationCoverage**