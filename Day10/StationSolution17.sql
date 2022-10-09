/*
Query the Western Longitude (LONG_W)where the smallest Northern Latitude (LAT_N) in STATION is greater than . Round your answer to  decimal places.
Input Format
The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-17/problem?isFullScreen=true
Expected Output
70.1378
*/
SELECT ROUND(LONG_W,4) FROM STATION
WHERE LAT_N = (SELECT MIN(LAT_N)
FROM STATION WHERE LAT_N>38.7780); 
