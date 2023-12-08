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