SELECT DEPTNO, SUM(PAY), AVG(PAY)

FROM EMP2

GROUP BY DEPTNO;

​

SELECT EMP_TYPE, SUM(PAY), AVG(PAY)

FROM EMP2

GROUP BY EMP_TYPE;

​

SELECT POSITION, SUM(PAY), round(avg(pay), 0)

FROM EMP2

GROUP BY POSITION;

​

SELECT POSITION, SUM(PAY), round(avg(pay), 0)

FROM EMP2

GROUP BY POSITION

HAVING POSITION='과장';