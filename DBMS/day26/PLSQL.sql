create or replace procedure s_info (search_dname in department.dname%type)
is
    sname student.name%type;
    pname professor.name%type;
    dname department.dname%type;
    
    cursor cs is
        select s.name, p.name, d.dname
        from professor p join student s 
        on p.profno = s.profno join department d
        on d.deptno = s.deptno1
        where d.dname = search_dname;
begin
    open cs; -- 커서 열기
    
    loop
        fetch cs into sname, pname, dname; -- 커서로 데이터 읽기
        exit when cs%NOTFOUND;
        dbms_output.put_line( sname || '학생의 담당교수는 ' || pname || ' 교수님이고 담당 학과는 ' || dname || ' 입니다.');
    end loop;

    close cs;
end;

exec s_info('컴퓨터공학과');