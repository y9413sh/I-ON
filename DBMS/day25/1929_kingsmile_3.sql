-- View -------------------------------------------
/*
create or replace view 뷰이름
    as    select ~
*/
create or replace view v_emp
    as select empno, ename, deptno from emp;
    
select * from v_emp;

-- emp 테이블 제거하면 v_emp ?  O (제거됨)
-- v_emp 테이블 제거하면 emp ?  X (제거안됨)

create view v_emp_30
    as select job, ename, sal from emp where deptno=30;

select * from v_emp_30;

--문제1] 30번 부서 사원들의 직위, 이름, 월급을 담은 view  테이블 만들기, 별칭 직위, 사원이름, 급여로 Alias 주고
--    월급이 2000보다 많은 사원들만 추출해서 뷰 만들기
create view v_emp30                                      --where  sal > 2000 and deptno=30;
    as select job 직위, ename 사원이름, sal 급여 from emp  where deptno=30 and sal > 2000;

select * from v_emp30 ;
   
--문제2] 부서별(부분합==소계) 최대급여, 최소급여, 평균급여를 갖는 뷰 만들기
create or replace view v2_emp
    as select deptno, max(sal) 최대급여, min(sal) 최소급여, round(avg(sal), 2) 평균급여 from emp group by deptno;

select * from v2_emp;

--문제3] 부서별 평균급여를 갖는 뷰를 만드는데, 평균 급여가 2000이상인 부서만 출력하세요.
CREATE VIEW V_EMP_3 AS(
    SELECT DEPTNO AS 부서번호, ROUND(AVG(SAL),2) AS 평균급여 FROM EMP
        GROUP BY DEPTNO HAVING AVG(SAL)>2000);

select * from v_emp_3;

--문제4] 직위별 총급여를 갖는 뷰 테이블 만들고, 직위(job)가 manager인 사원들은 제외하고 총급여가 3000이상인 사원들 출력하기
CREATE OR REPLACE VIEW v_emp_50 
    AS SELECT JOB, SUM(SAL) AS "총월급" 
        FROM EMP 
        WHERE JOB != 'MANAGER' or  JOB <> 'manager' --  WHERE JOB <> 'MANAGER' 
        GROUP BY JOB HAVING SUM(SAL)>=3000;

-- SQL 질의어 명령은 대소문자 구분 안한다. 레코드에 대한 것은 대소문자 구분함.(오라클)
select * from emp;

-----------------------------------------------------
문제7] 교수 테이블에서 테이블 구조만 복사된 c_professor 새로운 테이블 
     생성(이름, 직위, 입사일, 이메일, 홈페이지)하고 레코드 복사 하기
--------------------------------------------------------
문제8] c_emp22 테이블의 구조물만 복사 c_emp22로 만드세요
--------------------------------------------------------
문제9] emp 테이블에서 c_emp22에 직위가 'manager'인 
      사람들만 레코드 복사하시오.
----------------------------------------------------------
--  rownum / rowid ----------------------------------
SELECT ROWNUM, ename, sal FROM emp;
SELECT ROWNUM, ename, sal FROM emp where rownum = 1;
SELECT ROWNUM, ename, sal FROM emp where rownum = 11;

select rownum, ename, rowid from emp;  -- 게시판에 페이징 처리할때 사용 rownum  cf) mysql - limit 

SELECT ROWNUM, ename, sal
    FROM (SELECT * FROM EMP ORDER BY sal);
    
-- Sequence ------------------------------------
create sequence 시퀀스이름 -- 1부터 시작
    [start with 시작값 ]
    [increment by 증가치 ]
    [maxvalue 최대값 ]
    [minvalue 최소값 ]
    [cycle | nocycle ]
    [cache | nocache ];
    
drop sequence autonum;
create sequence autonum;  -- 1부터 시작해서 1씩 증가한다

select autonum.nextval from dual;
select autonum.currval from dual;


create table kosa_tab ( no number, name varchar2(10) );
delete kosa_tab;
insert into kosa_tab values(autonum.nextval, 'aa');
insert into kosa_tab values(autonum.nextval, 'bb');
insert into kosa_tab values(autonum.nextval, 'bccc');
insert into kosa_tab values(autonum.nextval, 'dd');

select * from kosa_tab;

drop sequence seq_board;
create sequence seq_board
    start with 10
    increment by 10
    MINVALUE 10
    MAXVALUE 50
    CYCLE
    NOCACHE;
    
create table kosa_tab2 ( num number, name varchar2(10) );
delete kosa_tab2;

insert into kosa_tab2 values(seq_board.nextval, 'aa');
insert into kosa_tab2 values(seq_board.nextval, 'bb');
insert into kosa_tab2 values(seq_board.nextval, 'bccc');
insert into kosa_tab2 values(seq_board.nextval, 'dd');
insert into kosa_tab2 values(seq_board.nextval, 'pppp');
insert into kosa_tab2 values(seq_board.nextval, 'kim');

select * from kosa_tab2;

create sequence seq_freeboard;

insert into kosa_tab2 values(seq_freeboard.nextval, 'park333');
insert into kosa_tab2 values(seq_freeboard.nextval, 'laal3333');
insert into kosa_tab2 values(seq_freeboard.nextval, 'kang');
insert into kosa_tab2 values(seq_freeboard.nextval, 'doyeon');

delete from kosa_tab2 where num = 5;


--문제]자동증가 시퀀스명을 seq_test 라고 지정하고 100 
--    시작해서 100 증가하는 것 만들고,
--    테이블 seq_test 테이블(num , name, phone)  만들기. 
--    레코드 3개 추가해서 확인하기


