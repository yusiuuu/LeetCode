CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      SELECT Salary
      FROM Employee e1
      WHERE N = (
          SELECT COUNT(DISTINCT Salary)
          FROM Employee e2
          WHERE e2.Salary >= e1.Salary
      )
      LIMIT 1
  );
END;