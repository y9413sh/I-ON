-- ����� ����
create user happy identified by oracle account UNLOCK;
-- ���� �ο�
grant connect, resource to happy;

grant create session, create table, create view,
        create sequence, create procedure to happy;
        
        
-- ora-01950 ���� �ذ�
-- alter user [������] default tablespace users quota unlimited on users;
alter user kingsmile default tablespace users quota unlimited on users;