-- Join -----------pk - fk 관계일때 사용-----------------------
select * from dept; -- 4 row
select * from emp;  -- 12 row

select * from dept, emp;
/*
select 컬럼명 , .....
    from 테이블이름 별칭 [Inner] join 테이블이름 별칭
    on 별칭.컬럼명 = 별칭.컬럼명
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
-- left outer join : 왼쪽에 있는 데이터 모두, 오른쪽 일치하는 데이터만,...
select ename, job, sal, loc, d.deptno, dname
    --from emp e left  join dept d
    from dept d  left  join emp e
    --on e.deptno = d.deptno;
    on  d.deptno = e.deptno;

-- right outer join : 오른쪽에 있는 데이터 모두, 왼쪽 일치하는 데이터만,...
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
- 여러개의 테이블 조인
select 컬럼명 , .....
    from 테이블이름 별칭 [Inner] join 테이블이름 별칭
    on 별칭.컬럼명 = 별칭.컬럼명 [Inner] join 테이블이름 별칭
    on 별칭.컬럼명 = 별칭.컬럼명 ...
*/
select * from professor;  -- 16 row profno, deptno, name
select * from student;  -- 20 row  deptno1,deptno2, profno, name
select * from department;  -- 12  deptno, dname

--select s.name || '학생의 담당교수는' ||p.name || ' 교수님이고 담당 학과는 ' || d.dname
select s.name ,p.name , d.dname
    from professor p join student s
    on p.deptno = s.deptno1  join department d
    on d.deptno = s.deptno1 ;
    --on d.deptno = p.deptno ;
    
select * from department;
select * from professor;

--select s.name || '학생의 담당교수는' ||p.name || ' 교수님이고 담당 학과는 ' || d.dname
select s.name ,p.name , d.dname
    from professor p join student s
    on p.deptno = s.deptno1  join department d
    on d.deptno = s.deptno1 
    --where s.deptno1 = 103;
    where d.dname = '컴퓨터공학과';
    
    


