-- update ��ɾ�
-- UPDATE ���̺�� SET �����Ǿ�� �� Į���� = �����Ǳ⸦ ���ϴ� ���ο� ��;  -- ���ڵ� ��ü ����
-- UPDATE ���̺�� SET �����Ǿ�� �� Į���� = �����Ǳ⸦ ���ϴ� ���ο� �� whereh ����;  --

select * from professor where position= '������';

update professor set pay = pay + 100;  -- ���ڵ� ��ü ����
ROLLBACK; -- ���
update professor set pay = pay + 100 where position= '������'; -- ���ǿ� �´� ���ڵ常 ����
commit; -- �Ϸ�

-- delete ��ɾ�
-- DELETE [FROM] ������ ���ϴ� ������ ����ִ� ���̺��; -- ���ڵ� ��ü ����(����)
-- DELETE [FROM] ������ ���ϴ� ������ ����ִ� ���̺�� where ����; -- ���ǿ� �´� ���ڵ� ����(����)
delete from emp2;  
select * from professor where position like '��%';
delete professor where position like '��%';
select * from emp2;

update emp2 set name='�ʻ���', hobby='����' where name='������';
rollback; -- DML( select, update, delete, insert ) ��ɾ ����
-- truncate table ���̺��̸� ;
truncate table emp2; --where deptno = 1000;

-- ������ 
select mod(7, 3) "���� ������ ��" from dual;
-- null ������ ����� ������ ���̴�.
select * from professor;
desc professor;  -- ���̺��� ���� Ȯ��
-- nvl �Լ�
update professor set bonus = bonus + 1000 ;
update professor set bonus = nvl(bonus, 0) + 1000 ;
select bonus, nvl(bonus, 0) from professor; 

select name, deptno from professor where deptno = 101 or deptno = 201 or deptno = 301;
select name, deptno from professor where deptno in(101, 201, 301);  -- ����

select name, deptno from professor where deptno != 101 and deptno != 201 and deptno != 301;
select name, deptno from professor where deptno not in(101, 201, 301); 

select * from professor;
select * from professor where pay between 300 and 500;
select * from professor where deptno between 103 and 300;

select * from professor where pay not between 300 and 500;
-- between ���� ����
select * from professor where pay between 500 and 300; -- �տ� ���� �ڿ� ������ �׻� �۾ƾ��Ѵ�.
-- % , _ , like
select * from professor where email like 'a_g%';
select * from professor where email like '%a%';
select * from professor where email like '__a%';

select * from professor where email not like '__a%';
-- is null / is not null
select * from professor where hpage is null;
select * from professor where hpage is not null;






