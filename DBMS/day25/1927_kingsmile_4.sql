-- 집계(그룹) 함수
select sum(height), sum(weight) from student;
select avg(height) as "평균키", avg(weight), max(height) "제일큰학생", min(height) from student;

select count(*) from professor;  -- count(*) : NULL 포함 개수 
select count(bonus), count(name) from professor; -- count(필드명) : null 있을 경우 미포함 개수 

select * from professor;

SELECT RANK(68000000) within GROUP(ORDER BY pay desc)
    FROM EMP2;
    
SELECT RANK(490) within GROUP(ORDER BY pay desc)
    FROM professor;  -- 5위
    
SELECT RANK(90) within GROUP(ORDER BY bonus desc)
    FROM professor
    where bonus is not null; --

-- oracle 은 null 값이 우선 순위가 높다. myslql은 null 값이 우선순위 낮다.    
select name, pay, bonus from professor order by bonus desc;

--키가 168인 사람은 몇 번째로 큰지 확인

--몸무게가 58인 사람은 몇 번째인지 등수 구하기 

--g_end가 200000, 600000 보다 작은 값 출력 (any 사용할것)
select * from gift;
select * from gift where g_end < any(200000, 600000); -- 검색결과와 하나이상이 일치하면 참
select * from gift where g_end > any(200000, 600000);

select * from gift where g_end < all(200000, 600000); -- 검색결과의 모든 값이 일치하면 참.
select * from gift where g_end > all(200000, 600000);

-- 8. 제약조건 종류
-- CONSTRAINT 별칭 PRIMARY key,  별칭 : 테이블명_필드명_성격 예) board_id_pk
CREATE TABLE userlist(
    id VARCHAR2(10) CONSTRAINT id_pk PRIMARY key,  -- 기본키, 중복안되고 not null임.
    name varchar2(10) -- not null
);

select * from userlist;  
insert into userlist values('kingsmile', 'doyeon'); 
insert into userlist(id) values('gildong');
insert into userlist(name) values('gildong'); -- error 

CREATE TABLE fk_member(
    code number(2) NOT NULL ,
    id VARCHAR2(20) NOT NULL
    CONSTRAINT id_fk REFERENCES MEMBER(id) ,
    etc VARCHAR2(10)
);

select * from member;
desc member;

CREATE TABLE userlist2(
    id VARCHAR2(10) CONSTRAINT userlist2_id_pk PRIMARY key, -- 중복 안됨, null 허용 안됨
    jumin char(13) CONSTRAINT jumin_un unique  -- null 허용, 중복은 안됨
);

select * from userlist2;
insert into userlist2 values('kingsmile', '1234'); 
insert into userlist2(id) values('gildong'); 
insert into userlist2(id, jumin) values('gildong2', '12345');
insert into userlist2 values('happy', '1004');



    