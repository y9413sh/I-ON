//클래스
// 1) 리터럴 방식
// 2) 함수 방식
// 3) 프로토타입 방식

const kingsmile = {
    firstName: '홍',
    lstName: '길동',
    getFullName: function() {
        return `${this.firstName} ${this.lstName}`
    }
}

console.log(kingsmile)
console.log(kingsmile.getFullName())

console.log('---------------------')

function user(first, last) {
    this.firstName=first
    this.lastName=last
    this.getFullName = function() {
        return `${this.firstName} ${this.lstName}`
    }
}

console.log('---------------------')

function user(first, last) {
    this.firstName=first
    this.lastName=last
    // this.getFullName = () => {
    //     return `${this.firstName} ${this.lstName}`
    // }
    this.getFullName = () => `${this.firstName} ${this.lstName}`
}

class Vehicle {
    constructor(name, whell) {
        this.name=name
        this.whell=whell
    }
}

const myVehicle = new Vehicle("운송수단", 2)
console.log(myVehicle)

class Bicycle extends Vehicle {
    constructor(name, wheel) {
        super(name, wheel)
    }
}

class Car extends Vehicle {
    constructor(name, wheel, license) {
        super(name, wheel)
        this.license=license
    }
}


// person.prototype.getFullName = () => `${this.firstName} ${this.lstName}`
// const person1= new person('yuna2', 'kim2')


const yuna = new user('yuna', 'Kim')
console.log(yuna.getFullName())




// const 인스턴스 = {
//     프로퍼티1 : 초기값,
//     프로퍼티2 : 초기값,
//     메소드1 : function() {

//     },
//     메소드2 : function() {

//     }
// }

// function 클래스이름() {
//     this.프로퍼티1 = 초기값;
//     this.프로퍼티2 = 초기값;
//     this.메소드1 = function() {

//     }

//     this.메소드2 = function() {

//     }
// }

// const 인스턴스 = new 클래스이름();

// function 클래스이름() {
//     this.프로퍼티1 : 초기값,
//     this.프로퍼티2 : 초기값,
//     클래스이름.prototype.메소드1 = function() {

//     }
//     클래스이름.prototype.메소드2 = function() {

//     }
// }

new Swiper('.')