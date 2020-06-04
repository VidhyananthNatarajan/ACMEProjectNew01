Feature: ACME Login and Country Selection
Scenario Outline: TC001 ACME Login and Country Selection functionlity
Given Enter the username as<username>
And Enter the password as<password>
When Login successful
And Search for Vendors name 
And Click on Search as <vendorName>
Then find the country name based on vendor as <cName>
Examples:
|username|password|vendorName|cName|
|kumar.testleaf@gmail.com|leaf@12|Star Software|Romania|
