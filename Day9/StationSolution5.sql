/*
Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.
The STATION table is described as follows:
https://www.hackerrank.com/challenges/weather-observation-station-5/problem?isFullScreen=true
Expected Output
Amo 3
Marine On Saint Croix 21
*/
SELECT CITY, LENGTH(CITY) AS LEN FROM STATION ORDER BY LEN, CITY LIMIT 1;
SELECT CITY, LENGTH(CITY) AS LEN FROM STATION ORDER BY LEN DESC, CITY LIMIT 1;
