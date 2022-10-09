/*
Query the sum of the populations for all Japanese cities in CITY. The COUNTRYCODE for Japan is JPN.
Input Format
The CITY table is described as follows:
https://www.hackerrank.com/challenges/japan-population/problem?isFullScreen=true
Expected Output
879196
*/
SELECT SUM(POPULATION) FROM CITY
WHERE COUNTRYCODE = 'JPN
