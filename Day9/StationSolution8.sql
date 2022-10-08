/*
Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. Your result cannot contain duplicates.
Input Format
The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-8/problem?isFullScreen=true
Expected Output
Acme 
Aguanga 
Alba 
Aliso Viejo 
Alpine 
*/
SELECT CITY FROM STATION
WHERE LEFT(CITY,1) IN ('a','e','i','o','u','A','E','I','O','U')
AND RIGHT(CITY,1) IN ('a','e','i','o','u','A','E','I','O','U');
