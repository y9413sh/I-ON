const result = "Hello World!".indexOf('World')
console.log(result)

const str = 'happy@gmail.com'
console.log(str.match(/.(?=@)/)[0])

const msg = '   Hello world    '
console.log(msg.length)
const msg1 = msg.trim()
console.log(msg1, msg1.length)

const pi= 3.141592747
console.log(pi)

const s1 = pi.toFixed(2);
console.log(s1)
console.log(typeof s1)

const integer = parseInt(s1)
const float = parseFloat(s1)

console.log(integer)
console.log(float)
console.log(typeof integer, typeof float)

//
const cars = ["Saab", "Volvo", "BMW"];
const numbers = [1, 2, 3];
console.log(numbers)
console.log(cars)
console.log(numbers[2])
console.log(cars[1])

console.log([].length)
console.log(numbers.concat(cars))

const ages = [3, 10, 18, 20]

function checkAge() {
    return ages > 18
}

function myFunction() {
    document.getElementById("demo").innerHTML=ages.find(checkAge)
}

cars.forEach(function(element, index, array) {
    console.log(element, index, array)
})

ages.forEach(function(element, index, array) {
    console.log(element,index,array)
})

const arrSu = cars.map(function(car, i) {
    return `${car}-${i}`
})
console.log(arrSu)