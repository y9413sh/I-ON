-- ����(�׷�) �Լ�
select sum(height), sum(weight) from student;
select avg(height) as "���Ű", avg(weight), max(height) "����ū�л�", min(height) from student;

select count(*) from professor;  -- count(*) : NULL ���� ���� 
select count(bonus), count(name) from professor; -- count(�ʵ��) : null ���� ��� ������ ���� 

select * from professor;

SELECT RANK(68000000) within GROUP(ORDER BY pay desc)
    FROM EMP2;
    
SELECT RANK(490) within GROUP(ORDER BY pay desc)
    FROM professor;  -- 5��
    
SELECT RANK(90) within GROUP(ORDER BY bonus desc)
    FROM professor
    where bonus is not null; --

-- oracle �� null ���� �켱 ������ ����. myslql�� null ���� �켱���� ����.    
select name, pay, bonus from professor order by bonus desc;

--Ű�� 168�� ����� �� ��°�� ū�� Ȯ��

--�����԰� 58�� ����� �� ��°���� ��� ���ϱ� 

--g_end�� 200000, 600000 ���� ���� �� ��� (any ����Ұ�)
select * from gift;
select * from gift where g_end < any(200000, 600000); -- �˻������ �ϳ��̻��� ��ġ�ϸ� ��
select * from gift where g_end > any(200000, 600000);

select * from gift where g_end < all(200000, 600000); -- �˻������ ��� ���� ��ġ�ϸ� ��.
select * from gift where g_end > all(200000, 600000);

-- 8. �������� ����
-- CONSTRAINT ��Ī PRIMARY key,  ��Ī : ���̺��_�ʵ��_���� ��) board_id_pk
CREATE TABLE userlist(
    id VARCHAR2(10) CONSTRAINT id_pk PRIMARY key,  -- �⺻Ű, �ߺ��ȵǰ� not null��.
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
    id VARCHAR2(10) CONSTRAINT userlist2_id_pk PRIMARY key, -- �ߺ� �ȵ�, null ��� �ȵ�
    jumin char(13) CONSTRAINT jumin_un unique  -- null ���, �ߺ��� �ȵ�
);

select * from userlist2;
insert into userlist2 values('kingsmile', '1234'); 
insert into userlist2(id) values('gildong'); 
insert into userlist2(id, jumin) values('gildong2', '12345');
insert into userlist2 values('happy', '1004');



    