/*
Query the following two values from the STATION table:
The sum of all values in LAT_N rounded to a scale of  decimal places.
The sum of all values in LONG_W rounded to a scale of  decimal places.
Input Format
The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-2/problem?isFullScreen=true
Expected Output
42850.04 47381.48
*/
SELECT 
ROUND(SUM(LAT_N), 2) AS lat, 
ROUND(SUM(LONG_W), 2) AS lon 
FROM STATION;
