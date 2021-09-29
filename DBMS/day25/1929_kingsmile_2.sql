-- SubQuery -----------------------------------------
-- ex) select * from emp where ename = ( 서브쿼리문장 ) ; 
select * from emp2;
select * from emp2 where name='백원만';
select * from emp2 where pay > 60000000;

select * from emp2 where pay > ( select pay from emp2 where name='백원만');

--문제1]emp2 평균 급여보다 작은 직원들 출력하세요.
select * from emp2 where pay <(select avg(pay) from emp2);

--문제2]학생 테이블에서 1학년(grade) 평균 키보다 큰 사람들 출력하세요
select * from student where height > (select avg(height) from student where grade=1);

--문제3]학생 테이블, 학과 테이블을 사용하여 이윤나 학생과 전공(deptno1)이 
--    동일한 학생들이 이름과 학과 이름 출력하세요.
select s.name, dname
    from student s  join department d
    on s.deptno1=d.deptno
    where s.deptno1 = (select deptno1 from student where name='이윤나');
    
select s.name, dname
    from student s , department d
    where s.deptno1 = (select deptno1 from student where name='이윤나')
    and s.deptno1=d.deptno;
      

-- 문제4]교수 테이블에서 입사일이 송도권 교수보다 나중에 입사한 사람의 이름, 입사일, 학과명을 출력하시오
select name, hiredate, dname
    from professor  join department using (deptno)
    where hiredate > (select hiredate from professor where name='송도권');
    
select name, hiredate, dname
    from professor p , department d
    where hiredate > (select hiredate from professor where name='송도권')  -- 98/03/22
    and p.deptno = d.deptno;
    
-- 문제5] 학생 테이블에서 전공이 101인 학과의 평균 몸무게보다  몸무게가 많은 학생들의 이름과 몸무게를 출력하세요.
select name, weight from student where weight > (select avg(weight) from student where deptno1=101);

-- 서브쿼리의 결과가 한 개 이상 반환될때는 in , any, all 연산자를 사용함.
select empno, name, deptno 
    from emp2
    where deptno in( 1000, 1001, 1002, 1010, 2000, 2001 );
    

select dcode from dept2 where area='서울지사';

select empno, name, deptno
    from emp2
    where deptno in(select dcode from dept2 where area='서울지사');

--1. EMP2 테이블을 사용하여 전체 직원 중 과장 직급의 최소 연봉자보다 연봉이 
--    높은 사람의 이름과 직급,연봉을 출력하세요. 
--    단 연봉 출력 형식은 아래와 같이 천 단위 구분기호와 원 표시를 하세요
  select name, position ,to_char(pay, 'L999,999,999') from emp2 where pay  > 
                                (select min(pay) from emp2 where position = '과장');

--2. student 테이블을 조회하여 전체 학생 중에서 체중이 4학년 학생들의 체중에서 가장 적게 나가는 학생보다 적은 학생의 이름과 학년과 몸무게를 출력.


--3. student 테이블을 조회하여 각 학년별로 최대 키를 가진 학생들의 학년과 이름과 키를 출력.
--4. professor 테이블을 조회하여 각 학과별로 입사일이 가장 오래된 교수의 교수번호와 이름, 입사일, 학과명을 출력. 
--    단, 학과명순으로 오름차순 정렬.




