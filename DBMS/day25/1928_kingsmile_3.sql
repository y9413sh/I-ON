-- Join -----------pk - fk �����϶� ���-----------------------
select * from dept; -- 4 row
select * from emp;  -- 12 row

select * from dept, emp;
/*
select �÷��� , .....
    from ���̺��̸� ��Ī [Inner] join ���̺��̸� ��Ī
    on ��Ī.�÷��� = ��Ī.�÷���
*/
select emp.ename, emp.job, sal from emp;

select emp.ename, emp.job, sal, dname, loc , dept.deptno
    from emp, dept, professor;
    
select ename, job, sal, loc, d.deptno, dname
    from emp e inner join dept d
    on e.deptno = d.deptno;

insert into emp values(0202, 'kingsmile', 'manager', 7777, to_date('1-5-2012', 'dd-mm-yyyy'), 2850, null, 20);
select * from emp;
desc emp;
-- left outer join : ���ʿ� �ִ� ������ ���, ������ ��ġ�ϴ� �����͸�,...
select ename, job, sal, loc, d.deptno, dname
    --from emp e left  join dept d
    from dept d  left  join emp e
    --on e.deptno = d.deptno;
    on  d.deptno = e.deptno;

-- right outer join : �����ʿ� �ִ� ������ ���, ���� ��ġ�ϴ� �����͸�,...
select ename, job, sal, loc, d.deptno, dname
    --from emp e right  join dept d
    from dept d  right  join emp e
    --on e.deptno = d.deptno;
    on  d.deptno = e.deptno;
    
-- full outer join
select ename, job, sal, loc, d.deptno, dname
    from emp e full outer  join dept d
    --from dept d  full outer  join emp e
    on e.deptno = d.deptno;
    --on  d.deptno = e.deptno;

inner join =
left outer join *=
right outer join =*

/*
- �������� ���̺� ����
select �÷��� , .....
    from ���̺��̸� ��Ī [Inner] join ���̺��̸� ��Ī
    on ��Ī.�÷��� = ��Ī.�÷��� [Inner] join ���̺��̸� ��Ī
    on ��Ī.�÷��� = ��Ī.�÷��� ...
*/
select * from professor;  -- 16 row profno, deptno, name
select * from student;  -- 20 row  deptno1,deptno2, profno, name
select * from department;  -- 12  deptno, dname

--select s.name || '�л��� ��米����' ||p.name || ' �������̰� ��� �а��� ' || d.dname
select s.name ,p.name , d.dname
    from professor p join student s
    on p.deptno = s.deptno1  join department d
    on d.deptno = s.deptno1 ;
    --on d.deptno = p.deptno ;
    
select * from department;
select * from professor;

--select s.name || '�л��� ��米����' ||p.name || ' �������̰� ��� �а��� ' || d.dname
select s.name ,p.name , d.dname
    from professor p join student s
    on p.deptno = s.deptno1  join department d
    on d.deptno = s.deptno1 
    --where s.deptno1 = 103;
    where d.dname = '��ǻ�Ͱ��а�';
    
    


