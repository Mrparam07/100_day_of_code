/*
Write a query identifying the type of each record in the TRIANGLES table using its three side lengths. Output one of the following statements for each record in the table:
Equilateral: It's a triangle with  sides of equal length.
Isosceles: It's a triangle with  sides of equal length.
Scalene: It's a triangle with  sides of differing lengths.
Not A Triangle: The given values of A, B, and C don't form a triangle.
Input Format
The TRIANGLES table is described as follows:
https://www.hackerrank.com/challenges/what-type-of-triangle/problem?isFullScreen=true
Explanation
Values in the tuple  form an Isosceles triangle, because .
Values in the tuple  form an Equilateral triangle, because . Values in the tuple  form a Scalene triangle, because .
Values in the tuple  cannot form a triangle because the combined value of sides  and  is not larger than that of side .
Expected Output
Equilateral 
Equilateral 
Isosceles 
Equilateral 
Isosceles 
Equilateral 
Scalene 
Not A Triangle 
Scalene 
Scalene 
Scalene 
Not A Triangle 
Not A Triangle 
Scalene 
Equilateral
*/
SELECT IF(A+B<=C OR B+C<=A OR A+C<=B,"Not A Triangle",
IF(A=B AND B=C,"Equilateral",
IF(A=B OR B=C OR A=C,"Isosceles","Scalene")))
FROM TRIANGLES;
