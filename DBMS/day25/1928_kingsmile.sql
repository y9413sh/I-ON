select sysdate from dual;

CREATE TABLE ck_Test(
    NAME VARCHAR2(10) NOT NULL,
    age NUMBER(2) NOT NULL  CHECK (age BETWEEN 20 AND 30 ),  --age컬럼의 값은 20~30사이만 허용
    gender char(2) CHECK (gender in('남', '여'))    -- 이렇게하니 에러 없네요. ^^;;    
);
select * from ck_test;

insert into ck_test values('park', 22);
insert into ck_test values('kang', 30);
insert into ck_test values('kim', 50);
insert into ck_test values('lee', 35);

CREATE TABLE de_Test(
    NAME VARCHAR2(10) NOT NULL,
    addr VARCHAR2(10) DEFAULT '서울'
);

select * from de_test;
insert into de_test values('tt', 'ss');
insert into de_test(name) values('gg'); --
insert into de_test values('kk', default);
insert into de_test values('tt', '부산');
insert into de_test(name) values('kbs');

-- 테이블 수정 / 삭제 -----------------------------------------
/*
① 컬럼추가
alter table 테이블이름 add (컬럼명 자료형 [제약조건] , 컬럼명 자료형 [제약조건] , ....)
*/

SELECT * FROM de_test;
alter table de_test add phone varchar2(15);
alter table de_test add (age number, jumin varchar(13), reg_date date ) ;
update de_test set phone =' ';

/*
② 컬럼삭제
alter table 테이블이름 drop column 컬럼이름
*/
alter table de_test drop column age;
alter table de_test drop (addr, phone);

/*
③ datatype변경
alter table 테이블이름 modify 컬럼이름 변경자료형
*/
desc de_test;
alter table de_test modify jumin number;
alter table de_test modify name date;  -- 레코드가 단 1개라도 입력 되어 있다면 타입 변경 힘듬
delete de_test; -- where name = ;

/*
④ 컬럼이름 변경
alter table 테이블이름 rename column 기존컬럼명 to 변경컬럼명
*/
alter table de_test rename column name to irum;

/*
⑤ 테이블 삭제
drop table 테이블이름
*/
drop table de_test;

SELECT * FROM de_test;
desc de_test;

-- 집계함수 사용시 Group by ------------------------------------
select sum(height), sum(weight) from student;

select grade, sum(height), sum(weight)   -- 일반필드는 그룹(집합) 필드와 같이 쓸수 없다.
    from student
    group by grade;  -- 부분합(소계)
    
-- emp_type 별로 pay 합, 평균, 최고급여, 최하급여 구하기
select emp_type, sum(pay), avg(pay), max(pay), min(pay) 
    from emp2
    group by emp_type;

-- 조건 : where, having 절 이용한다.

select grade, sum(height), avg(height)   
    from student
    group by grade
    having avg(height) > 173; 

select deptno as "학   과", round(avg(nvl(pay,0)), 0) "평균 급여"
    from professor
    group by deptno
    having avg(pay) > 400;

select * from department;

문제1] emp2 테이블에서 deptno(부서)별로 pay 합과 평균 구하기
문제2] emp2 테이블에서 emp_type별로 pay 합과 평균 구하기
문제3] emp2 테이블에서 직급별(position)별로 급여의 합, 평균
문제4] emp2 테이블에서 직급별(position)별로 급여의 합, 평균 구하는데, 직급이 과자인 사람들만 출력하기
 select position, sum(pay), avg(pay) from emp2 GROUP BY position having position ='과장';       






