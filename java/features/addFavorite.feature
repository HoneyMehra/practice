Feature: Validate add favorite 
 
Scenario: Validate add favorite
  
Given https://go.discovery.com/
When title of Home page is Discovery - Official Site
Then scroll home page to RECOMMENDED FOR YOU categories
Then check number of videos more than two
Then get titles and description for two videos and add videos to favorites
Then navigate to My videos page
Then validate title and description of both videos