-- ���� �����Լ� -------------------------------
select round(12.345678935, 0),
    round(12.345678935, 2), round(12.545678935, 0) from dual;
    
select ceil(12.34), ceil(-12.34) from dual; -- �ø��� �� ���� ��ȯ
select floor(12.34), floor(-12.34) from dual; -- ���� �� �� ���� ��ȯ

select trunc(12.3456, 2), trunc(12.3768, 2), trunc(12.7456, 0), trunc(12.3457, 0) from dual;

-- ���ڿ� �Լ� -----------------------------------------------
select instr('abcd', 'b') from dual;  -- 2
select instr('abcdefghijboy', 'b', -1) from dual;  --  -1�̸� �ڿ������� ã�´�
select id, instr(id, 'a') from professor;
select id, instr(id, 'a', -1) from professor;

select lpad('abcd', 20, '#') from dual;
select rpad('abcd', 20, '@') from dual;
select rpad(email, 20, '%') from professor;
select rpad(dname, 10, '*') from dept2;

select LENGTH('CANDIDE') from dual;
select LENGTHb('CANDIDE') from dual;
select dname, LENGTH(dname), LENGTHB(dname) from dept2;

select substr('1234567890', 3) from dual;
select substr('1234567890', 3, 2) from dual;
select dname, substr(dname, 3) from dept2;
select dname, substr(dname, 2, 3) from dept2;

select rpad(dname, 10, substr('1234567890', length(dname)+1) ) "RPAD����" from dept2;

select * from student where deptno1 = 103;
select name, rtrim(REGEXP_replace(name, '(.)', '\-1'), '-') "������" 
    from student
    where deptno1 = 103;
    
select name, birthday, rtrim(REGEXP_replace(birthday, '(/)', '\\'), '-') "������" 
    from student
    where deptno1 = 103;

-- ��¥�Լ� --------------------------------------------------
select sysdate from dual;
select name,hiredate,  MONTHS_BETWEEN(SYSDATE, hiredate)  from professor;
select MONTHS_BETWEEN( to_date('02-17-2017', 'MM-DD-YYYY'), to_date('01-01-2016', 'MM-DD-YYYY') ) "Months" from dual;

select round(MONTHS_BETWEEN( to_date('02-17-2017', 'MM-DD-YYYY'), 
                             to_date('01-01-2016', 'MM-DD-YYYY') ), 0) "Months" from dual;

select name,hiredate,  add_months(hiredate, 3)  from professor;

select to_char( ADD_MONTHS(hiredate, 1), 'DD-MON-YYYY' ) "Next Month" 
    from professor 
    where name='�ɽ�';

select next_day(sysdate, 3) from dual;
select hiredate, next_day(hiredate, 1) from professor;

-- ����ȯ �Լ� -----------------------------------------
select sysdate, to_char(sysdate , 'YYYY-MM-DD') from dual;
select to_char(sysdate , 'YYYY-MM-DD HH:MI:SS') from dual;
select to_char(sysdate , 'YYYY-MM-DD HH24:MI:SS') from dual;
select to_char(sysdate , 'YY-MM-DD HH24:MI:SS') from dual;

select to_char(2000, '999,999') from dual;
select to_char(2000, '$999,999') from dual;
select  to_char(2000, 'L999,999') from dual;

select pay, to_char(pay, 'L999,999,999,999,999') from emp2;

-- Oracle SQL_PLSQL_PPT > 2, 3�� �ǽ�  
--���� �Լ� ���� 1)
Student ���̺��� �����ؼ� �Ʒ� ȭ��� ���� 1 ������(deptno1 �÷�) 
101���� �л��� �̸��� ��ȭ��ȣ�� ������ȣ�� ����ϼ���. 
�� ������ȣ�� ���ڸ� ���;� �մϴ�. <2�� 19������>
 select  tel, instr(tel,')')  from student;

select tel, instr(tel,')') 
    from student  -- index string
    where deptno1 = 101;

--substr(tel, ������ġ, ��������);
--substr(tel, ������ġ);

select name, tel, substr(tel, 1, instr(tel,')') -1) "������ȣ"
    from student
    where deptno1 =101;

���� �Լ� ���� 3)
Dept2 ���̺��� ����Ͽ� dname �� �������� ����� 
�������� ������ �ۼ��ϼ���. <2�� 23������>  -- ����Ŭ ������ ���� �ѱ� ���� �ٸ� 
select * from dept2;

select rpad(dname, 10,
        substr('1234567890', lengthb(dname)-2)) "RPAD����"
    from dept2;
    --where dname is not null;

select rpad(dname, 10,
        substr('1234567890', length(dname)+1)) "RPAD����"
    from dept2;







