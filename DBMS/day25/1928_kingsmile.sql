select sysdate from dual;

CREATE TABLE ck_Test(
    NAME VARCHAR2(10) NOT NULL,
    age NUMBER(2) NOT NULL  CHECK (age BETWEEN 20 AND 30 ),  --age�÷��� ���� 20~30���̸� ���
    gender char(2) CHECK (gender in('��', '��'))    -- �̷����ϴ� ���� ���׿�. ^^;;    
);
select * from ck_test;

insert into ck_test values('park', 22);
insert into ck_test values('kang', 30);
insert into ck_test values('kim', 50);
insert into ck_test values('lee', 35);

CREATE TABLE de_Test(
    NAME VARCHAR2(10) NOT NULL,
    addr VARCHAR2(10) DEFAULT '����'
);

select * from de_test;
insert into de_test values('tt', 'ss');
insert into de_test(name) values('gg'); --
insert into de_test values('kk', default);
insert into de_test values('tt', '�λ�');
insert into de_test(name) values('kbs');

-- ���̺� ���� / ���� -----------------------------------------
/*
�� �÷��߰�
alter table ���̺��̸� add (�÷��� �ڷ��� [��������] , �÷��� �ڷ��� [��������] , ....)
*/

SELECT * FROM de_test;
alter table de_test add phone varchar2(15);
alter table de_test add (age number, jumin varchar(13), reg_date date ) ;
update de_test set phone =' ';

/*
�� �÷�����
alter table ���̺��̸� drop column �÷��̸�
*/
alter table de_test drop column age;
alter table de_test drop (addr, phone);

/*
�� datatype����
alter table ���̺��̸� modify �÷��̸� �����ڷ���
*/
desc de_test;
alter table de_test modify jumin number;
alter table de_test modify name date;  -- ���ڵ尡 �� 1���� �Է� �Ǿ� �ִٸ� Ÿ�� ���� ����
delete de_test; -- where name = ;

/*
�� �÷��̸� ����
alter table ���̺��̸� rename column �����÷��� to �����÷���
*/
alter table de_test rename column name to irum;

/*
�� ���̺� ����
drop table ���̺��̸�
*/
drop table de_test;

SELECT * FROM de_test;
desc de_test;

-- �����Լ� ���� Group by ------------------------------------
select sum(height), sum(weight) from student;

select grade, sum(height), sum(weight)   -- �Ϲ��ʵ�� �׷�(����) �ʵ�� ���� ���� ����.
    from student
    group by grade;  -- �κ���(�Ұ�)
    
-- emp_type ���� pay ��, ���, �ְ�޿�, ���ϱ޿� ���ϱ�
select emp_type, sum(pay), avg(pay), max(pay), min(pay) 
    from emp2
    group by emp_type;

-- ���� : where, having �� �̿��Ѵ�.

select grade, sum(height), avg(height)   
    from student
    group by grade
    having avg(height) > 173; 

select deptno as "��   ��", round(avg(nvl(pay,0)), 0) "��� �޿�"
    from professor
    group by deptno
    having avg(pay) > 400;

select * from department;

����1] emp2 ���̺��� deptno(�μ�)���� pay �հ� ��� ���ϱ�
����2] emp2 ���̺��� emp_type���� pay �հ� ��� ���ϱ�
����3] emp2 ���̺��� ���޺�(position)���� �޿��� ��, ���
����4] emp2 ���̺��� ���޺�(position)���� �޿��� ��, ��� ���ϴµ�, ������ ������ ����鸸 ����ϱ�
 select position, sum(pay), avg(pay) from emp2 GROUP BY position having position ='����';       






