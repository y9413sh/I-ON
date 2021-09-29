-- 문제 풀기
문제1]empno 사원번호, 이름, 급여 직급 필드만 출력(별칭을 준다) 부장이면서 일지매인 사람 검색
select empno 사원번호, name "이   름", pay "급  여", position as 직급
    from emp2 
    where position = '부장' and name='일지매';
    
문제2] 필드 출력은 위와 같고, 조건이 과장 이거나 김문호 인 사람 검색  (emp2)
문제3] 급여가 500이상이고, 보너스가 60 이상 받는 교수는?
select * from professor where pay >=500 and bonus >= 60 and bonus is not null;
select * from professor where pay >=500 and nvl(bonus, 0) >= 60 ;

문제4] 이름에서 '김영조' 사람들을 보여주세요.
문제5] 이름에서 '김'씨 성을 가진 사람들을 보여주세요.  - 모든 : % , 한글자 : _
문제6] 이름이 두 글자인 사람 보여주세요.
문제7] id에 s or a 글자가 들어가는 사람 찾기
문제8] 전임강사 찾아주세요
문제9] 이름이 '나한라'를 '너한나'로 변경하세요
문제10] 취미가 등산인 사람들만 찾아서 '수영'으로 변경
문제11] 계약직 직원 찾아서 삭제하기
문제12] pay(or bonus)가 50 이상인 사람만 출력
문제13] 정규직이면서 '백원만' 찾기
문제14] 정규직이거나 '유도봉' 찾기    
문제15] 수습직이거나 김씨성을 가진 사람 찾기    
문제16] 김씨가 아닌 수습직원 찾기
문제17] 교수테이블에서 교수들의 이름을 조회하여 성씨 부분에 'ㅈ' 이 포함된 사람의 명단을 출력하세요
SELECT * 
    FROM PROFESSOR
    WHERE NAME >= '자%' AND NAME < '차%';  -- 이름에 ㅉ 들어간것까지 나옴
    
SELECT * 
    FROM PROFESSOR
    WHERE NAME >= '자%' AND NAME < '짜%';  -- 
    
select *from professor where name between '자%' and '짛%';
select * from professor where name like '조%' or name like '주%';



