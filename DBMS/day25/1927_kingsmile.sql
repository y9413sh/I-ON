select * from tab;
select * from emp2;
select sysdate from dual;  -- dual ���� ���̺� 

-- ���̺� ����
/*
create table ���̺��̸�(
    �÷��� datatype [ null | not null ] [ constraint ��Ī �������� ] ,
    �÷��� datatype [ null | not null ] [ constraint ��Ī �������� ] ,
    .....
)
*/
select * from test;
create table Test (
    name VARCHAR2(10), 
    age number(3) 
);
-- insert
-- INSERT INTO ���̺�� VALUES (��ü COLUMN�� ���� VALUE_LIST);
insert into test values('aa', 10);
-- INSERT INTO ���̺��(COLUMN_LIST)VALUES (COLUMN_LIST�� ���� VALUE_LIST); 
insert into test(age, name) values(22,'bb');

insert into test(name) values('dd');
insert into test(age) values(33);

-- ���̺� ���� drop
drop table test;
select * from test;
create table Test (
    name VARCHAR2(10) not null, 
    age number(3) 
);

-- select ��ɾ�
/*
SELECT *
	FROM tables  ;
	[WHERE conditions; ]
*/
select * from emp2;
select empno, name, deptno from emp2;  -- Ư�� �ʵ常 ����

select * 
    from emp2
    where name='�����';
    
select * 
    from emp2
    where name like '��%';   -- % : ���, _ : �ѹ��� <== like


select * 
    from emp2
    where name like '_��%'; 

select * 
    from emp2
    where name like '%��%'; 

select * 
    from emp2
    where name like '__';  
    
select * 
    from professor
    where name like '__';   -- �̸��� �α����� ��� �˻� 

select * 
    from professor
    order by name; -- ���� - �������� : asc , �������� : desc
    
select * 
    from professor
    order by name desc, pay desc, position;    

select * 
    from professor
    order by 2 desc, 5 desc, 4; 
    
select * 
    from professor
    where deptno like '20%'
    order by 2 desc, 5 desc, 4; 

select name, empno --, position 
    from emp2
    where position='����';
    
select * 
    from professor
    where pay >= 350;
    --where pay <= 350;
 
select * 
    from professor
    --where pay >= 350;
    where pay <= 350
    --order by pay; -- asc : ��������   
    order by pay desc; -- desc : ��������   

select * 
    from professor
    --where pay >= 350;
    where pay <= 350
    --order by pay; -- asc : ��������   
    order by pay desc, name, profno asc; -- desc : �������� 
    
select * 
    from professor
    where pay < 350 or pay >=490;

select * 
    from emp2
    where hobby ='����' or hobby='���';
    
select * 
    from emp2
    where hobby ='����' and emp_type='������';    
    
select empno as "�����ȣ", name "��  ��", position ����, pay "��    ��"
    from emp2;    
    
select name || position || '��'
    from professor;
    
select distinct emp_type from emp2; -- distinct : �ߺ�����
select distinct position from professor;
    
    
    