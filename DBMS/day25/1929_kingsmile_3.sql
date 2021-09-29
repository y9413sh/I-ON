-- View -------------------------------------------
/*
create or replace view ���̸�
    as    select ~
*/
create or replace view v_emp
    as select empno, ename, deptno from emp;
    
select * from v_emp;

-- emp ���̺� �����ϸ� v_emp ?  O (���ŵ�)
-- v_emp ���̺� �����ϸ� emp ?  X (���žȵ�)

create view v_emp_30
    as select job, ename, sal from emp where deptno=30;

select * from v_emp_30;

--����1] 30�� �μ� ������� ����, �̸�, ������ ���� view  ���̺� �����, ��Ī ����, ����̸�, �޿��� Alias �ְ�
--    ������ 2000���� ���� ����鸸 �����ؼ� �� �����
create view v_emp30                                      --where  sal > 2000 and deptno=30;
    as select job ����, ename ����̸�, sal �޿� from emp  where deptno=30 and sal > 2000;

select * from v_emp30 ;
   
--����2] �μ���(�κ���==�Ұ�) �ִ�޿�, �ּұ޿�, ��ձ޿��� ���� �� �����
create or replace view v2_emp
    as select deptno, max(sal) �ִ�޿�, min(sal) �ּұ޿�, round(avg(sal), 2) ��ձ޿� from emp group by deptno;

select * from v2_emp;

--����3] �μ��� ��ձ޿��� ���� �並 ����µ�, ��� �޿��� 2000�̻��� �μ��� ����ϼ���.
CREATE VIEW V_EMP_3 AS(
    SELECT DEPTNO AS �μ���ȣ, ROUND(AVG(SAL),2) AS ��ձ޿� FROM EMP
        GROUP BY DEPTNO HAVING AVG(SAL)>2000);

select * from v_emp_3;

--����4] ������ �ѱ޿��� ���� �� ���̺� �����, ����(job)�� manager�� ������� �����ϰ� �ѱ޿��� 3000�̻��� ����� ����ϱ�
CREATE OR REPLACE VIEW v_emp_50 
    AS SELECT JOB, SUM(SAL) AS "�ѿ���" 
        FROM EMP 
        WHERE JOB != 'MANAGER' or  JOB <> 'manager' --  WHERE JOB <> 'MANAGER' 
        GROUP BY JOB HAVING SUM(SAL)>=3000;

-- SQL ���Ǿ� ����� ��ҹ��� ���� ���Ѵ�. ���ڵ忡 ���� ���� ��ҹ��� ������.(����Ŭ)
select * from emp;

-----------------------------------------------------
����7] ���� ���̺��� ���̺� ������ ����� c_professor ���ο� ���̺� 
     ����(�̸�, ����, �Ի���, �̸���, Ȩ������)�ϰ� ���ڵ� ���� �ϱ�
--------------------------------------------------------
����8] c_emp22 ���̺��� �������� ���� c_emp22�� ���弼��
--------------------------------------------------------
����9] emp ���̺��� c_emp22�� ������ 'manager'�� 
      ����鸸 ���ڵ� �����Ͻÿ�.
----------------------------------------------------------
--  rownum / rowid ----------------------------------
SELECT ROWNUM, ename, sal FROM emp;
SELECT ROWNUM, ename, sal FROM emp where rownum = 1;
SELECT ROWNUM, ename, sal FROM emp where rownum = 11;

select rownum, ename, rowid from emp;  -- �Խ��ǿ� ����¡ ó���Ҷ� ��� rownum  cf) mysql - limit 

SELECT ROWNUM, ename, sal
    FROM (SELECT * FROM EMP ORDER BY sal);
    
-- Sequence ------------------------------------
create sequence �������̸� -- 1���� ����
    [start with ���۰� ]
    [increment by ����ġ ]
    [maxvalue �ִ밪 ]
    [minvalue �ּҰ� ]
    [cycle | nocycle ]
    [cache | nocache ];
    
drop sequence autonum;
create sequence autonum;  -- 1���� �����ؼ� 1�� �����Ѵ�

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


--����]�ڵ����� ���������� seq_test ��� �����ϰ� 100 
--    �����ؼ� 100 �����ϴ� �� �����,
--    ���̺� seq_test ���̺�(num , name, phone)  �����. 
--    ���ڵ� 3�� �߰��ؼ� Ȯ���ϱ�


