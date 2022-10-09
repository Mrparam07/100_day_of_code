/*
Query the difference between the maximum and minimum populations in CITY.
Input Format
The CITY table is described as follows:
https://www.hackerrank.com/challenges/population-density-difference/problem?isFullScreen=true
Expected Output
4695354
*/
SELECT MAX(POPULATION) - MIN(POPULATION) FROM CITY;
