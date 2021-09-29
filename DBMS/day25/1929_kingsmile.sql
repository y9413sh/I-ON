-- decode 
SELECT deptno, DECODE(deptno, 10 , 'ACCOUNTING' ,
                              20 , 'RESEARCH' ,
                              30 , 'SALES', 'OPERATIONS') name
  FROM dept;
  
SELECT deptno, DECODE(deptno, 10 , SUM(sal),
                              20 , MAX(sal),
                              30 , MIN(sal),
                              40 , avg(sal) ) sal
  FROM emp
 GROUP BY deptno; 
 
 
SELECT deptno, 
       CASE deptno
         WHEN 10 THEN 'ACCOUNTING'
         WHEN 20 THEN 'RESEARCH'
         WHEN 30 THEN 'SALES'
         ELSE 'OPERATIONS'
       END as "Dept Name"
  FROM dept;
  
--  ���̺� ���� / ���ڵ� ���� ------------------------------------------
/*
����> 
create table ���̺��̸�
    as  select �ʵ��, �ʵ��,.... from ���̺��̸�;
*/
drop table c_emp2;

create table c_emp2    -- ���������� ���� ���� �ʴ´�.
    as select * from emp2;

create table c_emp_20
    as select * from emp where deptno=20;

create table c_emp_30
    as select empno ��ȣ, ename �̸�, job ����, sal �޿�
        from emp where deptno=30;

--����1] �������̺��� ���Ӱ��縸 �����ؼ� ���̺� �����ϱ�
create table c_professor
    as select * from professor where position='���Ӱ���';

select * from c_professor;
--����2]emp(����) ���̺��� mgr(�Ŵ�����ȣ)�� 7566���� ����� �����ؼ� ���ο� ���̺� �����ϱ�
create table c_emp_7566
    as select * from emp where mgr = 7566;
    
select * from c_emp_7566;

create table c_emp3
    as select * from emp where 1=0;
    
create table c_emp4
    as select * from emp
        order by ename desc, sal desc, empno asc;
  --  or    
create table c_emp4
    as select * from emp
        order by 2 desc, 6 desc, 1 asc;
        
create table c_emp
    as select * from emp;

select * from c_emp4;
desc c_emp3;

select * from c_emp;  -- ��ü����
select * from c_emp_20;  -- ����(�μ���ȣ�� 20���� ���ڵ�) �� �°� ���̺� ����
select * from c_emp3;   -- �������� ���� (���ڵ� ���� ����)
select * from c_emp_30;  -- empno, ename, job, sal ���ϴ� �ʵ常 ����

-- UNION   -- pk / fk �ƴ� ���� ���̺� ��ġ�� ----------------
SELECT * FROM emp
    UNION  -- �ߺ� ���ڵ� �����ϰ� ���ļ� ������
    SELECT * FROM c_emp;

insert into c_emp(empno, ename, deptno) values(303, '����', 40);

SELECT * FROM emp
    UNION all  -- �ߺ� ���ڵ� �����ؼ� ��ģ��
    SELECT * FROM c_emp;

select * from emp  -- �ʵ� ���� X
union 
    select * from c_emp_30;   -- empno, ename, job, sal

select empno, ename, job, mgr from emp  -- �ʵ� ����, data type ��ġ ���Ѿ���
union 
    select * from c_emp_30;

desc emp;
select empno, ename, job, hiredate from emp  -- �ʵ� ����, data type  X ��ġ ���Ѿ��� 
union 
    select * from c_emp_30;

--����4] �����ȣ, �̸�, �޿� �׸��� 15%�λ�� �޿��� ������ ǥ���ϵ�
--    �÷����� New Salary�� �����Ͽ� ����Ͻÿ�.
select empno, ename, sal, round((sal*1.15), 0) "New Salary" from emp;

select empno, ename, sal, cast(sal*1.15 as int) "New Salary" from emp;

--����5]�� ����� �̸��� ǥ���ϰ�, �ٹ� �� ���� ����Ͽ� �÷����� 
--     Months_Works�� �����ϰ�, �ٹ� �޼��� �������� ������ �������
--     �����Ͽ� ����Ͻÿ�.
--select ename, hiredate, round(MONTHS_BETWEEN(SYSDATE,hiredate), 0) as "Months_Works"  
select ename, hiredate, trunc(MONTHS_BETWEEN(SYSDATE,hiredate),0) as "[Months_Works]"  
--    from emp order by hiredate desc;  
    from emp order by "[Months_Works]" desc; 
    
--����6]����� �̸��� Ŀ�̼��� ����ϵ�, Ŀ�̼��� å������ ���� 
--    ����� Ŀ�̼��� 'no commission'���� ����Ͻÿ�.
select ename, Cast(comm as VARCHAR2(20)) from emp where comm is null;

select ename, nvl(Cast(comm as VARCHAR2(20)), 'no commission') from emp; --where comm is null;

select * from emp;
desc emp;


/* ����>
insert into ���̺��̸�
    select �÷���, ... from ���̺��̸�
*/

select * from c_emp3;
insert into  c_emp3 
    select * from emp;

rollback;
insert into  c_emp3   -- �ʵ� ���� , Ÿ��  �¾ƾ���
    select empno, ename from emp;

drop table c_emp5;
create table c_emp5
    as select empno, hiredate, sal from emp where 1=0;
    
select * from c_emp5;   -- empno, hiredate, sal
desc emp;

select * from emp2;
insert into  c_emp5   -- �ʵ� ���� , Ÿ��  �¾ƾ���
    select empno, birthday, pay from emp2;  -- �ʵ�� Ÿ��ũ����� �´ٸ� �ٸ� ���̺��� ���ڵ嵵 ���� ������

desc emp2;











