// 즉시실행함수

const d = 3
function doubleFunc() {
    console.log(d*2)
}

// doubleFunc()
(function() {
    console.log(d*2)
})


// 화살표 함수
// () => {} vs function() { }
const doubleFn = function(x,y) {
    return x*2
}
console.log('doubleFn: ', doubleFn(7,5,8))
console.log('doubleFn: ', doubleFn(3,5,6))

// const doubleArrow = (x,y) => {
//     return x*2
// }

// arrow 함수는 return 생략 가능
// const doubleArrow = x => x*2
// const doubleArrow = x => 100
// const doubleArrow = x => 12.34
// const doubleArrow = x => "asda"
// const doubleArrow = x => [1,2,3]
const doubleArrow = x => ({name: 'Yuna', age:55, gender:'m'})

console.log('doubleArrow: ', doubleArrow(7))

// 함수
function sum2() {
    console.log(arguments)
    return arguments[0]
}

console.log(sum2(7,3))

const sum = function(x, y) {
    return x+y
}

console.log(sum(30,50))

// function sum(x, y) {
//     return x+y
// }

//sum(7,8)
//sum(10, 32)
console.log(sum(1,3)+sum(10,20))
const b = sum(1,3)
console.log(b)

// let, const <--- 블록레벨
// var <--- 함수레벨

function scope() {
    
    if(true) {
        var a=123
        console.log(a)    
    }
}

scope()