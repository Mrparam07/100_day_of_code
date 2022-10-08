/*
Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.
Input Format
The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-6/problem?isFullScreen=true
Expected Output
Acme 
Addison 
Agency 
Aguanga 
Alanson 
Alba 
Albany 
Albion 
Algonac 
Aliso Viejo 
Allerton 
Alpine 
Alton 
Amazonia 
Amo 
Andersonville 
Andover 
Anthony 
Archie 
Arispe {-truncated-}
*/
SELECT DISTINCT CITY FROM STATION
WHERE CITY LIKE 'A%'
OR CITY LIKE 'E%'
OR CITY LIKE 'I%'
OR CITY LIKE 'O%'
OR CITY LIKE 'U%';
