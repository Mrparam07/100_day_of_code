/*
Query the total population of all cities in CITY where District is California.
Input Format
The CITY table is described as follows:
https://www.hackerrank.com/challenges/revising-aggregations-sum/problem?isFullScreen=true
Expected Output
339002 
*/
SELECT SUM(POPULATION) FROM CITY
WHERE DISTRICT = 'California';
