/*
Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.
Input Format
The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-9/problem?isFullScreen=true
Expected Output
Baileyville 
Bainbridge 
Baker 
Baldwin 
Barrigada 
*/
SELECT DISTINCT CITY FROM STATION
WHERE LEFT(CITY,1) NOT IN ('a','e','i','o','u','A','E','I','O','U');
