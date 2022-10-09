/*
Query the sum of Northern Latitudes (LAT_N) from STATION having values greater than  and less than . Truncate your answer to  decimal places.
Input Format
The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-13/problem?isFullScreen=true
Expected Output
36354.8135
*/
SELECT ROUND(SUM(LAT_N),4) FROM STATION
WHERE LAT_N>38.7880 AND LAT_N<137.2345;
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
