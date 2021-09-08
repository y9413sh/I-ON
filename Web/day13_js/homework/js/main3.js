let ulEl = document.querySelector('.blank')

for(let i = 0; i < 10; i++){
  let li = document.createElement('li')
  li.textContent = `li-${i+1}`
  ulEl.appendChild(li)
}