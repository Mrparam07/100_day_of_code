/*
Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.
The CITY table is described as follows:
https://www.hackerrank.com/challenges/japanese-cities-name/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
Expected Output
Neyagawa 
Ageo 
Sayama 
Omuta 
Tokuyama 
*/
SELECT NAME FROM CITY
WHERE COUNTRYCODE='JPN';
