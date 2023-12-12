182. Duplicate Emails

SELECT email
FROM Person
GROUP BY email
HAVING COUNT(id) > 1
________________________________
196. Delete Duplicate Emails

DELETE p1
FROM Person p1, Person p2
WHERE p1.email = p2.email AND p1.id > p2.id;
________________________________
197. Rising Temperature

SELECT DISTINCT w1.Id
FROM Weather w1,Weather w2
WHERE w1.Temperature > w2.Temperature
AND DATEDIFF(w1.Recorddate, w2.Recorddate) = 1

________________________________
584. Find Customer Referee

SELECT name
FROM Customer
WHERE referee_id IS NULL OR referee_id <> 2

________________________________
1068. Product Sales Analysis I

SELECT
    Product.product_name, Sales.year, Sales.price
FROM
    Sales
INNER JOIN
    Product ON Sales.product_id = Product.product_id

________________________________
627. Swap Salary

UPDATE Salary
SET sex = CASE
    WHEN sex = 'm' THEN 'f'
    WHEN sex = 'f' THEN 'm'
END;

________________________________
178. Rank Scores

SELECT score,
    dense_rank() OVER (
        ORDER BY score DESC
        ) AS 'rank'
FROM Scores
ORDER BY score DESC

