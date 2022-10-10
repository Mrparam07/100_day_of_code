/*
Query the average population of all cities in CITY where District is California.
Input Format
The CITY table is described as follows:
https://www.hackerrank.com/challenges/revising-aggregations-the-average-function/problem?isFullScreen=true
Expected Output
113000.667
*/
SELECT AVG(POPULATION) FROM CITY
WHERE DISTRICT = 'California';
