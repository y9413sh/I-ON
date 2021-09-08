//html 요소 1개 검색/찾기
let boxEl = document.querySelector('.box');
let boxE = document.querySelectorAll('.box');
let boxEls = document.querySelectorAll('.box');
console.log("boxEls : " + boxEls);


boxEls.forEach(function() {});

// 첫 번째 매개변수(boxEl) : 반복 중인 요소
// 두 번째 매개변수(index) : 반복 중인 번호
boxEls.forEach(function(boxEls, index) {});

//출력
boxEls.forEach(function(boxE,index){
    boxE.classList.add(`order-${index+1}`);
    console.log(index, boxE);
});


// //html 요소에 적용할 수 있는 메소드
// boxEl.addEventListener();
//인수(Arguments)를 추가 기능
// boxEl.addEventListener(1,2);
// //1-이벤트(Event, 상황)
// boxEl.addEventListener('click', 2);
// //2-핸들러(Handler, 실행할 함수)
boxEl.addEventListener('click', function() {
    alert('눌렀네요.');
    console.log('Click~~~');
});

boxEl.classList.add('active');
console.log(
    boxEl.classList.contains('active')
);

boxEl.classList.remove('active');

console.log(
    boxEl.classList.contains('active')
);

//요소가 갖고 있는 문자
const boxEl2 = document.querySelector('.box');

//Getter, 값을 얻는 용도
console.log(boxEl2.textContent);
boxEl2.textContent='happyyyy';
console.log(boxEl2.textContent);

const str = 'I-ON';
//split : 문자를 인수 기준으로 쪼개서 배열로 반환
//reverse : 배열을 뒤집기
// join : 배열을 인수기준으로 문자로 변합해 반환

const str2 = str.split('').reverse().join('') // 메소드 체이닝

console.log(str)
console.log(str2)