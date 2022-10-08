/*
Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.
The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-4/problem?isFullScreen=true
Expected Output
13
*/
SELECT COUNT(CITY)-COUNT(DISTINCT CITY) AS DIFFERENCE
FROM STATION;
