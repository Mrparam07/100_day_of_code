/*
Query the smallest Northern Latitude (LAT_N) from STATION that is greater than . Round your answer to  decimal places.
Input Format
The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-16/problem?isFullScreen=true
Expected Output
38.8526
*/
SELECT ROUND(MIN(LAT_N),4) FROM STATION
WHERE LAT_N>38.7780;
