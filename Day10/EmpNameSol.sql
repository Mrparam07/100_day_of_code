/*
Write a query that prints a list of employee names (i.e.: the name attribute) from the Employee table in alphabetical order.
Input Format
The Employee table containing employee data for a company is described as follows:
https://www.hackerrank.com/challenges/name-of-employees/problem?isFullScreen=true
Expected Output
Alan 
Amy 
Andrew 
Andrew 
Angela 
Ann 
Anna 
Anthony 
Antonio 
Benjamin 
Bonnie 
Brandon 
Brandon 
Brian 
Carol 
Charles 
Christina 
Christina 
Christine 
Christine {-truncated-}
*/
SELECT name FROM Employee
ORDER BY name;
