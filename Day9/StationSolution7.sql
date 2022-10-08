/*
Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates.
Input Format
The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-7/problem?isFullScreen=true
Expected Output
Acme 
Aguanga 
Alba 
Aliso Viejo 
Alpine 
Amazonia 
Amo 
Andersonville 
Archie 
Arispe 
Arkadelphia 
Atlantic Mine 
Baileyville 
Bainbridge 
Barrigada 
Baton Rouge 
Bayville 
Bellevue 
Bentonville 
Bertha {-truncated-}
*/
SELECT DISTINCT CITY FROM STATION
WHERE CITY LIKE '%a'
OR CITY LIKE '%e'
OR CITY LIKE '%i'
OR CITY LIKE '%o'
OR CITY LIKE '%u';
