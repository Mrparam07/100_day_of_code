/*
Given the CITY and COUNTRY tables, query the names of all cities where the CONTINENT is 'Africa'.
Note: CITY.CountryCode and COUNTRY.Code are matching key columns.
Input Format
The CITY and COUNTRY tables are described as follows:
https://www.hackerrank.com/challenges/african-cities/problem?isFullScreen=true
Expected Output
Qina 
Warraq al-Arab 
Kempton Park 
Alberton 
Klerksdorp 
Uitenhage 
Brakpan 
Libreville 
*/
SELECT CITY.NAME FROM CITY,COUNTRY
WHERE CONTINENT ='Africa'
AND CITY.COUNTRYCODE=COUNTRY.CODE;
