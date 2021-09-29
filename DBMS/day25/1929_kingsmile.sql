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
  
--  테이블 복사 / 레코드 복사 ------------------------------------------
/*
형식> 
create table 테이블이름
    as  select 필드명, 필드명,.... from 테이블이름;
*/
drop table c_emp2;

create table c_emp2    -- 제약조건은 복사 되지 않는다.
    as select * from emp2;

create table c_emp_20
    as select * from emp where deptno=20;

create table c_emp_30
    as select empno 번호, ename 이름, job 직업, sal 급여
        from emp where deptno=30;

--문제1] 교수테이블에서 전임강사만 추출해서 테이블 생성하기
create table c_professor
    as select * from professor where position='전임강사';

select * from c_professor;
--문제2]emp(직원) 테이블에서 mgr(매니저번호)가 7566번인 사람만 추출해서 새로운 테이블 생성하기
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

select * from c_emp;  -- 전체복사
select * from c_emp_20;  -- 조건(부서번호가 20번인 레코드) 에 맞게 테이블 생성
select * from c_emp3;   -- 구조물만 복사 (레코드 복사 제외)
select * from c_emp_30;  -- empno, ename, job, sal 원하는 필드만 복사

-- UNION   -- pk / fk 아닌 상태 테이블 합치기 ----------------
SELECT * FROM emp
    UNION  -- 중복 레코드 제거하고 합쳐서 보여줌
    SELECT * FROM c_emp;

insert into c_emp(empno, ename, deptno) values(303, '도연', 40);

SELECT * FROM emp
    UNION all  -- 중복 레코드 포함해서 합친다
    SELECT * FROM c_emp;

select * from emp  -- 필드 개수 X
union 
    select * from c_emp_30;   -- empno, ename, job, sal

select empno, ename, job, mgr from emp  -- 필드 개수, data type 일치 시켜야함
union 
    select * from c_emp_30;

desc emp;
select empno, ename, job, hiredate from emp  -- 필드 개수, data type  X 일치 시켜야함 
union 
    select * from c_emp_30;

--문제4] 사원번호, 이름, 급여 그리고 15%인상된 급여를 정수로 표시하되
--    컬럼명을 New Salary로 지정하여 출력하시오.
select empno, ename, sal, round((sal*1.15), 0) "New Salary" from emp;

select empno, ename, sal, cast(sal*1.15 as int) "New Salary" from emp;

--문제5]각 사원의 이름을 표시하고, 근무 달 수를 계산하여 컬럼명을 
--     Months_Works로 지정하고, 근무 달수를 기준으로 오래된 사람부터
--     정렬하여 출력하시오.
--select ename, hiredate, round(MONTHS_BETWEEN(SYSDATE,hiredate), 0) as "Months_Works"  
select ename, hiredate, trunc(MONTHS_BETWEEN(SYSDATE,hiredate),0) as "[Months_Works]"  
--    from emp order by hiredate desc;  
    from emp order by "[Months_Works]" desc; 
    
--문제6]사원의 이름과 커미션을 출력하되, 커미션이 책정되지 않은 
--    사원의 커미션은 'no commission'으로 출력하시오.
select ename, Cast(comm as VARCHAR2(20)) from emp where comm is null;

select ename, nvl(Cast(comm as VARCHAR2(20)), 'no commission') from emp; --where comm is null;

select * from emp;
desc emp;


/* 형식>
insert into 테이블이름
    select 컬럼명, ... from 테이블이름
*/

select * from c_emp3;
insert into  c_emp3 
    select * from emp;

rollback;
insert into  c_emp3   -- 필드 개수 , 타입  맞아야함
    select empno, ename from emp;

drop table c_emp5;
create table c_emp5
    as select empno, hiredate, sal from emp where 1=0;
    
select * from c_emp5;   -- empno, hiredate, sal
desc emp;

select * from emp2;
insert into  c_emp5   -- 필드 개수 , 타입  맞아야함
    select empno, birthday, pay from emp2;  -- 필드와 타입크기까지 맞다면 다른 테이블의 레코드도 삽입 가능함

desc emp2;











