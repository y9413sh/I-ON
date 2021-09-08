import random from "../js/test2.js"

//비교연산자(comparison operator)
const a = 1 === 1
const b = 'AB' === 'AB'
const c = false

console.log(a===b)
console.log(a!==b)
console.log('----------')
console.log(a)
console.log(b)
console.log(c)
console.log('&& : ', a && b && c)
console.log('|| : ', a || b || c)
console.log('----------')
// = 대입연산자 , == 타입은 비교 안함, === 타입까지 비교함

function isEqual(x, y) {
    return x==y 
}

console.log(isEqual(1,1))
console.log(isEqual(2,'2'))

console.log(a>b)

const d = 2<=2
if(d) {
    console.log('참')
} else {
    console.log('거짓')
}

console.log(d ? '참' : '거짓')
let rand = Math.random() * 10
console.log('rand : ', rand)
console.log(Math.floor(rand))
console.log(Math.floor(Math.random() * 10))

const e = random();
console.log('----------------')
if(e === 0) {
    console.log('e is 0')
} else {
    console.log(e + ' reset..........')
}
switch(e) {
    case 0:
        console.log('e is 0')
        break;
    case 2:
        console.log('e is 2')
        break;
    case 4:
        console.log('e is 4')
        break;
    default:
        console.log(e + 'reset...')
}

for(let i=0; i<3; i+=1) {
    console.log(i)
}

const ulEl = document.querySelector('ul')

for(let i=0; i<10; i+=1) {
    const li = document.createElement('li')
    li.textContent=`list-${i+1}`
    if((i+1)%2===0) {
        li.addEventListener('click', function(){
            console.log(li.textContent)
        })
    }
    ulEl.appendChild(li)
}
