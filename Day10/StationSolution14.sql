/*
Query the greatest value of the Northern Latitudes (LAT_N) from STATION that is less than . Truncate your answer to  decimal places.
Input Format
The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-14/problem?isFullScreen=true
Expected Output
137.0193
*/
SELECT ROUND(MAX(LAT_N),4) FROM STATION
WHERE LAT_N<137.2345;
