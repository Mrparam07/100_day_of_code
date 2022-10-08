/*
Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.
Input Format
The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-11/problem?isFullScreen=true
Expected Output
Addison 
Agency 
Alanson 
Albany 
Albion 
Algonac 
Allerton 
Alton 
Andover 
Anthony 
Arlington 
Arrowsmith 
Athens 
Auburn 
Baileyville 
Bainbridge 
Baker 
Baldwin 
Barrigada 
Bass Harbor {-truncated-}
*/
SELECT DISTINCT CITY FROM STATION
WHERE LEFT(CITY,1) NOT IN ('a','e','i','o','u','A','E','I','O','U')
OR RIGHT(CITY,1) NOT IN ('a','e','i','o','u','A','E','I','O','U');
