/*
Query the NAME field for all American cities in the CITY table with populations larger than 120000. The CountryCode for America is USA.
The CITY table is described as follows:
https://www.hackerrank.com/challenges/revising-the-select-query-2/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
Expected Output
Scottsdale
Corona
Concord
Cedar Rapids
*/
SELECT NAME FROM CITY
WHERE POPULATION>120000
AND COUNTRYCODE="USA";
