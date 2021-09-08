import getType from './test.js'

console.log(typeof 'hello world')
console.log(typeof 123)
console.log(typeof true)
console.log(typeof undefined)
console.log(typeof null)
console.log(typeof this)
console.log(typeof {})
console.log(typeof console)

let a = 9;

console.log(getType(123))
console.log(getType(false))

a = 99;