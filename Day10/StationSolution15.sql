/*
Query the Western Longitude (LONG_W) for the largest Northern Latitude (LAT_N) in STATION that is less than . Round your answer to  decimal places.
Input Format
The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-15/problem?isFullScreen=true
Expected Output
117.2465
*/
SELECT ROUND(LONG_W,4) FROM STATION
WHERE LAT_N = (SELECT MAX(LAT_N)
FROM STATION WHERE LAT_N<137.2345); 
