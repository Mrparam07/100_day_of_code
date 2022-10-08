/*
Query the list of CITY names from STATION that do not start with vowels and do not end with vowels. Your result cannot contain duplicates.
Input Format
The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-12/problem?isFullScreen=true
Expected Output
Baker 
Baldwin 
Bass Harbor 
Beaufort 
Beaver Island 
Benedict 
Bennington 
Berryton 
Beverly 
Bison 
Blue River 
Bowdon 
Bowdon Junction 
Bridgeport 
Bridgton 
Brighton 
Brilliant 
Bristol 
Brownstown 
Buffalo Creek {-truncated-}
*/
SELECT DISTINCT CITY FROM STATION
WHERE LEFT(CITY,1) NOT IN ('a','e','i','o','u','A','E','I','O','U')
AND RIGHT(CITY,1) NOT IN ('a','e','i','o','u','A','E','I','O','U');
