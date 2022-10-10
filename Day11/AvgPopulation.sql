/*
Given the CITY and COUNTRY tables, query the names of all the continents (COUNTRY.Continent) and their respective average city populations (CITY.Population) rounded down to the nearest integer.
Note: CITY.CountryCode and COUNTRY.Code are matching key columns.
Input Format
The CITY and COUNTRY tables are described as follows:
https://www.hackerrank.com/challenges/average-population-of-each-continent/problem?isFullScreen=true
Expected Output
Oceania 109189 
South America 147435 
Europe 175138 
Africa 274439 
Asia 693038 
*/
SELECT COUNTRY.CONTINENT ,FLOOR(AVG(CITY.POPULATION))
FROM COUNTRY
JOIN CITY ON COUNTRY.CODE=CITY.COUNTRYCODE
GROUP BY COUNTRY.CONTINENT;
