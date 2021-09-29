-- SubQuery -----------------------------------------
-- ex) select * from emp where ename = ( ������������ ) ; 
select * from emp2;
select * from emp2 where name='�����';
select * from emp2 where pay > 60000000;

select * from emp2 where pay > ( select pay from emp2 where name='�����');

--����1]emp2 ��� �޿����� ���� ������ ����ϼ���.
select * from emp2 where pay <(select avg(pay) from emp2);

--����2]�л� ���̺��� 1�г�(grade) ��� Ű���� ū ����� ����ϼ���
select * from student where height > (select avg(height) from student where grade=1);

--����3]�л� ���̺�, �а� ���̺��� ����Ͽ� ������ �л��� ����(deptno1)�� 
--    ������ �л����� �̸��� �а� �̸� ����ϼ���.
select s.name, dname
    from student s  join department d
    on s.deptno1=d.deptno
    where s.deptno1 = (select deptno1 from student where name='������');
    
select s.name, dname
    from student s , department d
    where s.deptno1 = (select deptno1 from student where name='������')
    and s.deptno1=d.deptno;
      

-- ����4]���� ���̺��� �Ի����� �۵��� �������� ���߿� �Ի��� ����� �̸�, �Ի���, �а����� ����Ͻÿ�
select name, hiredate, dname
    from professor  join department using (deptno)
    where hiredate > (select hiredate from professor where name='�۵���');
    
select name, hiredate, dname
    from professor p , department d
    where hiredate > (select hiredate from professor where name='�۵���')  -- 98/03/22
    and p.deptno = d.deptno;
    
-- ����5] �л� ���̺��� ������ 101�� �а��� ��� �����Ժ���  �����԰� ���� �л����� �̸��� �����Ը� ����ϼ���.
select name, weight from student where weight > (select avg(weight) from student where deptno1=101);

-- ���������� ����� �� �� �̻� ��ȯ�ɶ��� in , any, all �����ڸ� �����.
select empno, name, deptno 
    from emp2
    where deptno in( 1000, 1001, 1002, 1010, 2000, 2001 );
    

select dcode from dept2 where area='��������';

select empno, name, deptno
    from emp2
    where deptno in(select dcode from dept2 where area='��������');

--1. EMP2 ���̺��� ����Ͽ� ��ü ���� �� ���� ������ �ּ� �����ں��� ������ 
--    ���� ����� �̸��� ����,������ ����ϼ���. 
--    �� ���� ��� ������ �Ʒ��� ���� õ ���� ���б�ȣ�� �� ǥ�ø� �ϼ���
  select name, position ,to_char(pay, 'L999,999,999') from emp2 where pay  > 
                                (select min(pay) from emp2 where position = '����');

--2. student ���̺��� ��ȸ�Ͽ� ��ü �л� �߿��� ü���� 4�г� �л����� ü�߿��� ���� ���� ������ �л����� ���� �л��� �̸��� �г�� �����Ը� ���.


--3. student ���̺��� ��ȸ�Ͽ� �� �г⺰�� �ִ� Ű�� ���� �л����� �г�� �̸��� Ű�� ���.
--4. professor ���̺��� ��ȸ�Ͽ� �� �а����� �Ի����� ���� ������ ������ ������ȣ�� �̸�, �Ի���, �а����� ���. 
--    ��, �а�������� �������� ����.




