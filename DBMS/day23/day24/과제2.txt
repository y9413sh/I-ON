SELECT e.ename, d.deptno, d.dname

FROM EMP e JOIN DEPT d ON e.deptno=d.deptno;

​

SELECT e.ename, e.job, d.deptno, d.dname

FROM EMP e JOIN DEPT d ON e.deptno=d.deptno

WHERE d.loc='DALLAS';

​

SELECT e.ename, d.dname

FROM EMP e JOIN DEPT d ON e.deptno=d.deptno

WHERE e.ename LIKE '%A%';

​

SELECT e.ename, d.dname, e.sal

FROM EMP e JOIN DEPT d ON e.deptno=d.deptno

WHERE e.sal >= 3000;

​

SELECT e.job, e.ename, d.dname

FROM EMP e JOIN DEPT d ON e.deptno=d.deptno

WHERE e.job = 'SALESMAN';

​

SELECT empno AS "사원번호", ename AS "사원이름", sal AS "연봉", sal+NVL(comm,0) AS "실급여", grade AS "급여등급"

FROM EMP LEFT JOIN SALGRADE ON (sal + nvl(comm, 0)) BETWEEN losal AND hisal;

​

SELECT e.deptno, dname, ename, (sal+NVL(comm,0)/12), grade

FROM EMP e LEFT JOIN DEPT d ON e.deptno = d.deptno

LEFT JOIN SALGRADE s ON (sal+ NVL(comm, 0)) BETWEEN losal AND hisal

WHERE e.deptno=10;

​

SELECT e.deptno, dname, ename, (sal+NVL(comm,0)/12), grade

FROM EMP e LEFT JOIN DEPT d ON e.deptno = d.deptno

LEFT JOIN SALGRADE s ON (sal+ NVL(comm, 0)) BETWEEN losal AND hisal

WHERE e.deptno IN(10,20)

ORDER BY e.deptno ASC, sal DESC;

​

SELECT e1.empno AS "사원번호", e1.ename AS "사원이름", e2.empno AS "관리자번호", e2.ename AS "관리자이름"

FROM emp e1 LEFT JOIN emp e2 ON e1.mgr = e2.empno;